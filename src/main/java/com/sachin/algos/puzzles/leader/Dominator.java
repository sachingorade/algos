package com.sachin.algos.puzzles.leader;

import java.util.Arrays;

public class Dominator {

    public int solution(int[] A) {
        int[] H1 = Arrays.copyOf(A, A.length);
        Arrays.sort(H1);
        int size = 0;
        int dominatorValue = 0;
        int dominatorIndex = -1;
        for (int v : H1) {
            if (size == 0) {
                size++;
                dominatorValue = v;
            } else {
                if (v != dominatorValue) {
                    size--;
                } else {
                    size++;
                }
            }
        }
        if (size <= 0) {
            dominatorValue = -1;
        }
        int count = 0;
        for (int i = 0; i < H1.length; i++) {
            int v = A[i];
            if (v == dominatorValue) {
                count++;
                dominatorIndex = i;
            }
        }
        if (count >= H1.length / 2) {
            return dominatorIndex;
        }
        return -1;
    }

}
