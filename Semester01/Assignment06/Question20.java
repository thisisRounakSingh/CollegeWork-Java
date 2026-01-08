package Semester01.Assignment06;

import java.util.Scanner;

public class Question20 {
    // Assigned On 22/12/2025 - Eleventh Class

    public static int countSpaces(String str) {
        int countSpace = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                countSpace++;
            }
        }
        return countSpace;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = input.nextLine();
        System.out.printf("Number of spaces in the string: %d%n", countSpaces(str));
        input.close();
    }
}
