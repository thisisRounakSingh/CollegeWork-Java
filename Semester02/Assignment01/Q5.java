package Semester02.Assignment01;

import java.util.Scanner;

public class Q5 {
    // Assigned on 02/02/2026
    public static int sum_of_Digits(int n) {
        int tempNum = n, sum = 0;
        while (tempNum != 0) {
            int digit = tempNum % 10;
            sum += digit;
            tempNum /= 10;
            if (tempNum == 0 && sum > 10) {
                tempNum = sum;
                sum = 0;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        System.out.printf("Sum of digits of %d until the number is a single digit is %d%n", n, sum_of_Digits(n));
        scanner.close();
    }
}
