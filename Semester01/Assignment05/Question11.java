package Semester01.Assignment05;

import java.util.Scanner;

public class Question11 {
    // Assigned On 08/12/2025 - Ninth Class
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int b = scanner.nextInt();

        int start = a < b ? a : b;
        int end = a < b ? b : a;

        System.out.print("Prime numbers using for loop: ");
        boolean firstPrinted = false;
        for (int num = start; num <= end; num++) {
            if (num > 1) {
                boolean isPrime = true;
                // Same as divisor <= Math.sqrt(num). (just flipped the equation power.)
                for (int divisor = 2; divisor * divisor <= num; divisor++) {
                    if (num % divisor == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    if (firstPrinted) {
                        // Once the first number is printed we add space.
                        System.out.print(" ");
                    }
                    System.out.print(num);
                    firstPrinted = true;
                }
            } else {
                System.out.println("0 and 1 are not counted as prime.");
                break;
            }
        }
        System.out.println();
        scanner.close();
    }
}
