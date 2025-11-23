package Semester01.Assignment03;

import java.util.Scanner;

public class Question07 {
    // Assigned On - 03/11/2025 - Fifth Class
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();
        String notLY = " is NOT a Leap Year";
        String LY = " is a Leap Year";

        // using nested if-else statements.

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(year + LY);
                } else {
                    System.out.println(year + notLY);
                }
            } else {
                System.out.println(year + LY);
            }
        } else {
            System.out.println(year + notLY);
        }

        // Using nested if-else if ladder
        if (year % 400 == 0)
            System.out.println(year + LY);
        else if (year % 100 == 0)
            System.out.println(year + notLY);
        else if (year % 4 == 0)
            System.out.println(year + LY);
        else
            System.out.println(year + notLY);

        // Using ternary operator
        boolean isLY = (year % 400 == 0) ? true : (year % 100 == 0) ? false : (year % 4 == 0) ? true : false;
        System.out.println(isLY ? (year + LY) : (year + notLY));

        scanner.close();
    }
}
