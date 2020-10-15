package com.sachin.algos.puzzles.leader;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EquiLeaderTest {

    @Test
    void testSampleInput() throws Exception {
        assertEquals(2, new EquiLeader().solution(new int[]{4, 3, 4, 4, 4, 2}));
        assertEquals(1, new EquiLeader().solution(new int[]{4, 4}));
        assertEquals(0, new EquiLeader().solution(new int[]{4}));
    }

}