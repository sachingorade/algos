package com.sachin.algos.puzzles.stackqueues;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EvalSimpleExpressionsTest {

    @Test
    void testEvalSampleInput() {
        assertEquals(2, new EvalSimpleExpressions().solution("1-1+2"));
        assertEquals(4, new EvalSimpleExpressions().solution("1-1+2-3-5+10"));
        assertEquals(4, new EvalSimpleExpressions().solution("1-1+(2-3-5)+10"));
        assertEquals(4, new EvalSimpleExpressions().solution("1-1+(2-3-(5)+10)"));
        assertEquals(-16, new EvalSimpleExpressions().solution("1-1+(2-3)-(5+10)"));
    }

}