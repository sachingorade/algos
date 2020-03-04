package com.sachin.algos.puzzles;

public class TapeEquilibrium {

    public static int getMinDiff(int[] A) {
        int[] sums = getArraySums(A);
        int totalSumIndex = A.length - 1;
        return getMinDiff(sums, sums[totalSumIndex]);
    }

    private static int getMinDiff(int[] sums, int totalSum) {
        int currentDiff;
        int minSum = Integer.MAX_VALUE;
        for (int i=0;i<sums.length - 1;i++) {
            int remainingSum = totalSum - sums[i];
            currentDiff = Math.abs(sums[i] - remainingSum);
            if (currentDiff < minSum) {
                minSum = currentDiff;
            }
        }
        return minSum;
    }

    private static int[] getArraySums(int[] A) {
        int[] sums = new int[A.length];
        sums[0] = A[0];
        for (int i=1;i<sums.length;i++) {
            sums[i] = A[i] + sums[i - 1];
        }
        return sums;
    }
}
