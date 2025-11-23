package Semester01.Assignment03;

import java.util.Scanner;

public class Question10 {
    // Assigned On - 10/11/2025 - Sixth Class
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter marks: ");
        int marks = (int) scanner.nextDouble();

        scanner.close();

        String grade;
        int gradeSection = (marks > 100) ? -1 : marks / 10;

        switch (gradeSection) {
            case -1:
                grade = "Invalid marks! Please enter marks between 0 and 100";
                break;
            case 10:
            case 9:
                grade = "O";
                break;
            case 8:
                grade = "A";
                break;
            case 7:
                grade = "B";
                break;
            case 6:
                grade = "C";
                break;
            case 5:
                grade = "D";
                break;
            case 4:
                grade = "E";
                break;
            default:
                grade = "F";
                break;
        }
        /*
         * `break` is required as without switch-case will run no matter the condition.
         */
        System.out.println("Grade: " + grade);

    }
}
