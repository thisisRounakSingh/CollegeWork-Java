package Semester01.Assignment03;

import java.util.Scanner;

public class Question05 {
    // Assigned On - 03/11/2025 - Fifth Class
    public static void main(String[] args) {
        /*
         * Triangle Equality Rule: The sum of any two side must be greater than the
         * third side. (Applies for the triangle.)
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first side: ");
        float firstSide = scanner.nextFloat();
        System.out.print("Enter second side: ");
        float secondSide = scanner.nextFloat();
        System.out.print("Enter third side: ");
        float thirdSide = scanner.nextFloat();

        if (firstSide + secondSide > thirdSide && secondSide + thirdSide > firstSide
                && thirdSide + firstSide > secondSide) {
            if (firstSide == secondSide && secondSide == thirdSide && thirdSide == firstSide) {
                System.out.println("The triangle is equilateral.");
            } else if (firstSide == secondSide || secondSide == thirdSide || thirdSide == firstSide) {
                System.out.println("The triangle is Isosceles.");
            } else if (firstSide != secondSide && secondSide != thirdSide && thirdSide != firstSide) {
                System.out.println("The triangle is scalene.");
            }
        } else {
            System.out.println("The give sides do not form a valid triangle.");
        }

        scanner.close();
    }
}
