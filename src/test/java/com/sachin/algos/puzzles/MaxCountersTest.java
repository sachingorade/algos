package com.sachin.algos.puzzles;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MaxCountersTest {

    @Test
    void testMaxCountersExample() {
        assertArrayEquals(new int[]{3, 2, 2, 4, 2}, new MaxCounters().solution(5, new int[]{3, 4, 4, 6, 1, 4, 4}));
        assertArrayEquals(new int[]{3, 4, 3}, new MaxCounters().solution(3, new int[]{1, 2, 1, 4, 1, 5, 2}));
        assertArrayEquals(new int[]{3, 4, 0}, new MaxCounters().solution(3, new int[]{1, 2, 1, 2, 2, 2, 1}));
    }

}