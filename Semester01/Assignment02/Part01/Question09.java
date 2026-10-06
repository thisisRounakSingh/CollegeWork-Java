package Semester01.Assignment02.Part01;

import java.util.Scanner;

public class Question09 {
    // Assigned On - 13/10/2025 - Fourth Class
    public static void main(String[] args) {
        int inteGer;
        int firstDigit;
        int secondDigit;
        int thirdDigit;
        int sum;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 1000: ");
        inteGer = scanner.nextInt();

        firstDigit = inteGer % 10;
        inteGer = inteGer / 10;
        secondDigit = inteGer % 10;
        inteGer = inteGer / 10;
        thirdDigit = inteGer % 10;
        inteGer = inteGer / 10;

        sum = firstDigit + secondDigit + thirdDigit + inteGer;

        System.out.println("The sum of the digits is " + sum);
        scanner.close();
    }
}
