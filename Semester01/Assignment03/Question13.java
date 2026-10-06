package Semester01.Assignment03;

import java.util.Scanner;

public class Question13 {
    // Assigned On 10/11/2025 - Sixth Class
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the x coordinate: ");
        float x = scanner.nextFloat();

        System.out.print("Enter the y coordinate: ");
        float y = scanner.nextFloat();

        if (x == 0) {
            System.out.println("(" + x + ", " + y + ")" + " is on the Y-axis");
        } else if (y == 0) {
            System.out.println("(" + x + ", " + y + ")" + " is on the X-axis");
        } else if (x < 0 && y < 0) {
            System.out.println("(" + x + ", " + y + ")" + " is in quadrant III");
        } else if (x < 0 && y > 0) {
            System.out.println("(" + x + ", " + y + ")" + " is in quadrant II");
        } else if (x > 0 && y > 0) {
            System.out.println("(" + x + ", " + y + ")" + " is in quadrant I");
        } else if (x > 0 && y < 0) {
            System.out.println("(" + x + ", " + y + ")" + " is in quadrant IV");
        }
        scanner.close();
    }
}
