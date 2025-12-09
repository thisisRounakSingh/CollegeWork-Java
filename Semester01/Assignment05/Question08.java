package Semester01.Assignment05;

import java.util.Scanner;

public class Question08 {
    // Assigned On 08/12/2025 - Ninth Class
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        // A
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("$ ");
            }
            System.out.println();
        }

        System.out.println();

        // B
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print("  ");
            }

            for (int k = 0; k <= rows - i; k++) {
                System.out.print("$ ");
            }
            System.out.println();
        }

        System.out.println();

        // C
        for (int i = rows; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print("$ ");
            }
            System.out.println();
        }

        System.out.println();

        // D
        for (int i = rows; i >= 1; i--) {

            for (int k = 0; k < rows - i; k++) {
                System.out.print("  ");
            }

            for (int j = i; j >= 1; j--) {
                System.out.print("$ ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
