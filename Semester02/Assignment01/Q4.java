package Semester02.Assignment01;

import java.util.Scanner;

public class Q4 {
    // Assigned on 02/02/2026
    // It will only work for words containing 3 letter. Check Q4NoLetterCap.java.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a word containing three letter: ");
        String word = input.next();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int j2 = 0; j2 < 3; j2++) {
                    if (i != j && i != j2 && j != j2) {
                        System.out.print(word.charAt(i) + "" + word.charAt(j) + "" + word.charAt(j2));
                        System.out.println();
                    }
                }
            }
        }
        input.close();
    }
}
