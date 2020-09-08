package com.sachin.algos.puzzles;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EqualDigitSumMinGreaterTest {

    @Test
    @Disabled
    void testSimpleInput() {
        assertEquals(-1, new EqualDigitSumMinGreater().solution(-1));
        assertEquals(0, new EqualDigitSumMinGreater().solution(0));
        assertEquals(10, new EqualDigitSumMinGreater().solution(1));
        assertEquals(37, new EqualDigitSumMinGreater().solution(28));
        assertEquals(743, new EqualDigitSumMinGreater().solution(734));
        assertEquals(2089, new EqualDigitSumMinGreater().solution(1990));
        assertEquals(10000, new EqualDigitSumMinGreater().solution(1000));
    }

}