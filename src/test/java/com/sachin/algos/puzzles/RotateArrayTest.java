package com.sachin.algos.puzzles;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RotateArrayTest {

    @Test
    void testRotateArrays() {
        assertArrayEquals(new int[]{9,7,6,3,8}, RotateArray.rotateArray(new int[]{3,8,9,7,6}, 3));
        assertArrayEquals(new int[]{4,5,1,2,3}, RotateArray.rotateArray(new int[]{1,2,3,4,5}, 2));
        assertArrayEquals(new int[]{4,5,1,2,3}, RotateArray.rotateArray(new int[]{1,2,3,4,5}, 7));
        assertArrayEquals(new int[]{3,4,5,1,2}, RotateArray.rotateArray(new int[]{1,2,3,4,5}, 3));
        assertArrayEquals(new int[]{3,4,5,1,2}, RotateArray.rotateArray(new int[]{1,2,3,4,5}, 3));
    }

    @Test
    void testEdgeCases() {
        assertArrayEquals(new int[]{1, 2, 3, 4}, RotateArray.rotateArray(new int[]{1, 2, 3, 4}, 4));
        assertArrayEquals(new int[]{}, RotateArray.rotateArray(new int[]{}, 10));
    }

}