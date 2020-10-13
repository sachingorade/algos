package com.sachin.algos.puzzles.stackqueues;

import java.util.Stack;

public class Nesting {

    // Time complexity: O(N), Space complexity: O(1)
    public int solution(String S) {
        int count = 0;
        for (int i=0;i<S.length();i++) {
            if (S.charAt(i) == '(') {
                count++;
            } else if (S.charAt(i) == ')') {
                if (count <= 0) {
                    return 0;
                }
                count--;
            }
        }
        return count == 0 ? 1 : 0;
    }

    // Time complexity : O(N), Space complexity: O(N)
    public int stackSolution(String S) {
        Stack<Character> stack = new Stack<>();
        for (int i=0;i<S.length();i++) {
            if (S.charAt(i) == '(') {
                stack.push('(');
            } else if (S.charAt(i) == ')') {
                if (stack.isEmpty()) {
                    return 0;
                }
                stack.pop();
            }
        }
        return stack.isEmpty() ? 1 : 0;
    }

}
