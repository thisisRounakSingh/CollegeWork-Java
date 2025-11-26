package Semester01.Assignment04;

import java.util.Scanner;

public class Question10 {
    // Assigned On 24/11/2025 - Seventh Class
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        int number = scanner.nextInt(), tempNumber = number, afterZeroNumber = 0, power = 1, lastDigit;
        scanner.close();

        while (tempNumber > 0) {
            lastDigit = tempNumber % 10;

            if (lastDigit != 0) {
                /* This is the main logic! */
                afterZeroNumber += lastDigit * power;
                power *= 10;
            }

            tempNumber /= 10;
        }

        System.out.println("After removing 0 from number  " + number + ", the new number is " + afterZeroNumber);

    }
}
