package com.sachin.algos.ds.sums;

import java.util.Arrays;

public class PrefixSum {

    public long[] getPrefixSum(int[] input, boolean log) {
        long[] pSums = new long[input.length + 1];
        for (int i = 1; i <= input.length; i++) {
            pSums[i] = pSums[i - 1] + input[i - 1];
        }
        if (log) {
            System.out.println("Input : \t " + Arrays.toString(input));
            System.out.println("pSum : \t " + Arrays.toString(pSums));
        }
        return pSums;
    }

    public long[] getPrefixSum(int[] input) {
        return getPrefixSum(input, false);
    }

    public long getSubArraySum(int[] input, int indexFrom, int indexTo) {
        return getSubArraySum(input, indexFrom, indexTo, false);
    }

    public long getSubArraySum(int[] input, int indexFrom, int indexTo, boolean log) {
        long[] pSums = getPrefixSum(input, log);
        if (indexFrom < 0 || indexTo >= input.length) {
            throw new IllegalArgumentException(String.format("Invalid range:[%d-%d]", indexFrom, indexTo));
        }
        return pSums[indexTo + 1] - pSums[indexFrom];
    }

}
