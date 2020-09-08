package com.sachin.algos.puzzles;

import java.util.Arrays;

public class PermMissingElem {

    /**
     * Time complexity - O(n log n)
     * Space complexity - O(1)
     * @param numbers int array
     * @return missing number
     */
    public static int findMissingElement(int[] numbers) {
        Arrays.sort(numbers);
        for (int i=0;i<numbers.length;i++) {
            if (numbers[i] != (i + 1)) {
                return i + 1;
            }
        }
        return numbers.length + 1;
    }

    /**
     * Time complexity - O(n)
     * Space complexity - O(1)
     * @param numbers int array
     * @return missing number
     */
    public static int findMissingElementOpt(int[] numbers) {
        long sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        long n = numbers.length + 1;
        long requiredSum = (n * (n+1) / 2);
        return (int)(requiredSum - sum);
    }

}
