package com.sachin.algos.puzzles;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PermMissingElemTest {

    @Test
    void testFindMissingElement() {
        assertEquals(4, PermMissingElem.findMissingElement(new int[]{2, 3, 1, 5}));
        assertEquals(1, PermMissingElem.findMissingElement(new int[]{2, 3, 4, 5}));
        assertEquals(2, PermMissingElem.findMissingElement(new int[]{1, 3}));
    }

    @Test
    void testEdgeCases() {
        assertEquals(2, PermMissingElem.findMissingElement(new int[]{1}));
        assertEquals(1, PermMissingElem.findMissingElement(new int[]{}));
    }

    @Test
    void testFindMissingElementOpt() {
        assertEquals(4, PermMissingElem.findMissingElementOpt(new int[]{2, 3, 1, 5}));
        assertEquals(1, PermMissingElem.findMissingElementOpt(new int[]{2, 3, 4, 5}));
        assertEquals(2, PermMissingElem.findMissingElementOpt(new int[]{1, 3}));
    }

    @Test
    void testEdgeCasesOpt() {
        assertEquals(2, PermMissingElem.findMissingElementOpt(new int[]{1}));
        assertEquals(1, PermMissingElem.findMissingElementOpt(new int[]{}));
    }

}