package Semester01.Assignment02.Part01;

import java.util.Scanner;

public class Question01 {
    // Assigned On - 06/10/2025 - Third Class
    public static void main(String[] args) {
        double celsius;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a degree in Celsius: ");
        celsius = scanner.nextDouble();
        System.out.print("\n" + celsius + " Celsius is " + ((9.0 / 5.0) * celsius + 32) + " Fahrenheit\n");
        scanner.close();
    }
}
