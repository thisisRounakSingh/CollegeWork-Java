package Semester02.Assignment03;

import java.util.Scanner;

class Q9 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to reverse: ");
        int number = scanner.nextInt();
        System.out.printf("The number %d reversed via recursive reverse approach: %d%n", number, reverse(number));
        scanner.close();
    }

    static int reverse(int number) {
        return recursiveReverse(number, 0);
    }

    static int recursiveReverse(int number, int reversed) {
        if (number == 0) {
            return reversed;
        }

        int lastDigit = number % 10;
        int reverseConstructor = reversed * 10 + lastDigit;

        return recursiveReverse(number / 10, reverseConstructor);
    }
}
