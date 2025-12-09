package Semester01.Assignment05;

import java.util.Scanner;

public class Question12 {
    // Assigned On 08/12/2025 - Ninth Class
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of m: ");
        int m = scanner.nextInt();
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        int start = m < n ? m : n;
        int end = m < n ? n : m;
        if (start < 1) {
            start = 1;
        }

        System.out.println("Factorials using for loops:");
        for (int num = start; num <= end; num++) {
            long factorial = 1;
            for (int i = 1; i <= num; i++) {
                factorial *= i;
            }
            System.out.println("Factorial of " + num + " is: " + factorial);
        }
        scanner.close();
    }
}
