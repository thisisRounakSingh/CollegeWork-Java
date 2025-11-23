package Semester01.Assignment03;

import java.util.Scanner;

public class Question04 {
    // Assigned On - 03/11/2025 - Sixth Class
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int computerGuess = (int) (1 + Math.random() * 10);
        System.out.print("Enter user number: ");
        int userGuess = scanner.nextInt();
        System.out.println("Computer guesses: " + computerGuess);

        String messageClose = "\"Almost got it\"";
        String messageSame = "\"You got it right\"";
        String messageWrong = "\"You got it wrong\"";

        if (userGuess == computerGuess - 1)
            System.out.println(messageClose);
        else if (userGuess == computerGuess + 1)
            System.out.println(messageClose);
        else if (userGuess == computerGuess)
            System.out.println(messageSame);
        else
            System.out.println(messageWrong);

        scanner.close();
    }
}
