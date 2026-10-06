package Semester02.Assignment01;

import java.util.Scanner;

public class Q6 {
    // Assigned on 02/02/2026
    public static boolean isOdd(int n) {
        return (n & 1) != 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        System.out.printf("%d is odd: %b%n", number, isOdd(number));
        scanner.close();
    }
}
