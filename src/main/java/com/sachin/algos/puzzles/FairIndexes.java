package com.sachin.algos.puzzles;

public class FairIndexes {

    public int solution(int[] A, int[] B){
        return findFairIndexes(A, B);
    }

    // 1. Iterate over the elements
    // 2. Keep the sum of both arrays in hand and compare at every iteration
    // 3. If the sum is same then indexes are fair

    private int findFairIndexes(int[] A, int[] B) {
        int fairIndexCount = 0;
        int aSum = arraySum(A);
        int bSum = arraySum(B);
        int leftASum = A[0];
        int leftBSum = B[0];
        for (int i=1;i<A.length;i++) {
            int rightAPartSum = aSum - leftASum;
            int rightBPartSum = bSum - leftBSum;
            if (leftBSum == rightBPartSum && leftASum == leftBSum && rightAPartSum == rightBPartSum) {
                fairIndexCount++;
            }
            leftASum += A[i];
            leftBSum += B[i];
        }
        return fairIndexCount;
    }

    private int arraySum(int[] A) {
        int sum = 0;
        for (int j : A) {
            sum += j;
        }
        return sum;
    }

}
