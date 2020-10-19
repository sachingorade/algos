package com.sachin.algos.puzzles.maxslice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxSliceSumTest {

    @Test
    void testSampleInput() {
        assertEquals(5, new MaxSliceSum().solution(new int[]{3, 2, -6, 4, 0}));
        assertEquals(1, new MaxSliceSum().solution(new int[]{-2, 1}));
    }

}