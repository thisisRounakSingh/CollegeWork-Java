package Semester01.Assignment05;

import java.util.Scanner;

public class Question14Final {
    // Assigned On 08/12/2025 - Ninth Class

    // One is supposed to write this in their notebook!
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter x (in radian): ");
        double x = input.nextDouble(), error = 1e-6, sum = 1.0, term = 1.0;

        int k = 1;
        while (Math.abs(term) > error) {
            term *= -1 * x * x / ((2 * k - 1) * (2 * k));
            sum += term;
            k++;
        }

        System.out.println("cos(x) using series = " + sum);
        input.close();
    }
}
