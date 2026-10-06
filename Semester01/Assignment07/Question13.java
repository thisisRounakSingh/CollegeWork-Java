package Semester01.Assignment07;

import java.util.Random;

public class Question13 {
    // Assigned On 22/12/2025 - Eleventh Class

    public static void fillArray(int[] arr) {
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(50, 100);
        }
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d ", array[i]);
        }
        System.out.println();
    }

    public static void reverseArray(int[] arr) {
        boolean indexVisited[] = new boolean[10];
        int arrLen = arr.length - 1;
        for (int i = 0; i < arr.length / 2; i++) {
            if (!indexVisited[i] && !indexVisited[arrLen - i]) {
                int swapValue = arr[i];
                arr[i] = arr[arrLen - i];
                arr[arrLen - i] = swapValue;
                indexVisited[i] = true;
                indexVisited[arrLen - i] = true;
            }
        }

        printArray(arr);
    }

    public static void main(String[] args) {
        int[] arr = new int[10];
        fillArray(arr);
        System.out.print("Original Array: ");
        printArray(arr);
        System.out.print("Reversed Array: ");
        reverseArray(arr);
    }
}
