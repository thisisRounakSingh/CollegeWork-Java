package Semester01.Assignment05;

import java.util.Scanner;

public class Question14 {
    // Assigned On 08/12/2025 - Ninth Class
    // Check Question13.java for any explanation.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter x (in radians): ");
        double x = scanner.nextDouble();
        double epsilon = 1e-6;

        double sum = 1.0;
        double term = 1.0;
        for (int k = 1; k < 100; k++) {
            term *= -1 * x * x / ((2 * k - 1) * (2 * k));
            sum += term;
            if (Math.abs(term) < epsilon) {
                break;
            }
        }

        System.out.println("cos(x) using for loop series = " + sum);
        scanner.close();
    }
}
