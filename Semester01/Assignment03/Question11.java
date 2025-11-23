package Semester01.Assignment03;

import java.util.Scanner;

public class Question11 {
    // Assigned On 10/11/2025 - Sixth Class
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        scanner.close();

        boolean fiveAndSix = (number % 5 == 0 && number % 6 == 0);
        boolean fiveOrSix = (number % 5 == 0 || number % 6 == 0);

        System.out.println("Is " + number + " divisible by 5 and 6? " + fiveAndSix);
        System.out.println("Is " + number + " divisible by 5 or 6? " + fiveOrSix);
        System.out.println("Is " + number + " divisible by 5 or 6, but not both? " + (fiveOrSix && !fiveAndSix));

    }
}
