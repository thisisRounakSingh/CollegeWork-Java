package Semester02.Assignment01;

import java.util.Scanner;

public class Q11 {
    // Assigned on 02/02/2026
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter three number with spacing (a, b and c): ");
        int a = scanner.nextInt(), b = scanner.nextInt(), c = scanner.nextInt();
        System.out.printf("In order of a+b=c: %b%n", a + b == c);
        System.out.printf("In order of a=b-c: %b%n", a == b - c);
        System.out.printf("In order of a*b=c: %b%n", a * b == c);
        scanner.close();
    }
}
