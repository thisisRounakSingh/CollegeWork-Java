package Semester01.Assignment06;

import java.util.Scanner;

public class Question11 {
    // Assigned On 22/12/2025 - Eleventh Class

    public static int count(String str, char a) {
        int count = 0;
        for (int i = 0; i <= str.length() - 1; i++) {
            if (str.charAt(i) == a) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        System.out.print("Enter a character: ");
        char c = input.next().charAt(0);
        System.out.printf("The number of occurrences of '%c' in \"Welcome\" is %d%n", c, count(str, c));
        input.close();
    }
}
