package Semester01.Assignment07;

import java.util.Scanner;

public class Question09 {
    // To be assigned.
    public static void bubbleSort(double[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    double value = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = value;
                }
            }
        }
        System.out.println("Elements after bubble sort: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%.1f ", arr[i]);
        }

        System.out.println();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double arr[] = new double[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextDouble();
        }

        bubbleSort(arr);

        input.close();
    }
}
