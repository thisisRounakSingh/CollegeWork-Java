package Semester01.Assignment06;

import java.util.Scanner;

public class Question16 {
    // Assigned On 22/12/2025 - Eleventh Class

    public static boolean isValidPassword(String password) {
        int digitCount = 0;
        boolean response = true;
        for (int i = 0; i < password.length(); i++) {
            if (password.charAt(i) >= 47 && password.charAt(i) <= 58) {
                digitCount++;
            }
        }

        if (digitCount >= 2) {
            if (password.length() >= 8) {
                for (int i = 0; i < password.length(); i++) {
                    if (password.charAt(i) >= 65 && password.charAt(i) <= 90
                            || password.charAt(i) >= 97 && password.charAt(i) <= 122
                            || password.charAt(i) >= 48 && password.charAt(i) <= 57) {
                        response = true;
                    } else {
                        response = false;
                    }
                }
            } else {
                response = false;
            }

        } else {
            response = false;
        }

        return response;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a password: ");
        String password = input.nextLine();
        System.out.printf("Input: \"%s\" --> Output: %s%n", password,
                isValidPassword(password) ? "Valid Password" : "Invalid Password");
        input.close();
    }
}
