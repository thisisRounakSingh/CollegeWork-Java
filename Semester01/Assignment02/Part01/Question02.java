package Semester01.Assignment02.Part01;

import java.util.Scanner;

public class Question02 {
    // Assigned On - 06/10/2025 - Third Class
    public static void main(String[] args) {
        double radius;
        double length;
        double area;
        double volume;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius and length of a cylinder: ");
        radius = scanner.nextDouble();
        length = scanner.nextDouble();

        area = Math.PI * radius * radius;
        volume = area * length;

        System.out.print("The area is " + area);
        System.out.print("\nThe volume is " + volume + "\n");

        scanner.close();
    }
}
