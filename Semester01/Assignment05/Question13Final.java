package Semester01.Assignment05;

import java.util.Scanner;

public class Question13Final {
    // Assigned On 08/12/2025 - Ninth Class

    // One is supposed to write this in their notebook!
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter x (in radians): ");
        double x = input.nextDouble();
        double error = 1e-6;

        double sum = 0.0;
        double term = x;

        sum += term;

        int k = 1;

        // Stops after value becomes enough small!
        while (Math.abs(term) > error) {
            term *= -1 * x * x / ((2 * k) * (2 * k + 1));
            sum += term;
            k++;
        }

        System.out.println("sin(x) using series = " + sum + " radians.");
        input.close();
    }
}
