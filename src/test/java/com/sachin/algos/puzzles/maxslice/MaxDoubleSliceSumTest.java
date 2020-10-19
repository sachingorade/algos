package com.sachin.algos.puzzles.maxslice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxDoubleSliceSumTest {

    @Test
    void testSampleInput() {
        assertEquals(17, new MaxDoubleSliceSum().solution(new int[]{3, 2, 6, -1, 4, 5, -1, 2}));
    }

}