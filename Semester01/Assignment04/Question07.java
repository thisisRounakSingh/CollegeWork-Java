package Semester01.Assignment04;

import java.util.Scanner;

public class Question07 {
    // Assigned On 24/11/2025 - Seventh Class
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        int i;
        /* Using for loop. */
        System.out.println("Using for loop (1 to 3):");
        for (i = 1; i <= 3; i++) {
            System.out.println(number + " x " + i + " = " + number * i);
        }

        /* Using while loop. */
        System.out.println("Using while loop (4 to 6):");
        while (i != 7) {
            System.out.println(number + " x " + i + " = " + number * i);
            i++;
        }

        /* Using do-while loop. */
        System.out.println("Using do-while loop (7 to 10):");
        do {
            System.out.println(number + " x " + i + " = " + number * i);
            i++;
        } while (i != 11);
    }
}
