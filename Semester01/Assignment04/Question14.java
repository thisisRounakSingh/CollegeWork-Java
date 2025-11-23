package Semester01.Assignment04;

import java.util.Scanner;

public class Question14 {
    // To be assigned.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int n = scanner.nextInt(), sum = 0, product = 1;
        scanner.close();

        for (int i = n; i != 0; i--) {
            if (i % 2 == 0) {
                sum += i;
            } else {
                product *= i;
            }
        }
        System.out.println("Sum of all even numbers: " + sum);
        System.out.println("Product of all odd numbers: " + product);

    }
}
