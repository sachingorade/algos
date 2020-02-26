package com.sachin.algos.puzzles;

public class BinaryGap {

    public static int getMaxBinaryGap(int number) {
        return getGapUsingFirstApproach(number);
    }

    private static int getGapUsingFirstApproach(int number) {
        String binaryNumber = Integer.toBinaryString(number);
        int lastCharIndex = binaryNumber.length() - 1;
        int maxGap = 0, currentGap = 0;
        for (int i=1;i< lastCharIndex;i++) {
            if (binaryNumber.charAt(i) == '0') {
                currentGap++;
            } else {
                maxGap = Math.max(currentGap, maxGap);
                currentGap = 0;
            }
        }
        if (binaryNumber.charAt(lastCharIndex) == '1') {
            maxGap = Math.max(currentGap, maxGap);
        }
        return maxGap;
    }

}
