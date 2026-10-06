package Semester02.Assignment03;

import java.util.Random;
import java.util.Scanner;

public class Q1 {
    // Assigned On: (Untracked)
    static void main() {
        Random randInt = new Random();
        try (Scanner input = new Scanner(System.in)) {

            System.out.print("Enter a number between 1 and 10: ");
            int luckNumber = randInt.nextInt(10) + 1;
            int numberFromUser = input.nextInt();
            while (true) {
                if (numberFromUser == luckNumber) {
                    System.out.println("You guess it right. It is: " + luckNumber);
                    break;
                } else if (numberFromUser < 0) {
                    throw new NumberFormatException();
                } else {
                    System.out.println("Try again...");
                    System.out.println(": ");
                    luckNumber = input.nextInt();
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("Negative Numbers Not allowed.");
        } finally {
            System.out.println("Program Exit.");
        }
    }
}
