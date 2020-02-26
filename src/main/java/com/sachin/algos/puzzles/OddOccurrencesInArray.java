package com.sachin.algos.puzzles;

import java.util.HashMap;
import java.util.Map;

public class OddOccurrencesInArray {

    public static int findOddElement(int[] numbers) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : numbers) {
            if (map.put(i, i) != null) {
                map.remove(i);
            }
        }
        return map.values().iterator().next();
    }

}
