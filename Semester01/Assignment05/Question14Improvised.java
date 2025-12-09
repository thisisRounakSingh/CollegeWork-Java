package Semester01.Assignment05;

import java.util.Scanner;

public class Question14Improvised {
    // Assigned On 08/12/2025 - Ninth Class
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter x (in radians): ");
        double xInput = scanner.nextDouble();
        double x = reduceToMinusPiToPi(xInput);

        /*
        * OR... 
        * x = Math.IEEEremainder(x, 2*Math.PI)
        * This automatically returns what we want.
        * No need of a separate function.
        */

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

        System.out.println("cos(x) using series = " + sum);

        scanner.close();
    }

    private static double reduceToMinusPiToPi(double x) {
        // cos(x) = cos(x+2pin)
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
