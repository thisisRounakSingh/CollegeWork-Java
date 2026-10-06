package Semester01.Assignment02.Part01;

import java.util.Scanner;

public class Question05 {
    // Assigned On - 06/10/2025 - Third Class
    public static void main(String[] args) {
        double x1;
        double y1;
        double x2;
        double y2;
        double distance;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter x1 and y1: ");
        x1 = scanner.nextDouble();
        y1 = scanner.nextDouble();
        System.out.print("Enter x2 and y2: ");
        x2 = scanner.nextDouble();
        y2 = scanner.nextDouble();

        distance = Math.pow((Math.pow((x2 - x1), 2) + (Math.pow((y2 - y1), 2))), 0.5);

        System.out.print("The distance between the two points is " + distance + "\n");

        scanner.close();
    }
}
