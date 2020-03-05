package com.sachin.algos.puzzles;

import java.util.Arrays;

public class PermCheck {

    public int solution(int[] A) {
        Arrays.sort(A);
        if (A.length == 1 && A[0] != 1) {
            return 0;
        }
        for (int i=1;i<A.length;i++) {
            if (A[i] != i + 1) {
                return 0;
            }
        }
        return 1;
    }

}
