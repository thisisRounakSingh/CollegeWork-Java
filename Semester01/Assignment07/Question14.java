package Semester01.Assignment07;

import java.util.Scanner;

public class Question14 {
    // Assigned On 22/12/2025 - Eleventh Class

    public static String decimalToOctal(int decimal) {
        String response = "", reverse = "";
        int temp = decimal;
        while (temp > 0) {
            response += temp % 8;
            temp /= 8;
        }

        for (int i = response.length() - 1; i >= 0; i--) {
            reverse += response.charAt(i);
        }

        return reverse;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        System.out.printf("Octal Representation: %s%n", decimalToOctal(input.nextInt()));
        input.close();
    }
}
