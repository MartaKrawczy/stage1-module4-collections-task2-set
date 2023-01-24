package com.epam.mjc.collections.set;

import java.util.*;
import java.util.stream.Collectors;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {

        Set<String> collect = firstSet.stream().filter(secondSet::contains).collect(Collectors.toSet());

        Set<String> collect1 = thirdSet.stream().filter(x -> !firstSet.contains(x)).filter(x -> !secondSet.contains(x)).collect(Collectors.toSet());
        for (String s : collect1) {
            if(collect.contains(s)){
                collect1.remove(s);
               collect.remove(s);
            }else {
                collect.add(s);
            }
        }
        return collect;
    }



}

