package Semester01.Assignment02.Part01;

import java.util.Scanner;

public class Question04 {
    // Assigned On - 06/10/2025 - Third Class
    public static void main(String[] args) {
        double side;
        double area;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the side: ");
        side = scanner.nextDouble();

        area = ((3 * Math.sqrt(3)) / 2) * Math.pow(side, 2);

        System.out.println("The area of the hexagon is " + area);

        scanner.close();
    }
}
