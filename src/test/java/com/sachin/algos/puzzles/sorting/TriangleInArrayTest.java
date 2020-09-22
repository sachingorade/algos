package com.sachin.algos.puzzles.sorting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleInArrayTest {

    @Test
    void testSampleInput() {
        assertEquals(1, new TriangleInArray().solution(new int[]{10, 2, 5, 1, 8, 20}));
        assertEquals(1, new TriangleInArray().solution(new int[]{5, 8, 10}));
        assertEquals(1, new TriangleInArray().solution(new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE}));
    }

}