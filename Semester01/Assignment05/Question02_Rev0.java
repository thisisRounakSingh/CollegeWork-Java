package Semester01.Assignment05;

import java.util.Scanner;

public class Question02_Rev0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int secondNumber = scanner.nextInt();

        int sumDivisorFirst = 0, sumDivisorSecond = 0;

        if (firstNumber > 1 || secondNumber > 1) {

            for (int i = firstNumber - 1; i >= 1; i--) {
                if (firstNumber % i == 0) {
                    sumDivisorFirst += i;
                }
            }

            for (int i = secondNumber - 1; i >= 1; i--) {
                if (secondNumber % i == 0) {
                    sumDivisorSecond += i;
                }
            }

            if (sumDivisorFirst == secondNumber && sumDivisorSecond == firstNumber) {
                System.out.println(firstNumber + " and " + secondNumber + " are amicable numbers.");
            } else {
                System.out.println(firstNumber + " and " + secondNumber + " are not amicable numbers.");
            }
        } else {
            System.out.println("Please enter values greater or equal to one.");
        }

        scanner.close();
    }
}
