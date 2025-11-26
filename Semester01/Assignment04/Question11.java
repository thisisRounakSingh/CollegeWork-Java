package Semester01.Assignment04;

import java.util.Scanner;

public class Question11 {
    // Assigned On 24/11/2025 - Seventh Class
    public static void main(String[] args) {
        /*
         * A number N is called perfect number, if the sum of factors except N as a factor
        is equals to the number N.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt(), sum = 0;
        scanner.close();

        for (int i = 1; i != number; i++) {
            int factor = number % i == 0 ? i : 0;
            sum += factor;
        }

        if (number % sum == 0) {
            System.out.println(number + " is a perfect number.");
        } else {
            System.out.println(number + " is not a perfect number.");
        }
    }
}
