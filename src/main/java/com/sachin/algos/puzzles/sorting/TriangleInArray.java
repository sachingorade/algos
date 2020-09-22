package com.sachin.algos.puzzles.sorting;

import java.math.BigInteger;
import java.util.Arrays;

public class TriangleInArray {

    public int solution(int[] A) {
        Arrays.sort(A);
        for (int i = 0; i < A.length - 2; i++) {
            BigInteger sum = BigInteger.valueOf(A[i]).add(BigInteger.valueOf(A[i+1]));
            if (sum.compareTo(BigInteger.valueOf(A[i+2])) > 0) {
                return 1;
            }
        }
        return 0;
    }

}
