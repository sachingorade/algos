package com.sachin.algos.puzzles;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TapeEquilibriumTest {

    @Test
    void testCases() {
        assertEquals(1, TapeEquilibrium.getMinDiff(new int[]{3,1,2,4,3}));
        assertEquals(0, TapeEquilibrium.getMinDiff(new int[]{1,1}));
    }

    @Test
    void testNegativeCases() {
        assertEquals(2000, TapeEquilibrium.getMinDiff(new int[]{-1000,1000}));
    }

}