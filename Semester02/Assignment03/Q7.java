package Semester02.Assignment03;

import java.util.Scanner;

public class Q7 {
    public static int factorial(int x) {
        if (x == 0) {
            return 1;
        }
        return x * factorial(x - 1);
    }

    // Assigned On: (Untracked)
static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        System.out.printf("Factorial: %d%n", factorial(scanner.nextInt()));
        scanner.close();
    }
}
