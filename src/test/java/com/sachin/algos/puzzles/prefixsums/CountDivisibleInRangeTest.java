package com.sachin.algos.puzzles.prefixsums;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountDivisibleInRangeTest {

    @Test
    void testSimpleInput() {
        assertEquals(3, new CountDivisibleInRange().solution(6, 11, 2));
        assertEquals(20, new CountDivisibleInRange().solution(11, 345, 17));
    }

    @Test
    void testExtremeValues() {
        assertEquals(2147483647, new CountDivisibleInRange().solution(0, Integer.MAX_VALUE-1, 1));
        assertEquals(1230, new CountDivisibleInRange().solution(101, 12300000, 10000));
    }

}