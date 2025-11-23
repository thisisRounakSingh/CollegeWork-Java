package Semester01.Assignment03;

import java.util.Scanner;

public class Question02 {
    // Assigned On - 27/10/2025 - Fifth Class
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of steps walked: ");
        int steps = scanner.nextInt();
        if (steps > 10000) {
            System.out.println("Good job! You are active today");
        } else {
            System.out.println("You need to walk more for good health.");
        }
        scanner.close();
    }
}
