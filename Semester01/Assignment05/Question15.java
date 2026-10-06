package Semester01.Assignment05;

import java.util.Scanner;

public class Question15 {
    // Assigned On 08/12/2025 - Ninth Class
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n (n > 3): ");
        int n = scanner.nextInt();

        if (n <= 3) {
            System.out.println("n must be at least 3");
            scanner.close();
        } else {
            int a = 0;
            int b = 1;
            int c = 1;

            if (n > 3) {
                System.out.print(a + " " + b + " " + c + " ");
            }

            for (int i = 3; i < n; i++) {
                int next = a + b + c;
                System.out.print(next + " ");
                a = b;
                b = c;
                c = next;
            }
            System.out.println();
        }
        scanner.close();
    }
}
