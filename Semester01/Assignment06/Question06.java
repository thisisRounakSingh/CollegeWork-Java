package Semester01.Assignment06;

import java.util.Scanner;

public class Question06 {
    // Assigned On 22/12/2025 - Eleventh Class

    public static int sumOfDivisors(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static boolean isFriendlyPair(int a, int b) {
        // Make sure to avoid integer division.
        double pair1 = sumOfDivisors(a) / (double) a, pair2 = sumOfDivisors(b) / (double) b;
        if (pair1 == pair2) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = input.nextInt();
        System.out.print("Enter second number: ");
        int b = input.nextInt();

        System.out.println();

        System.out.printf("Sum of proper divisors of %d = %d%n", a, sumOfDivisors(a));
        System.out.printf("Sum of proper divisors of %d = %d%n", b, sumOfDivisors(b));

        System.out.println();

        System.out.printf(
                isFriendlyPair(a, b) ? "%d and %d are Friendly Pair.%n" : "%d and %d are NOT Friendly Pair.%n", a, b);

        input.close();
    }
}
