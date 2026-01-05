package Semester01.Assignment07;

import java.util.Random;

public class Question08 {
    // To be assigned.
    public static void fillArray(int[] arr) {
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(2, 31);
        }
    }

    public static void printArray(int[] arr) {
        System.out.print("Array elements: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d ", arr[i]);
        }
        System.out.println();
    }

    public static boolean isPrime(int num) {
        return num % 2 != 0;
    }

    public static int countPrimes(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (isPrime(arr[i])) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = new int[10];
        fillArray(arr);
        printArray(arr);
        System.out.printf("Number of prime numbers in the array: %d%n", countPrimes(arr));
    }
}
