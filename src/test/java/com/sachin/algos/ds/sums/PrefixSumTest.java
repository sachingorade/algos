package com.sachin.algos.ds.sums;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrefixSumTest {

    @Test
    void testSimplePrefixSum() {
        assertArrayEquals(new long[]{0, 1, 3}, new PrefixSum().getPrefixSum(new int[]{1, 2}));
        assertArrayEquals(new long[]{0, 1, 3, 6, 10, 15}, new PrefixSum().getPrefixSum(new int[]{1, 2, 3, 4, 5}));
        assertArrayEquals(new long[]{0}, new PrefixSum().getPrefixSum(new int[]{}));
    }

    @Test
    void testSubArraySum() {
        assertEquals(9, new PrefixSum().getSubArraySum(new int[]{1, 2, 3, 4}, 1, 3));
        assertEquals(5, new PrefixSum().getSubArraySum(new int[]{1, 2, 3, 4, 5, 6}, 1, 2));
        assertEquals(12, new PrefixSum().getSubArraySum(new int[]{1, 2, 3, 4, 5, 6}, 2, 4));
        assertEquals(5, new PrefixSum().getSubArraySum(new int[]{2, 3, 7, 5, 1, 3, 9}, 0, 1, true));
    }

}