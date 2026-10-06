package Semester01.Assignment03;

import java.util.Scanner;

public class Question15 {
    // Assigned On 10/11/2025 - Sixth Class
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your choice (0 for scissor, 1 for rock, 2 for paper): ");
        int userChoice = scanner.nextInt();
        int computerChoice = (int) (Math.random() * 3);
        String computerAction = "", userAction = "";

        if (computerChoice == 0) {
            computerAction = "Scissor";
        } else if (computerChoice == 1) {
            computerAction = "Rock";
        } else if (computerChoice == 2) {
            computerAction = "Paper";
        }

        if (userChoice == 0) {
            userAction = "Scissor";
        } else if (userChoice == 1) {
            userAction = "Rock";
        } else if (userChoice == 2) {
            userAction = "Paper";
        }

        String message = "The computer is " + computerAction + ". You are " + userAction + ".";

        if (userChoice == computerChoice) {
            System.out.println(message + " It is a draw.");
        } else if ((userChoice == 0 && computerChoice == 2) || (userChoice == 1 && computerChoice == 0)
                || (userChoice == 2 && computerChoice == 1)) {
            System.out.println(message + " You won.");
        } else {
            System.out.println(message + " You loose.");
        }

        scanner.close();
    }
}
