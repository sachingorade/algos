package com.sachin.algos.puzzles.leader;

import java.util.Arrays;

public class EquiLeader {

    public int solution(int[] A) {
        Integer leaderValue = findLeader(A);
        if (leaderValue == null) {
            return 0;
        }
        int leaderCount = countLeader(A, leaderValue);
        int equiLeaders = 0;
        int leftLeaderCount = 0;
        for (int i=0;i<A.length;i++) {
            if (A[i] == leaderValue) {
                leftLeaderCount++;
            }
            if (leftLeaderCount > (i+1)/2) {
                int rightLeaderCount = leaderCount - leftLeaderCount;
                int remainingArraySize = (A.length - i - 1) / 2;
                if (rightLeaderCount > remainingArraySize) {
                    equiLeaders++;
                }
            }
        }
        return equiLeaders;
    }

    private int countLeader(int[] A, int leader) {
        int count = 0;
        for (int j : A) {
            if (leader == j) {
                count++;
            }
        }
        return count;
    }

    private Integer findLeader(int[] A) {
        int[] B = Arrays.copyOf(A, A.length);
        Arrays.sort(B);
        int leader = -1;
        int sum = 0;
        for (int i=0;i<A.length;i++) {
            if (sum == 0) {
                leader = B[i];
                sum++;
            } else {
                if (leader == B[i]) {
                    sum++;
                } else {
                    sum--;
                }
            }
        }
        int count = 0;
        if (sum > 0) {
            for (int i=0;i<A.length;i++) {
                if (B[i] == leader) {
                    count++;
                }
            }
        }
        return count > B.length/2 ? leader : null;
    }

}
