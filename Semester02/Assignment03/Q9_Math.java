package Semester02.Assignment03;

import java.util.Scanner;

public class Q9_Math {
    /* Recursive function + Mathematical approach to the function. */
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number of reverse: ");
        int number = scanner.nextInt();
        System.out.printf("The number %d after being reversed recursively is: %d%n", number,
                reverseRecursiveMathematical(number));
        scanner.close();
    }

    static int reverseRecursiveMathematical(int number) {
        if (number < 10) {
            return number;
        }

        /* log base 10 is used to calculate number of digits. */
        int remainingDigits = (int) Math.log10(number);

        return (number % 10 * (int) Math.pow(10, remainingDigits) + reverseRecursiveMathematical(number / 10));
    }
}
