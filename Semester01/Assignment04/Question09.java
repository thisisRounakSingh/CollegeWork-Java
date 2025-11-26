package Semester01.Assignment04;

import java.util.Scanner;

public class Question09 {
    // Assigned On 24/11/2025 - Seventh Class
    public static void main(String[] args) {
        /*
         * A number is called as the Niven number if the number is divisible by its sum.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt(), tempNumber = number, sum = 0, remainder;
        scanner.close();

        while (tempNumber != 0) {
            remainder = tempNumber % 10;
            sum = sum + remainder;
            tempNumber /= 10;
        }

        if (number % sum == 0) {
            System.out.println(number + " is a Niven number.");
        }
    }
}
