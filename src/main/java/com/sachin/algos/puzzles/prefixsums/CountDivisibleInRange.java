package com.sachin.algos.puzzles.prefixsums;

public class CountDivisibleInRange {

    public int solution(int A, int B, int K) {
        if (A == B) {
            return A % K == 0 ? 1 : 0;
        }
        int additionalDivCount = A % K == 0 ? 1 : 0;
        return (B / K) - (A / K) + additionalDivCount;
    }

}
