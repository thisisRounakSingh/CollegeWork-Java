package Semester01.Assignment04;

import java.util.Scanner;

public class Question04 {
    // Assigned On 10/11/2025 - Sixth Class
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Guess the number between 1 and 10!");
        int computerGuess = (int) (1 + Math.random() * 10), userGuess = 0;

        do {
            System.out.print("Enter your guess: ");
            userGuess = scanner.nextInt();

            if (userGuess == computerGuess) {
                System.out.println("Good guess!");
            } else if (userGuess < computerGuess) {
                System.out.println("Too low, try again.");
            } else if (userGuess > computerGuess) {
                System.out.println("Too high, try again.");
            }

        } while (userGuess != computerGuess);

        scanner.close();
    }
}
