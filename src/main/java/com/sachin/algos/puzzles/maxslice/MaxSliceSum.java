package com.sachin.algos.puzzles.maxslice;

public class MaxSliceSum {

    public int solution(int[] A) {
        if (A.length == 1) {
            return A[0];
        }
        long lastSum = A[0], maxSum = A[0];
        for (int i=1;i<A.length;i++) {
            lastSum = Math.max(lastSum + A[i], A[i]);
            maxSum = Math.max(lastSum, maxSum);
        }
        return (int) maxSum;

    }
}
