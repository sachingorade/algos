package com.sachin.algos.puzzles.primeandcomposites;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinPerimeterRectangleTest {

    @Test
    void testSampleInput() {
        assertEquals(22, new MinPerimeterRectangle().solution(30));
        assertEquals(32, new MinPerimeterRectangle().solution(64));
    }

}