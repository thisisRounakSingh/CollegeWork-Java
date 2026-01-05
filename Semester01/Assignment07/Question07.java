package Semester01.Assignment07;

import java.util.Scanner;

public class Question07 {
    // To be assigned.
    public static void readArray(int[] arr) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        input.close();
    }

    public static void rotateClockwise(int[] arr) {
        int lastValue = arr[arr.length - 1];

        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }

        arr[0] = lastValue;
    }

    public static void main(String[] args) {
        int arr[] = new int[10];

        readArray(arr);
        System.out.println("Array elements before clockwise rotation: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d ", arr[i]);
        }
        System.out.println();

        rotateClockwise(arr);
        System.out.println("Array elements after clock-wise rotation: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d ", arr[i]);
        }
        System.out.println();
    }
}
