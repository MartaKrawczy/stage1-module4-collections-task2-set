package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer>create = new HashSet<Integer>(sourceList);
        int sum;
        for (int i = 0 ; i<sourceList.size(); i++) {
           if( sourceList.get(i)%2 == 0){
               create.add(sourceList.get(i));
               sum = sourceList.get(i);
               while (sum % 2 == 0) {
                  sum = sum /2 ;
                   create.add(sum);
               }
           }
           else {
               create.add(sourceList.get(i));
               create.add(sourceList.get(i)*2);
           }
        }
        return create;
    }
}
