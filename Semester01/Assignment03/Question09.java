package Semester01.Assignment03;

import java.util.Scanner;

public class Question09 {
    // Assigned On - 10/11/2025 - Sixth Class
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num01 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num02 = scanner.nextInt();
        System.out.print("Enter operator (+, -, *, /): ");
        String operation = scanner.next();

        scanner.close();

        float result = 0;

        if (operation.equals("+")) {
            result = (float) (num01 + num02);
        } else if (operation.equals("-")) {
            result = (float) (num01 - num02);
        } else if (operation.equals("*")) {
            result = (float) (num01 * num02);
        } else if (operation.equals("/")) {
            result = (float) (num01 / num02);
        }

        System.out.println("Result: " + result);
    }
}
