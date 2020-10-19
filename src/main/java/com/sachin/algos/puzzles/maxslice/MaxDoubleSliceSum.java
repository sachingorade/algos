package com.sachin.algos.puzzles.maxslice;

public class MaxDoubleSliceSum {

    public int solution(int[] A) {
        int[] max1 = new int[A.length];
        int[] max2 = new int[A.length];
        int maxSum = 0;

        for (int i = 1; i < A.length - 1; i++) {
            max1[i] = Math.max(0, max1[i - 1] + A[i]);
        }

        for (int i = A.length - 2; i > 0; i--) {
            max2[i] = Math.max(0, max2[i + 1] + A[i]);
        }

        for (int i = 1; i < A.length - 1; i++) {
            maxSum = Math.max(maxSum, max1[i - 1] + max2[i + 1]);
        }

        return maxSum;
    }

}
