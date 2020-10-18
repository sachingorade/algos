package com.sachin.algos.puzzles.maxslice;

public class MaxProfit {

    public int solution(int[] A) {
        if (A.length == 0) {
            return 0;
        }
        long buyPrice = A[0], sellPrice, maxProfit = 0;
        for (int i = 1; i < A.length; i++) {
            sellPrice = A[i];
            maxProfit = Math.max(maxProfit, sellPrice - buyPrice);
            buyPrice = Math.min(buyPrice, sellPrice);
        }
        return (int) maxProfit;
    }

}
