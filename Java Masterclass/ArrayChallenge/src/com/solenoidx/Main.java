package com.solenoidx;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] firstIntegers = getIntegers(5);
        System.out.println("Unsorted Integers");
        printArray(firstIntegers);
        System.out.println("  ");
        System.out.println("Sorted Integers");
        printArray(sortIntegers(firstIntegers));
    }

    public static int[] sortIntegers(int[] array) {
        int[] sorted = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            int x = 0;
            int y = 0;
            for (int n = 0; n < array.length; n++) {
                if (array[i] < array[n]) {
                    x++;
                }
            }
            sorted[x] = array[i];
        }
        return sorted;
    }


    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " is the number " + array[i]);
        }
    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values: \r");
        int[] values = new int[number];
        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }
}
