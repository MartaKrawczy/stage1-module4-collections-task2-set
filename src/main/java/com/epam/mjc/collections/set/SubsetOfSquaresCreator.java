package com.epam.mjc.collections.set;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SubsetOfSquaresCreator {

        public Set<Integer> createSubsetOfSquares (List < Integer > sourceList,int lowerBound, int upperBound){
           Set<Integer> setlist = new TreeSet<>();

            for (int i=0; i<sourceList.size(); i++) {
                if ((Math.pow(sourceList.get(i),2)>=lowerBound) && (Math.pow(sourceList.get(i),2)<=upperBound) ){
                    setlist.add((int) Math.pow(sourceList.get(i),2));
                }
            }
            return setlist;
        }
    }

