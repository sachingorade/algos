package com.sachin.algos.puzzles.stackqueues;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BracketsTest {

    @Test
    void testSampleInput() {
        assertEquals(1, new Brackets().solution("{[()()]}"));
        assertEquals(1, new Brackets().solution(""));
        assertEquals(1, new Brackets().solution("{}"));
        assertEquals(1, new Brackets().solution("[]"));
        assertEquals(1, new Brackets().solution("()"));
        assertEquals(1, new Brackets().solution("{[]}"));
        assertEquals(1, new Brackets().solution("{()}"));
        assertEquals(1, new Brackets().solution("[()]"));
        assertEquals(1, new Brackets().solution("()()()()()"));
        assertEquals(1, new Brackets().solution("[][][][]"));
        assertEquals(1, new Brackets().solution("{}{}{}{}"));
        assertEquals(0, new Brackets().solution("([)()]"));
        assertEquals(0, new Brackets().solution("("));
        assertEquals(0, new Brackets().solution(")"));
        assertEquals(0, new Brackets().solution("[)]"));
    }

}