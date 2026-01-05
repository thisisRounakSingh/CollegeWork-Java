package Semester01.Assignment07;

import java.util.Scanner;

public class Question06 {
    // To be assigned.
    static Scanner input = new Scanner(System.in);

    public static void readArray(int[] arr) {
        System.out.printf("Enter %d values: %n", arr.length);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
    }

    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i])
                max = arr[i];
        }
        return max;
    }

    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i])
                min = arr[i];
        }
        return min;
    }

    public static int countOccurrence(int[] arr, int value) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value)
                count++;
        }
        return count;
    }

    public static int firstPositionOfMax(int[] arr, int max) {
        int pos = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == max) {
                pos = i + 1;
                break;
            }
        }
        return pos;
    }

    public static int lastPositionOfMin(int[] arr, int min) {
        int pos = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == min) {
                pos = i + 1;
                break;
            }
        }
        return pos;
    }

    public static void main(String[] args) {
        System.out.print("Enter the size of the array: ");
        int[] arr = new int[input.nextInt()];
        readArray(arr);

        System.out.println();

        System.out.printf("Maximum value: %d%n", findMax(arr));
        System.out.printf("It occurs %d time(s)%n", countOccurrence(arr, findMax(arr)));
        System.out.printf("First Position of maximum: %d%n", firstPositionOfMax(arr, findMax(arr)));

        System.out.println();

        System.out.printf("Minimum value: %d%n", findMin(arr));
        System.out.printf("It occurs %d time(s)%n", countOccurrence(arr, findMin(arr)));
        System.out.printf("Last Position of minimum: %d%n", lastPositionOfMin(arr, findMin(arr)));

        input.close();
    }
}
