package Semester01.Assignment04;

import java.util.Scanner;

public class Question06 {
    // Assigned On 24/11/2025 - Seventh Class
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /* The number to be reversed. */
        System.out.print("Enter a number: ");
        int number = scanner.nextInt(), tempNumber = number, reversedNumber = 0, lastDigit;
        scanner.close();

        while (tempNumber > 0) {
            lastDigit = tempNumber % 10;
            /* This is the key logic! */
            reversedNumber = reversedNumber * 10 + lastDigit;
            tempNumber /= 10;
        }

        System.out.println("Reversed Number: " + reversedNumber);

        if (number == reversedNumber) {
            System.out.println(number + " is a palindrome.");
        }

    }
}
