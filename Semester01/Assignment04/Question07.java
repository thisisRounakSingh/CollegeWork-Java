package Semester01.Assignment04;

import java.util.Scanner;

public class Question07 {
    // To be assigned.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        /* Using for loop. */
        System.out.println("Using for loop (1 to 3):");
        for (int i = 1; i <= 3; i++) {
            System.out.println(number + " x " + i + " = " + number * i);
        }

        System.out.println("\n");

        /* Using while loop. */
        System.out.println("Using while loop (4 to 6):");
        int temp = 4;
        while (temp != 7) {
            System.out.println(number + " x " + temp + " = " + number * temp);
            temp++;
        }

        System.out.println("\n");

        /* Using do-while loop. */
        System.out.println("Using do-while loop (7 to 10):");
        do {
            System.out.println(number + " x " + temp + " = " + number * temp);
            temp++;
        } while (temp != 11);
    }
}
