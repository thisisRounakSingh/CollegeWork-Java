package Semester01.Assignment05;

import java.util.Scanner;

public class Question05 {
    // Assigned On 08/12/2025 - Ninth Class
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt(), s = 0, c = 0;
        for (int i = 1; i <= n; i++) {
            s += i;
            c += s;
        }

        System.out.println("The sum of the series is: " + c);
        scanner.close();
    }
}
