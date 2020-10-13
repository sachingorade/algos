package com.sachin.algos.puzzles.stackqueues;

import java.util.Stack;

public class StoneWall {

    public int solution(int[] H) {
        Stack<Integer> base = new Stack<>();
        int blockedRequired = 0;
        for (int newHeight : H) {
            if (base.isEmpty()) {
                // first case
                blockedRequired++;
                base.push(newHeight);
            } else {
                do {
                    int oldBase = base.peek();
                    if (oldBase > newHeight) {
                        base.pop();
                        if (base.isEmpty()) {
                            blockedRequired++;
                            base.push(newHeight);
                            break;
                        }
                    } else if (oldBase < newHeight) {
                        base.push(newHeight);
                        blockedRequired++;
                        break;
                    } else {
                        // both are same so nothing to do here
                        break;
                    }
                } while (true);
                // otherwise the element is same as top so we do not need another block
            }
        }
        return blockedRequired;
    }

}
