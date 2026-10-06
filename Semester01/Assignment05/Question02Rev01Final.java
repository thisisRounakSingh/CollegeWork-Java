package Semester01.Assignment05;

import java.util.Scanner;

public class Question02Rev01Final {
    // Assigned On 01/12/2025 - Eighth Class
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Enter second number: ");
        int secondNumber = scanner.nextInt();

        int sumDivisorFirst = 0, sumDivisorSecond = 0;

        if (firstNumber > 1 || secondNumber > 1 && firstNumber != secondNumber) {

            /*
            * For any number n the largest proper divisor (other than n itself) is at most n/2.
            */
            for (int i = 1; i < firstNumber / 2; i++)
                if (firstNumber % i == 0)
                    sumDivisorFirst += i;

            for (int i = 1; i < secondNumber / 2; i++)
                if (secondNumber % i == 0)
                    sumDivisorSecond += i;

            System.out.println(firstNumber + " and " + secondNumber
                    + (sumDivisorFirst == secondNumber && sumDivisorSecond == firstNumber ? " are" : " are not")
                    + " amicable numbers.");
        } else {
            System.out.println("Please enter values greater than or equal to one.");
        }
        scanner.close();
    }
}
