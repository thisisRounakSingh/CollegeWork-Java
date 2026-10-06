package Semester01.Assignment05;

import java.util.Scanner;

public class Question13 {
    // Assigned On 08/12/2025 - Ninth Class
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter x (in radians): ");
        double x = scanner.nextDouble();
        double epsilon = 1e-6;

        double sum = 0.0;
        double term = x;
        // initial x
        sum += term;
        // K < 100 cap allows epsilon to used! for k<10 accuracy will be reduced and also epsilon will remain unused.
        for (int k = 1; k < 100; k++) {
            // increasing each term by -x^2/(2k)(2k+1)
            // (2 * k + 1) ==> 2*k will first be evaluated.
            term *= -1 * x * x / ((2 * k) * (2 * k + 1));
            sum += term;
            if (Math.abs(term) < epsilon) {
                break;
            }
        }
        System.out.println("sin(x) using series = " + sum + " radians.");
        scanner.close();
    }
}
