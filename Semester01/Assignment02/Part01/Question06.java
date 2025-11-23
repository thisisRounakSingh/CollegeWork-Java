package Semester01.Assignment02.Part01;

import java.util.Scanner;

public class Question06 {
    // Assigned On - 06/10/2025 - Third Class
    public static void main(String[] args) {
        double x1;
        double y1;
        double x2;
        double y2;
        double x3;
        double y3;
        double semiPerimeter;
        double side1;
        double side2;
        double side3;
        double area;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the three points for a triangle: ");
        x1 = scanner.nextDouble();
        y1 = scanner.nextDouble();
        x2 = scanner.nextDouble();
        y2 = scanner.nextDouble();
        x3 = scanner.nextDouble();
        y3 = scanner.nextDouble();

        side1 = Math.pow((Math.pow((x2 - x1), 2) + (Math.pow((y2 - y1), 2))), 0.5);
        side2 = Math.pow((Math.pow((x3 - x2), 2) + (Math.pow((y3 - y2), 2))), 0.5);
        side3 = Math.pow((Math.pow((x3 - x1), 2) + (Math.pow((y3 - y1), 2))), 0.5);

        semiPerimeter = (side1 + side2 + side3) / 2;

        area = Math.sqrt(semiPerimeter * ((semiPerimeter - side1) * (semiPerimeter - side2) * (semiPerimeter - side3)));

        System.out.print("The area of the triangle is: " + (float) area + "\n");

        scanner.close();
    }
}
