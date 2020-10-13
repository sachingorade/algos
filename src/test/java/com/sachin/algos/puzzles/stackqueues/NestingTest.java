package com.sachin.algos.puzzles.stackqueues;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NestingTest {

    @Test
    void testSampleInput() {
        assertEquals(1, new Nesting().solution("(()())"));
        assertEquals(0, new Nesting().solution(")"));
        assertEquals(1, new Nesting().solution(""));
        assertEquals(1, new Nesting().solution("()"));
        assertEquals(1, new Nesting().solution("(()(())())"));
        assertEquals(0, new Nesting().solution("())"));
    }

}