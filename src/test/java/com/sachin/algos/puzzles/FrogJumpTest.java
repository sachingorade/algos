package com.sachin.algos.puzzles;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FrogJumpTest {

    @Test
    void testGetMinJumpsCount() {
        assertEquals(3, FrogJump.getMinJumps(10, 85, 30));
    }

    @Test
    void testMinJumpsForVeryLargeNumber() {
        assertEquals(100, FrogJump.getMinJumps(10, 1000000000, 10000000));
    }

}