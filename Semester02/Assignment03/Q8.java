package Semester02.Assignment03;

import java.util.Scanner;

public class Q8 {

    // Assigned On: (Untracked)
static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any real number: ");
        double x = scanner.nextDouble();
        System.out.print("Enter any positive integer: ");
        int n = scanner.nextInt();

        System.out.printf("The value of %f^%d calculated via recursive function is: %.2f", x, n, xToN(x, n));

        scanner.close();
    }

    static double xToN(double x, int n) {
        if (n == 0) {
            return 1.0;
        }
        return x * xToN(x, n - 1);
    }

}
