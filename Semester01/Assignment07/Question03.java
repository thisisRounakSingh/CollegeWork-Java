package Semester01.Assignment07;

import java.util.Scanner;

public class Question03 {
    // declared class level scanner to avoid "closing" issues.
    static Scanner input = new Scanner(System.in);

    // Assigned On 22/12/2025 - Eleventh Class

    public static void readArray(int[] arr) {
        System.out.print("Enter 10 integers: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
    }

    public static int countOccurrence(int[] arr, int key) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = new int[10];
        readArray(arr);
        System.out.print("Enter the number to search: ");
        int num = input.nextInt();
        System.out.printf("The number %d appears %d time(s) in the array.%n", num, countOccurrence(arr, num));
        input.close();
    }
}
