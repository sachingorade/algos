package com.sachin.algos.puzzles;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PermCheckTest {

    @Test
    void testGivenExample() {
        assertEquals(1, new PermCheck().solution(new int[]{4, 1, 3, 2}));
        assertEquals(0, new PermCheck().solution(new int[]{4, 1, 3}));
    }

    @Test
    void testCustomExamples() {
        assertEquals(0, new PermCheck().solution(new int[]{4, 3, 2}));
        assertEquals(0, new PermCheck().solution(new int[]{4, 3, 5}));
        assertEquals(1, new PermCheck().solution(new int[]{1, 2, 4, 3, 5}));
        assertEquals(0, new PermCheck().solution(new int[]{4, 3, 6}));
        assertEquals(0, new PermCheck().solution(new int[]{1, 3}));
    }

    @Test
    void testEndCases() {
        assertEquals(1, new PermCheck().solution(new int[]{1}));
        assertEquals(0, new PermCheck().solution(new int[]{Integer.MAX_VALUE}));
    }

}