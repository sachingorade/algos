package com.sachin.algos.puzzles;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryGapTest {

    @Test
    void testCorrectnessForValidGaps() {
        assertEquals(2, BinaryGap.getMaxBinaryGap(9));
        assertEquals(4, BinaryGap.getMaxBinaryGap(529));
        assertEquals(5, BinaryGap.getMaxBinaryGap(1041));
    }

    @Test
    void testEdgeCases() {
        assertEquals(1, BinaryGap.getMaxBinaryGap(20));
        assertEquals(0, BinaryGap.getMaxBinaryGap(15));
        assertEquals(0, BinaryGap.getMaxBinaryGap(32));
    }

}