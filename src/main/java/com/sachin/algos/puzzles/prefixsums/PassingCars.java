package com.sachin.algos.puzzles.prefixsums;

public class PassingCars {

    public int solution(int[] A) {
        return singleTraversalSolution(A);
    }

    /**
     * Simplest solution would be to count the number of pair of (0, 1) starting from the index where 0 is found.
     * @param A input array
     * @return passing cars
     */
    private int simplestSolution(int[] A) {
        int passingCars = 0;
        for (int i=0;i<A.length;i++) {
            if (A[i] == 0) {
                passingCars += countPassingCars(A, i + 1);
            }
        }
        return passingCars;
    }

    private int countPassingCars(int[] A, int startIndex) {
        int localPassingCars = 0;
        for (int i=startIndex;i<A.length;i++) {
            if (A[i] == 1) {
                localPassingCars++;
            }
        }
        return localPassingCars;
    }

    // O(n) solution
    public int singleTraversalSolution(int[] A) {
        int oneCount = 0;
        int passingCars = 0;
        for (int i=A.length-1;i>=0;i--) {
            if (A[i] == 1) {
                oneCount++;
            } else {
                passingCars += oneCount;
                if (passingCars > 1000000000) {
                    return -1;
                }
            }
        }
        return passingCars;
    }

}
