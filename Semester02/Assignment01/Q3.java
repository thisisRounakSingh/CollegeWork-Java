package Semester02.Assignment01;

import java.util.Scanner;

public class Q3 {
    // Assigned on 02/02/2026
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt(), sum = 0, product = 1;

        for (int i = number; i > 0; i /= 10) {
            sum += i % 10;
            product *= i % 10;
        }

        System.out.printf(sum == product ? "%d is a spy number%n" : "%d is not a spy number.%n", number);

        input.close();
    }
}
