package com.sachin.algos.puzzles;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinPositiveTest {

    @Test
    void testGivenExample() {
        assertEquals(5, new MinPositive().solution(new int[]{1, 3, 6, 4, 1, 2}));
        assertEquals(1, new MinPositive().solution(new int[]{-1, -3}));
    }

    @Test
    void testNormalCases() {
        assertEquals(1, new MinPositive().solution(new int[]{}));
        assertEquals(4, new MinPositive().solution(new int[]{1, 2, 3}));
    }

}