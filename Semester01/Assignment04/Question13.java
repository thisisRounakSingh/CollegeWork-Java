package Semester01.Assignment04;

import java.util.Scanner;

public class Question13 {
    // To be assigned.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the range (N): ");
        int range = scanner.nextInt(), sum = 0;
        scanner.close();

        for (int i = range - 1; i != 0; i--) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum = sum + i;
            }
        }

        System.out.println("The sum of all multiples of 3 or 5 below " + range + " is: " + sum);
    }
}
