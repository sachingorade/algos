package com.sachin.algos.puzzles.maxslice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxProfitTest {

    @Test
    void testSampleInput() {
        assertEquals(3, new MaxProfit().solution(new int[]{1, 2, 3, 4}));
        assertEquals(0, new MaxProfit().solution(new int[]{4, 3, 2, 1}));
        assertEquals(356, new MaxProfit().solution(new int[]{23171, 21011, 21123, 21366, 21013, 21367}));
    }

}