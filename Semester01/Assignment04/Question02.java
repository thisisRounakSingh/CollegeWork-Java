package Semester01.Assignment04;

import java.util.Scanner;

public class Question02 {
    // Assigned On 10/11/2025 - Sixth Class
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int numberOFRows = scanner.nextInt();
        scanner.close();

        String outputString = "";
        for (int i = 1; numberOFRows != 0; i++) {
            System.out.println(outputString = outputString + i + outputString);
            numberOFRows--;
        }
    }
}
