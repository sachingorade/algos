package com.sachin.algos.puzzles;

/**
 * Problem statement: https://app.codility.com/programmers/lessons/3-time_complexity/frog_jmp/
 */
public class FrogJump {

    public static int getMinJumps(int x, int y, int j) {
        int diff = y - x;
        int exact = diff % j;
        return (diff / j) + (exact == 0 ? 0 : 1);
    }

}
