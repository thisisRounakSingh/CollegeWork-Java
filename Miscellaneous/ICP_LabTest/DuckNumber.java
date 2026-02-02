package ICP_LabTest;

import java.util.Scanner;

/*
Duck Number: A positive integer that contains at least one zero.
             Zero can we anywhere except at the leading place.

Question: Take 5 numbers from the user.

Challenge: Print only those which are duck numbers.

Constraints: String (i.e) no string function, except charAt() class is not allowed. try-catch not allowed.
*/

public class DuckNumber {
    public static void main(String[] args) {
        // Take 5 inputs from the user.
        // If the number has leading zero or has no zero in it then DON'T print it.
        // Otherwise print the number.

        Scanner input = new Scanner(System.in);
        System.out.print("Enter five numbers (give space after each): ");
        int num[] = new int[5];

        for (int i = 0; i < num.length; i++) {
            String number = input.next();
            int firstCharacter = number.charAt(0);
            int n = Integer.parseInt(number);

            if (firstCharacter != 48 && n > 99) {
                num[i] = n;
            }
        }

        System.out.println("Duck number from the entered number are: ");
        for (int i = 0; i < num.length; i++) {
            System.out.printf(num[i] == 0 ? "" : "%d ", num[i]);
        }
        System.out.println();
        input.close();

    }
}
