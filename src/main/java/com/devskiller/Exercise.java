package com.devskiller;

import java.util.*;

public class Exercise {

    public List<Integer> findDuplicates(List<Integer> integers, int numberOfDuplicates) {
        List<Integer> listOfRepeatedNumbers = new ArrayList<Integer>();

        for (int i = 0; integers.size() > i; i++) {
            if (integers.get(i) != null) {
                int accualnumber = integers.get(i);

                for (int j = 0; integers.size() > j; j++) {
                    if (i != j) {

                        if (accualnumber == integers.get(j)) {
                            listOfRepeatedNumbers.add(accualnumber);
                        }
                    }
                }
            }
        }

        return new HashSet<Integer>(listOfRepeatedNumbers).stream().toList();
    }

}
