package com.sachin.algos.puzzles.sorting;

import java.util.Arrays;

public class MaxProductOfThree {

    public int solution(int[] A) {
        Arrays.sort(A);
        int lastElem = A.length - 1;
        return Math.max(A[0] * A[1] * A[lastElem], A[lastElem] * A[lastElem - 1] * A[lastElem - 2]);
    }

}
