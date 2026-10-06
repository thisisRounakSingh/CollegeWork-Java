package Semester01.Assignment04;

import java.util.Scanner;

public class Question01 {
    // Assigned On - 10/11/2025 Sixth Class
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt(), sum = 0, intermediate = num, remainder;
        scanner.close();

        while (num != 0) {
            remainder = num % 10;
            sum = sum + remainder;
            num = num / 10;
        }

        if (sum % 9 == 0) {
            System.out.println("The number " + intermediate + " is divisible by 9.");
        } else {
            System.out.println("The number " + intermediate + " is not divisible by 9.");
        }
    }
}
