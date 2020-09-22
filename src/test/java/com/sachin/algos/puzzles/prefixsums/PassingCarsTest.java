package com.sachin.algos.puzzles.prefixsums;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PassingCarsTest {

    @Test
    void testSampleInput() {
        assertEquals(5, new PassingCars().solution(new int[]{0,1,0,1,1}));
    }

}