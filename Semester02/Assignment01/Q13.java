package Semester02.Assignment01;

import java.util.Scanner;

public class Q13 {
    // Assigned on 02/02/2026
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of array a and b (both have the same length): ");
        int[] a = new int[scanner.nextInt()];
        int[] b = new int[a.length];
        System.out.print("Enter the content of array a: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }
        System.out.print("Enter the content of array b: ");
        for (int i = 0; i < a.length; i++) {
            b[i] = scanner.nextInt();
        }

        System.out.print("The Dot Product of array a and b (array c) is: ");
        int[] c = new int[a.length];
        for (int i = 0; i < b.length; i++) {
            c[i] = a[i] * b[i];
        }

        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + " ");
        }
        System.out.println();

        scanner.close();

    }
}
