package Semester01.Assignment06;

import java.util.Scanner;

public class Question13 {
    // Assigned On 22/12/2025 - Eleventh Class

    public static int countWords(String str) {
        int count = 1;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String str = input.nextLine();
        System.out.printf("The number of words in the sentence is %d%n", countWords(str));
        input.close();
    }
}
