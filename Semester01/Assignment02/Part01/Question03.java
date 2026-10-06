package Semester01.Assignment02.Part01;

import java.util.Scanner;

public class Question03 {
    // Assigned On - 06/10/2025 - Third Class
    public static void main(String[] args) {
        double basicSalary;
        double DA;
        double HRA;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the basic salary: ");
        basicSalary = scanner.nextDouble();

        DA = 0.4 * basicSalary;
        HRA = 0.2 * basicSalary;

        System.out.println("DA is " + DA);
        System.out.println("HRA is " + HRA);
        System.out.print("Gross salary is " + (basicSalary + DA + HRA) + "\n");

        scanner.close();
    }
}
