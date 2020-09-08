package com.sachin.algos.puzzles;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RuleBasedMatrixTest {

    @Test
    void testSampleRules() {
        assertTrue(new RuleBasedMatrix().solution(3, 2, new int[]{2,1,1,0,1}).contains("11001,10100"));
    }

}