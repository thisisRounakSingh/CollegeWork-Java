package Semester01.Assignment04;

import java.util.Scanner;

public class Question03 {
    // Assigned On - 10/11/2025
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;

        do {
            System.out.print("Enter a number (0 to stop): ");
            number = scanner.nextInt();
            if (number == 0) {
                System.out.println("Program terminated.");
            } else {
                if (number % 2 == 0) {
                    System.out.println(number + " is an even number.");
                } else {
                    System.out.println(number + " is an odd number.");
                }
            }
        } while (number != 0);

        scanner.close();
    }
}
