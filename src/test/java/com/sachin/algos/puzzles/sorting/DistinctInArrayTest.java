package com.sachin.algos.puzzles.sorting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DistinctInArrayTest {

    @Test
    void testSampleInput() {
        assertEquals(3, new DistinctInArray().solution(new int[]{2, 1, 1, 2, 3, 1}));
        assertEquals(0, new DistinctInArray().solution(new int[]{}));
    }

}