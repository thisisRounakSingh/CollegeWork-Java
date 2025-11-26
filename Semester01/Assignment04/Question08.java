package Semester01.Assignment04;

import java.util.Scanner;

public class Question08 {
    // Assigned On 24/11/2025 - Seventh Class
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int numOne = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int numSecond = scanner.nextInt();
        scanner.close();

        /* There are two approaches both of them are mentioned below. */

        // Method One
        int minimum = Math.min(numOne, numSecond);
        int result = 0;
        while (minimum != 0) {
            if (numOne % minimum == 0 && numSecond % minimum == 0) {
                result = minimum;
                break;
            } else {
                minimum--;
            }
        }
        System.out.println("GCD of " + numOne + " " + numSecond + " is " + result);

        // Method Two (using Euclid's algorithm)
        int anotherMinimum = Math.min(numOne, numSecond);
        if (numOne % anotherMinimum == 0 && numSecond % anotherMinimum == 0) {
            System.out.println("GCD of " + numOne + " " + numSecond + " is " + anotherMinimum);
        } else if (numOne == anotherMinimum) {
            System.out.println("GCD of " + numOne + " " + numSecond + " is " + (numSecond % numOne));
        } else if (numSecond == anotherMinimum) {
            System.out.println("GCD of " + numOne + " " + numSecond + " is " + (numOne % numSecond));
        }
    }
}
