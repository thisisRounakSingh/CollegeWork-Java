package Semester01.Assignment04;

import java.util.Scanner;

public class Question05 {
    // Assigned On 24/11/2025 - Seventh Class
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Enter second number: ");
        int secondNumber = scanner.nextInt();
        System.out.print("Enter third number: ");
        int thirdNumber = scanner.nextInt();
        scanner.close();
        int sum = 0;

        for (int i = firstNumber; i <= secondNumber; i = i + thirdNumber) {
            System.out.print(i + "\t");
            sum += i;
        }
        System.out.println("\nThe sum of number displayed is " + sum);
    }
}
