package Semester01.Assignment07;

import java.util.Random;
import java.util.Scanner;

public class Question01 {
    // Assigned On 22/12/2025 - Eleventh Class

    public static int findSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return sum;
    }

    public static double findAverage(int[] arr) {
        return findSum(arr) / (double) arr.length;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random randomNumber = new Random();
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();
        int[] intArr = new int[size];
        for (int i = 0; i < size; i++) {
            intArr[i] = randomNumber.nextInt(101);
        }
        System.out.print("Random values stored in the array: ");
        for (int i = 0; i < size; i++) {
            System.out.printf("%d ", intArr[i]);
        }
        System.out.println();
        System.out.printf("Sum of elements = %d%nAverage of elements= %.2f%n", findSum(intArr), findAverage(intArr));
        input.close();
    }
}
