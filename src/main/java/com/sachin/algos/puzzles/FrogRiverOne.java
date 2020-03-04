package com.sachin.algos.puzzles;

import java.util.HashSet;
import java.util.Set;

public class FrogRiverOne {

    public static int getMinTimeToCrossRiver(int X, int[] A) {
        if (X > A.length) {
            return -1;
        }
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < A.length; i++) {
            if (A[i] != 0 && A[i] <= X) {
                set.add(A[i]);
            }
            if (set.size() == X) {
                return i;
            }
        }
        return -1;
    }

}
