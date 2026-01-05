import java.util.Scanner;

public class Question21 {
    // Assigned On 22/12/2025 - Eleventh Class

    public static void countCharacters(String str) {
        // Upper case: 65-90.
        // Lower case: 97-122
        // Digit: 48-57
        // Special characters: 33-47, 58-64,91-96,123-126.
        int upperCase = 0, lowerCase = 0, digit = 0, specialCharacters = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 65 && str.charAt(i) <= 90) {
                upperCase++;
            } else if (str.charAt(i) >= 97 && str.charAt(i) <= 122) {
                lowerCase++;
            } else if (str.charAt(i) >= 48 && str.charAt(i) <= 57) {
                digit++;
            } else if (str.charAt(i) >= 33 && str.charAt(i) <= 47 || str.charAt(i) >= 58 && str.charAt(i) <= 64
                    || str.charAt(i) >= 91 && str.charAt(i) <= 96 || str.charAt(i) >= 123 && str.charAt(i) <= 126
                    || str.charAt(i) == 32) {
                specialCharacters++;
            }
        }

        System.out.printf("Uppercase letters: %d%nLowercase letters: %d%nDigits: %d%nSpecial Characters: %d%n",
                upperCase, lowerCase, digit, specialCharacters);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        countCharacters(input.nextLine());
        input.close();
    }
}
