package com.sachin.algos.puzzles;

import java.util.Arrays;

public class MaxCounters {

    public int[] solution(int N, int[] A) {
        int base = 0, max = 0;
        int[] counters = new int[N];
        for (int i=0;i<A.length;i++) {
            if (A[i] <= N) {
                if (counters[A[i]-1] < base) {
                    counters[A[i]-1] = base + 1;
                } else {
                    counters[A[i] - 1]++;
                }
                if (counters[A[i] - 1] > max) {
                    max = counters[A[i]  - 1];
                }
            } else {
                base = max;
            }
        }
        for (int i=0;i<counters.length;i++) {
            if (counters[i] < base) {
                counters[i] = base;
            }
        }
        return counters;
    }

}