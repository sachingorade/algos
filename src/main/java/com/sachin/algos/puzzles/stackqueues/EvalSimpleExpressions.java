package com.sachin.algos.puzzles.stackqueues;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class EvalSimpleExpressions {

    public int solution(String S) {
        return parseInput(S);
    }

    private int parseInput(String S) {
        LinkedList<Integer> values = new LinkedList<>();
        Queue<Character> ops = new LinkedList<>();
        StringBuilder expr = new StringBuilder();
        StringBuilder innerExpr = null;
        Stack<Character> brackets = new Stack<>();
        for (int i=0;i<S.length();i++) {
            char curChar = S.charAt(i);
            if (innerExpr != null) {
                if (curChar == '(') {
                    brackets.push(')');
                } else if (curChar == ')') {
                    brackets.pop();
                    if (brackets.isEmpty()) {
                        expr.append(parseInput(innerExpr.toString()));
                        innerExpr = null;
                    }
                } else {
                    innerExpr.append(curChar);
                }
            } else if (curChar == '(') {
                innerExpr = new StringBuilder();
                brackets.push(')');
            } else if (curChar == '+' || curChar == '-') {
                values.add(Integer.parseInt(expr.toString()));
                ops.offer(curChar);
                expr = new StringBuilder();
            } else {
                expr.append(curChar);
            }
        }
        if (expr.length() > 0) {
            values.add(Integer.parseInt(expr.toString()));
        }
        return eval(values, ops);
    }

    private int eval(LinkedList<Integer> values, Queue<Character> ops) {
        while (values.size() > 1) {
            Integer val1 = values.poll();
            Integer val2 = values.poll();
            if (val2 == null || ops.size() == 0) {
                throw new IllegalStateException("Not expected");
            }
            switch (ops.poll()) {
                case '+':
                    values.add(0, val1 + val2);
                    break;
                case '-':
                    values.add(0, val1 - val2);
                    break;
                default:
                    throw new IllegalStateException();
            }
        }
        return values.poll();
    }

}
