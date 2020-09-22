package com.sachin.algos.puzzles.sorting;

import java.util.*;

public class DistinctInArray {

    public int solution(int[] A) {
        return simplestSolution(A);
    }

    public int simplestSolution(int[] A) {
        if (A.length == 0) {
            return 0;
        }
        int distinct = 1;
        Arrays.sort(A);
        int last = A[0];
        for (int i = 1; i < A.length; i++) {
            if (last != A[i]) {
                distinct++;
                last = A[i];
            }
        }
        return distinct;
    }

    public int anotherSolution(int[] A) {
        Set<Integer> set = new HashSet<>();
        for (int j : A) {
            set.add(j);
        }
        return set.size();
    }

}
