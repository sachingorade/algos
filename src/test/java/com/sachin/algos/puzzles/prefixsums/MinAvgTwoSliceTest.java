package com.sachin.algos.puzzles.prefixsums;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MinAvgTwoSliceTest {

    @Test
    void testSampleInput() {
        assertEquals(1, new MinAvgTwoSlice().solution(new int[] { 4, 2, 2, 5, 1, 5, 8 }));
    }
    
}
