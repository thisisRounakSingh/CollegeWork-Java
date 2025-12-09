package Semester01.Assignment05;

import java.util.Scanner;

public class Question09 {
    // Assigned On 08/12/2025 - Ninth Class
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();

        double sum = 0.0;
        for (int k = 1; k <= n; k++) {
            int numerator = 2 * k;
            int denominator = 2 * k - 1;
            int sign = (k % 2 == 0) ? -1 : 1;
            sum += sign * (numerator * 1.0 / denominator);
        }

        System.out.println("Sum using for loop = " + sum);
        scanner.close();
    }
}
