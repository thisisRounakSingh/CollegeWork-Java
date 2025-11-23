package Semester01.Assignment03;

import java.util.Scanner;

public class Question06 {
    // Assigned On - 03/11/2025 - Fifth Class
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a, b, c: ");
        double a = scanner.nextDouble(), b = scanner.nextDouble(), c = scanner.nextDouble();
        double determinant = Math.pow(b, 2) - 4 * a * c;
        float rootOne = (float) ((-b + Math.pow(determinant, 0.5)) / 2 * a);
        float rootTwo = (float) ((-b - Math.pow(determinant, 0.5)) / 2 * a);

        if (determinant > 0)
            System.out.println("The equation has two root: " + rootOne + " and " + rootTwo);
        else if (determinant == 0)
            // Both roots will evaluate to same value.
            System.out.println("The equation has one root: " + rootOne);
        else if (determinant < 0)
            // Both root will return Null.
            System.out.println("The equation has no real roots.");

        scanner.close();
    }
}
