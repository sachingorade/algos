package com.sachin.algos.puzzles;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OddOccurrencesInArrayTest {

    @Test
    void testFindOddInArray() {
        assertEquals(7, OddOccurrencesInArray.findOddElement(new int[]{9,3,9,3,9,7,9}));
    }

}