package Semester01.Assignment05;

import java.util.Scanner;

public class Question13Improved {
    // Assigned On 08/12/2025 - Ninth Class
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter x (in radians): ");
        double xInput = scanner.nextDouble();

        double x = reduceToMinusPiToPi(xInput); // range reduction keeps series stable for large magnitudes
        double epsilon = 1e-6;

        double sum = x; // first term
        double term = x;

        for (int k = 1; k < 100; k++) {
            term *= -1 * x * x / ((2 * k) * (2 * k + 1));
            sum += term;
            if (Math.abs(term) < epsilon) {
                break;
            }
        }

        System.out.println("Reduced angle used: " + x + " radians.");
        System.out.println("sin(x) using series = " + sum + " radians.");
        System.out.println("Math.sin(x) for comparison = " + Math.sin(xInput) + " radians.");
        scanner.close();
    }

    private static double reduceToMinusPiToPi(double x) {
        /*
        * The idea is to fold the higher value
        * that has the same value as of the value.
        * 
        * we know: sin rotates 180 - theta. sin(180-theta) = sin(500)
        */
        double twoPi = 2 * Math.PI;
        x = x % twoPi;
        if (x > Math.PI) {
            x -= twoPi;
        } else if (x < -Math.PI) {
            x += twoPi;
        }
        return x;
    }
}
