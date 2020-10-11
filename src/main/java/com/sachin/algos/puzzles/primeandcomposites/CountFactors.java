package com.sachin.algos.puzzles.primeandcomposites;

public class CountFactors {

    public int solution(int N) {
        return squareRootBasedSolution(N);
    }

    // Time complexity O(N)
    public int bruteForceSolution(int N) {
        int numFactors = 2; // 1 and the number itself
        for (int i=2;i<=N/2;i++) {
            if (N % i == 0) {
                numFactors++;
            }
        }
        return numFactors;
    }

    // Formula based
    public int squareRootBasedSolution(int N) {
        int sqrN = (int) Math.sqrt(N);
        int numFactors = 0;
        while (sqrN > 0) {
            if (N % sqrN == 0) {
                if ((N/sqrN) == sqrN) {
                    numFactors++; // perfect square
                } else {
                    numFactors+= 2;
                }
            }
            sqrN--;
        }
        return numFactors;
    }

}
