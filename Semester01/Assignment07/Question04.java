package Semester01.Assignment07;

import java.util.Scanner;

public class Question04 {
    // Assigned On 22/12/2025 - Eleventh Class

    public static double min(double[] array) {
        double minimum = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] <= minimum) {
                minimum = array[i];
            }
        }
        return minimum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten numbers: ");
        double[] arr = new double[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextDouble();
        }
        System.out.printf("The minimum number is: %.2f%n", min(arr));
        input.close();
    }
}
