package com.example;

import java.util.Arrays;

public class App {

    public static void main(String[] args) {
        int[] numbers = {5, 10, 15, 20, 25};

        int sum = calculateSum(numbers);
        double avg = calculateAverage(numbers);
        int min = findMin(numbers);
        int max = findMax(numbers);

        System.out.println("Array: " + Arrays.toString(numbers));
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + avg);
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
    }

    public static int calculateSum(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }

    public static double calculateAverage(int[] array) {
        if (array.length == 0) return 0.0;
        return (double) calculateSum(array) / array.length;
    }

    public static int findMin(int[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("Array is empty. Cannot find minimum.");
        }
        int min = array[0];
        for (int num : array) {
            if (num < min) min = num;
        }
        return min;
    }

    public static int findMax(int[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("Array is empty. Cannot find maximum.");
        }
        int max = array[0];
        for (int num : array) {
            if (num > max) max = num;
        }
        return max;
    }
}
