
package com.solenoidx;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    }

    private static int readInteger() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of elements in the array:");
        int count = scanner.nextInt();
        scanner.hasNextLine();
        return count;
    }

    private static int[] readElements(int count) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[count];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter a number for element " + i + ":");
            array[i] = scanner.nextInt();
            scanner.hasNextLine();
        }
        return array;
    }

    private static int findMin(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }
}
