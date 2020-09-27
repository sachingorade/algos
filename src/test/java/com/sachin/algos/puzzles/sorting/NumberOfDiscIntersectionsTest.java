package com.sachin.algos.puzzles.sorting;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@Disabled
class NumberOfDiscIntersectionsTest {

    @Test
    void testSampleInput() {
        assertEquals(0, new NumberOfDiscIntersections().solution(new int[]{10}));
        assertEquals(11, new NumberOfDiscIntersections().solution(new int[]{1,5,2,1,4,0}));
    }

}