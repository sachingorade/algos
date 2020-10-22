package com.sachin.algos.puzzles.primeandcomposites;

public class MinPerimeterRectangle {

    public int solution(int N) {
        int firstFactor = (int) Math.sqrt(N);
        while (N % firstFactor != 0 && firstFactor > 0) {
            firstFactor--;
        }
        return 2 * (firstFactor + (N / firstFactor));
    }

}
