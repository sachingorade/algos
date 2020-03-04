package com.sachin.algos.puzzles;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FrogRiverOneTest {

    @Test
    void testNormalInputCases() {
        assertEquals(6, FrogRiverOne.getMinTimeToCrossRiver(5, new int[]{1, 3, 1, 4, 2, 3, 5, 4}));
        assertEquals(2, FrogRiverOne.getMinTimeToCrossRiver(3, new int[]{1, 3, 2, 0, 2, 3, 5, 4}));
        assertEquals(4, FrogRiverOne.getMinTimeToCrossRiver(3, new int[]{0, 1, 2, 1, 3, 3, 5, 4}));
    }

    @Test
    void testEdgeCases() {
        assertEquals(-1, FrogRiverOne.getMinTimeToCrossRiver(3, new int[]{0, 0, 0, 1}));
        assertEquals(-1, FrogRiverOne.getMinTimeToCrossRiver(3, new int[]{}));
    }

}