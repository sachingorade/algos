package com.sachin.algos.puzzles.primeandcomposites;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountFactorsTest {

    @Test
    void testSampleInput() {
        assertEquals(8, new CountFactors().solution(24));
        assertEquals(0, new CountFactors().solution(0));
        assertEquals(0, new CountFactors().solution(-10));
        assertEquals(1, new CountFactors().solution(1));
    }

}