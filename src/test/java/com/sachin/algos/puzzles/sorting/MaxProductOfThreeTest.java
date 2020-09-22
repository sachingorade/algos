package com.sachin.algos.puzzles.sorting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxProductOfThreeTest {

    @Test
    void testSampleInput() {
        assertEquals(60, new MaxProductOfThree().solution(new int[]{-3, 1, 2, -2, 5, 6}));
        assertEquals(0, new MaxProductOfThree().solution(new int[]{-3, -2, -1, 0}));
        assertEquals(-80, new MaxProductOfThree().solution(new int[]{-10, -2, -4}));
        assertEquals(125, new MaxProductOfThree().solution(new int[]{-5, 5, -5, 4}));
        assertEquals(120, new MaxProductOfThree().solution(new int[]{-4, -6, 3, 4, 5}));
    }

}