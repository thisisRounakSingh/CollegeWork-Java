package Semester01.Assignment03;

import java.util.Scanner;

public class Question12 {
    // Assigned On 10/11/2025 - Sixth Class
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of a, b, c: ");
        int num01 = scanner.nextInt();
        int num02 = scanner.nextInt();
        int num03 = scanner.nextInt();

        scanner.close();

        int largestNumber = 0;

        // Using nested if-else statements
        if (num01 > num02) {
            if (num01 > num03) {
                largestNumber = num01;
            }
        } else if (num02 > num01) {
            if (num02 > num03) {
                largestNumber = num02;
            }
        } else if (num03 > num01) {
            if (num03 > num02) {
                largestNumber = num03;
            }
        }

        // Using if-else if ladder
        if (num01 > num02 && num01 > num03) {
            largestNumber = num03;
        } else if (num02 > num03 && num02 > num01) {
            largestNumber = num02;
        } else if (num03 > num01 && num03 > num02) {
            largestNumber = num03;
        }

        System.out.println("Largest Number: " + largestNumber);

        // Using ternary operation
        System.out.println("Largest number: "
                + ((num01 > num02) ? ((num01 > num03) ? num01 : num03) : ((num02 > num03) ? num02 : num03)));
    }
}
