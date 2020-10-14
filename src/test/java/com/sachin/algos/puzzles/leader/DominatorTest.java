package com.sachin.algos.puzzles.leader;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DominatorTest {

    @Test
    void testSampleInput() {
        assertEquals(4, new Dominator().solution(new int[]{4, 6, 6, 6, 6, 8, 8}));
        assertEquals(7, new Dominator().solution(new int[]{3, 4, 3, 2, 3, -1, 3, 3}));
        assertEquals(6, new Dominator().solution(new int[]{3, 3, 3, -1, -1, -1, -1, 2}));
        assertEquals(2, new Dominator().solution(new int[]{1, 2, 1}));
    }

}