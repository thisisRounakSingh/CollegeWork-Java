package Semester01.Assignment03;

import java.util.Scanner;

public class Question01 {
    // Assigned On - 27/10/2025 - Fifth Class
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the age of the person: ");
        int age = scanner.nextInt();

        if (age >= 18)
            System.out.println("You are eligible to cast your vote.");
        scanner.close();
    }
}
