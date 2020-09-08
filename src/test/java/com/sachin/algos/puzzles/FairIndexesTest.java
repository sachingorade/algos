package com.sachin.algos.puzzles;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FairIndexesTest {

    @Test
    void testSampleInput() {
        assertEquals(2, new FairIndexes().solution(new int[]{4, -1, 0, 3}, new int[]{-2, 5, 0, 3}));
        assertEquals(1, new FairIndexes().solution(new int[]{2, -2, -3, 3}, new int[]{0, 0, 4, -4}));
        assertEquals(0, new FairIndexes().solution(new int[]{4, -1, 0, 3}, new int[]{-2, 6, 0, 4}));
    }

}