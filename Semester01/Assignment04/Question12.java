package Semester01.Assignment04;

import java.util.Scanner;

public class Question12 {
    // To be assigned.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the base: ");
        int base = scanner.nextInt();
        System.out.print("Enter the power: ");
        int exponent = scanner.nextInt();
        scanner.close();

        int result = 1;
        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        System.out.println(base + " to the power " + exponent + " is: " + result);
    }
}
