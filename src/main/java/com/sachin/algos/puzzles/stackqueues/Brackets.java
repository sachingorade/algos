package com.sachin.algos.puzzles.stackqueues;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Brackets {

    public Map<Character, Character> bracketMap;
    {
        bracketMap = new HashMap<>();
        bracketMap.put('(',')');
        bracketMap.put('{','}');
        bracketMap.put('[',']');
    }

    public int solution(String S) {
        if (S.isEmpty()) {
            return 1;
        }
        Stack<Character> characterStack = new Stack<>();
        for (int i=0; i < S.length(); i++) {
            Character ch = S.charAt(i);
            Character endBracket = bracketMap.get(ch);
            if (endBracket != null) {
                characterStack.push(endBracket);
            } else {
                Character lastChar = characterStack.isEmpty() ? null : characterStack.pop();
                if (lastChar == null || !lastChar.equals(ch)) {
                    return 0;
                }
            }
        }
        return characterStack.isEmpty() ? 1 : 0;
    }

}
