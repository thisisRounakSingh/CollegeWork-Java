package Semester01.Assignment05;

import java.util.Scanner;

public class Question06 {
    // Assigned On 08/12/2025 - Ninth Class
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        double sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += 1.0 / (i * i);
        }
        System.out.println("Sum = " + sum);
        scanner.close();
    }
}
