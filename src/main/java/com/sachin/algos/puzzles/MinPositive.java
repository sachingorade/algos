package com.sachin.algos.puzzles;

import java.util.Arrays;

public class MinPositive {

    public int solution(int[] A) {
        Arrays.sort(A);
        int minPositive = 1;
        for (int value : A) {
            if (minPositive == value) {
                minPositive++;
            }
        }
        return minPositive;
    }

}
