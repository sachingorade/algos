package com.sachin.algos.puzzles.prefixsums;

public class MinAvgTwoSlice {

    public int solution(int[] A) {
        int start = 0;
        float minSum = Float.MAX_VALUE;
        for (int i = 0; i < A.length - 1; i++) {
            float sumOf2 = (A[i] + A[i + 1]) / 2f;
            if (sumOf2 < minSum) {
                minSum = sumOf2;
                start = i;
            } else if (i < A.length - 2) {
                float sumOf3 = (A[i] + A[i + 1] + A[i + 2]) / 3f;
                if (sumOf3 < minSum) {
                    minSum = sumOf3;
                    start = i;
                }
            }
        }
        return start;
    }

    // First simplest solution
    // We need to find the slice with minimum average, so we need
    // 1. Prefix sum to calculate sums of range very fast
    // 2. Iterate over all combinations to find min average
    public int simplestSolution(int[] A) {
        float[] prefixSums = prefixSum(A);
        float minAverage = Integer.MAX_VALUE;
        float sliceAvg = 0;
        int minStart = 0;
        int start = 0;
        int end = 0;
        while (start < A.length - 1) {
            end = start + 1;
            while (end < A.length) {
                sliceAvg = (prefixSums[end + 1] - prefixSums[start]) / ((end - start) + 1);
                if (sliceAvg < minAverage) {
                    minAverage = sliceAvg;
                    minStart = start;
                }
                end++;
            }
            start++;
        }
        return minStart;
    }

    public float[] prefixSum(int[] A) {
        float[] sums = new float[A.length + 1];
        sums[0] = 0;
        for (int i=0;i<=A.length;i++) {
            sums[i+1] = A[i] + sums[i];
        }
        return sums;
    }

}
