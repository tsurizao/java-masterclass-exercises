package com.solenoidx;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array = {1, 5, 3, 7, 11, 9, 15};
        reverse(array);
    }

    private static void reverse(int[] array) {
        System.out.println("Array = " + Arrays.toString(array));
        int halfLength = array.length / 2;
        int maxIndex = array.length - 1;
        for(int i = 0;i < halfLength; i++){
            int temp = array[maxIndex - i];
            array[maxIndex - i] = array[i];
            array[i] = temp;
        }
        System.out.println("Reversed array = " + Arrays.toString(array));
    }
}