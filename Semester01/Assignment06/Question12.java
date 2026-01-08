package Semester01.Assignment06;

import java.util.Scanner;

public class Question12 {
    // Assigned On 22/12/2025 - Eleventh Class

    public static int countVowels(String str) {
        char vowels[] = { 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' };
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < vowels.length; j++) {
                if (str.charAt(i) == vowels[j]) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        System.out.printf("The number of vowels in \"%s\" is %d%n", str, countVowels(str));
        input.close();
    }
}
