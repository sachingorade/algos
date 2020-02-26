package com.sachin.algos.puzzles;

import java.util.Arrays;

public class RotateArray {

    public static int[] rotateArray(int[] array, int rotations) {
        if (array.length == 0) {
            return array;
        }
        if (rotations > array.length) {
            rotations = rotations % array.length;
        }
        if (rotations == array.length || rotations == 0) {
            return array;
        }
        int[] rotatedArray = new int[array.length];
        int j = array.length - rotations;
        for (int i=0;i<rotatedArray.length;i++) {
            rotatedArray[i] = array[j++];
            if (j >= array.length) {
                j = 0;
            }
        }
        return rotatedArray;
    }

}
