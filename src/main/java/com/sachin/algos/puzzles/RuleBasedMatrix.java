package com.sachin.algos.puzzles;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class RuleBasedMatrix {

    /*
    U is the sum of row 0
    L is the sum of row 1
    C represents the sum of column values at index k

    e.g.
    U=3, L=2 and C=[2,1,1,0,1]

    prepare a matrix that satisfies this criteria
    [1,1,0,0,1]
    [1,0,1,0,0]

    [1,0,0,0,0]
    [1,0,0,0,0]

     */

    public List<String> solution(int U, int L, int[] C) {
        int[] row0 = new int[C.length];
        int[] row1 = new int[C.length];

        List<Integer> toggleIndexes = new LinkedList<>();

        int row0Sum = 0;
        int row1Sum = 0;
        for (int i=0;i<C.length;i++) {
            boolean isIndexFilled = false;
            if (C[i] == 2) {
                row0[i] = row1[i] = 1;
                row0Sum++;
                row1Sum++;
            } else if (C[i] == 1) {
                toggleIndexes.add(i);
                if (row0Sum < U) {
                    row0[i] = 1;
                    row0Sum++;
                    isIndexFilled = true;
                }
                if (!isIndexFilled && row1Sum < L) {
                    row1[i] = 1;
                    row1Sum++;
                }
            }
        }

        boolean foundValidCombination = false;
        List<String> validCombinations = new LinkedList<>();
        for (int i=0;i<toggleIndexes.size();i++) {
            for (Integer indexValue : toggleIndexes) {
                String combination = getString(row0) + "," + getString(row1);
                if (validateRule(row0, U) && validateRule(row1, L) && !validCombinations.contains(combination)) {
                    foundValidCombination = true;
                    validCombinations.add(combination);
                } else {
                    int tmp = row0[indexValue];
                    row0[indexValue] = row1[indexValue];
                    row1[indexValue] = tmp;
                }
            }
        }
        System.out.println(validCombinations);

        if (foundValidCombination) {
            return validCombinations;
        }
        return Collections.singletonList("IMPOSSIBLE");
    }

    private boolean validateRule(int[] A, int rule) {
        int sum = 0;
        for (int a : A) {
            sum += a;
        }
        return sum == rule;
    }

    private String getString(int[] A) {
        StringBuilder builder = new StringBuilder();
        for (int a : A) {
            builder.append(a);
        }
        return builder.toString();
    }

}
