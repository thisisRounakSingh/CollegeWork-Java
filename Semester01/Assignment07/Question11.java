package Semester01.Assignment07;

import java.util.Scanner;

public class Question11 {
    // To be assigned.
    public static double max(double[] array) {
        double max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max)
                max = array[i];
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten numbers: ");
        double[] array = new double[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextDouble();
        }
        System.out.printf("The minimum number is: %.1f%n: ", max(array));
        input.close();
    }
}
