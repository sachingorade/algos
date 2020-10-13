package com.sachin.algos.puzzles.stackqueues;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StoneWallTest {

    @Test
    void testSampleInput() {
        assertEquals(7, new StoneWall().solution(new int[]{8, 8, 5, 7, 9, 8, 7, 4, 8}));
    }

}