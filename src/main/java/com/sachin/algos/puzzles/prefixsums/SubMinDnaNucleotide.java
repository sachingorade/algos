package com.sachin.algos.puzzles.prefixsums;

/***
 * GenomicRangeQuery problem:
 *
 * Nucleotides of types A, C, G and T have impact factors of 1, 2, 3 and 4, respectively.
 *
 * For example, given the string S = CAGCCTA and arrays P, Q such that:
 *     P[0] = 2    Q[0] = 4
 *     P[1] = 5    Q[1] = 5
 *     P[2] = 0    Q[2] = 6
 * the function should return the values [2, 4, 1], as explained above.
 */
public class SubMinDnaNucleotide {

    public int[] solution(String S, int[] P, int[] Q) {
//        return simpleSolution(S, P, Q);
        return optimizedSolution(S, P, Q);
    }

    // Lets start with the simplest solution

    /**
     * 1. We have input String which contains DNA nucleotides
     * 2. We have 2 arrays which both combined contains queries to be performed on the given DNA sequence
     * 3. For each query we need to find minimal impact factor i.e. minimal value from the segment of the String
     * <p>
     * 1. For each query perform index look up
     * 2. Find the minimal value
     * 3. Store in result array
     * <p>
     * Input = CAGCCTA
     * Impact factor map = [2, 1, 3, 2, 2, 4, 1]
     * <p>
     * 2 to 4: 2
     * 5 to 5: 4
     * 0 to 6: 1
     * <p>
     * <p>
     * Time complexity : O(n*m)
     */
    private int[] simpleSolution(String S, int[] P, int[] Q) {
        if (P.length != Q.length) {
            throw new IllegalArgumentException("P and Q size does not match");
        }

        int[] impactFactorMap = new int[S.length()];
        for (int i = 0; i < S.length(); i++) {
            impactFactorMap[i] = getImpactFactor(S.charAt(i));
        }
        int[] result = new int[P.length];

        for (int i = 0; i < P.length; i++) {
            int indexFrom = P[i];
            int indexTo = Q[i];
            int minImpactFactor = Integer.MAX_VALUE;

            do {
                int min = Math.min(impactFactorMap[indexFrom], impactFactorMap[indexTo]);
                if (min < minImpactFactor) {
                    minImpactFactor = min;
                }
                indexFrom++;
                indexTo--;
            } while (indexFrom < indexTo && minImpactFactor > 1);

            result[i] = minImpactFactor;
        }

        return result;
    }

    private int getImpactFactor(char c) {
        if (c == 'A') {
            return 1;
        }
        if (c == 'C') {
            return 2;
        }
        if (c == 'G') {
            return 3;
        }
        if (c == 'T') {
            return 4;
        }
        throw new IllegalArgumentException("Invalid char:" + c);
    }


    /**
     * <p>
     * Input = CAGCCTA
     * Impact factor map = [2, 1, 3, 2, 2, 4, 1]
     * <p>
     * 2 to 4: 2
     * 5 to 5: 4
     * 0 to 6: 1
     * <p>
     * Input = [2, 1, 3, 2, 2, 4, 1]
     * A = [-1, 1, 1, 1, 1, 1, 6]
     * C = [0, 0, 0, 3, 4, 4, 4]
     * G = [-1, -1, 2, 2, 2, 2, 2]
     * T = [-1, -1, -1, -1, -1, 5, 5]
     */
    private int[] optimizedSolution(String S, int[] P, int[] Q) {
        if (P.length != Q.length) {
            throw new IllegalArgumentException("P and Q size does not match");
        }

        int[] aMap = new int[S.length()];
        int[] cMap = new int[S.length()];
        int[] gMap = new int[S.length()];
        int[] tMap = new int[S.length()];

        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            setIfMatch(aMap, c, 'A', i);
            setIfMatch(cMap, c, 'C', i);
            setIfMatch(gMap, c, 'G', i);
            setIfMatch(tMap, c, 'T', i);
        }
        int[] result = new int[P.length];
        for (int i = 0; i < P.length; i++) {
            if (aMap[Q[i]] >= P[i]) {
                result[i] = 1;
            } else if (cMap[Q[i]] >= P[i]) {
                result[i] = 2;
            } else if (gMap[Q[i]] >= P[i]) {
                result[i] = 3;
            } else if (tMap[Q[i]] >= P[i]) {
                result[i] = 4;
            }
        }
        return result;
    }

    private void setIfMatch(int[] dMap, char c, char toMatch, int index) {
        if (c == toMatch) {
            dMap[index] = index;
        } else if (index > 0) {
            dMap[index] = dMap[index - 1];
        } else {
            dMap[index] = -1;
        }
    }

}
