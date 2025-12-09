package Semester01.Assignment05;

import java.util.Scanner;

public class Question03 {
    // Assigned On 01/12/2025 - Eighth Class
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int sumOfFactorial = 0, factorial = 1;

        for (int i = number; i > 0; i /= 10) {
            int lastDigit = i % 10;
            for (int j = lastDigit; j > 0; j--) {
                factorial *= j;
            }
            sumOfFactorial += factorial;
            factorial = 1;
        }

        System.out.println(number + (number == sumOfFactorial ? " is a " : " is not a ") + "strong number.");

        scanner.close();
    }
}
