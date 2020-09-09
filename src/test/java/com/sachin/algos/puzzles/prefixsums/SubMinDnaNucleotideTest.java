package com.sachin.algos.puzzles.prefixsums;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class SubMinDnaNucleotideTest {

    @Test
    void testSimple() {
        assertArrayEquals(new int[]{2, 4, 1}, new SubMinDnaNucleotide().solution("CAGCCTA", new int[]{2, 5, 0}, new int[]{4, 5, 6}));
        assertArrayEquals(new int[]{3, 3, 3}, new SubMinDnaNucleotide().solution("GGGGGGG", new int[]{2, 5, 0}, new int[]{4, 5, 6}));
    }

    @Test
    void testInvalidInput() {
        assertThrows(IllegalArgumentException.class, () -> new SubMinDnaNucleotide().solution("CCGGAATT", new int[]{1}, new int[]{}));
    }

}