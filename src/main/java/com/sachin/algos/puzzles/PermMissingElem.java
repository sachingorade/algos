package com.sachin.algos.puzzles;

import java.util.Arrays;

public class PermMissingElem {

    public static int findMissingElement(int[] numbers) {
        Arrays.sort(numbers);
        for (int i=0;i<numbers.length;i++) {
            if (numbers[i] != (i + 1)) {
                return i + 1;
            }
        }
        return numbers.length + 1;
    }

}
