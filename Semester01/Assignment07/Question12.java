package Semester01.Assignment07;

import java.util.Scanner;

public class Question12 {
    // Assigned On 22/12/2025 - Eleventh Class

    public static void bubbleSort(double[] arr) {
        double swapValue = 0.0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swapValue = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = swapValue;
                }
            }
        }

        System.out.print("Sorted Numbers: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%.1f ", arr[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten numbers: ");
        double arr[] = new double[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextDouble();
        }
        bubbleSort(arr);
        input.close();
    }
}
