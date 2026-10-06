package Semester01.Assignment05;

import java.util.Scanner;

public class Question04 {
    // Assigned On 01/12/2025 - Eighth Class
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Enter second number: ");
        int secondNumber = scanner.nextInt();

        int maxNum = 0, maxCount = 0;

        for (int i = firstNumber; i <= secondNumber; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++)
                if (i % j == 0)
                    count++;

            if (count > maxCount || (count == maxCount && i > maxNum)) {
                maxNum = i;
                maxCount = count;
            }
        }

        System.out.println("The number with the most divisors is: " + maxNum);
        System.out.println("Number of divisors: " + maxCount);

        scanner.close();
    }
}
