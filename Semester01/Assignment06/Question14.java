import java.util.Scanner;

public class Question14 {
    // Assigned On 22/12/2025 - Eleventh Class

    public static String toTitleCase(String str) {
        char[] strArray = str.toCharArray();
        for (int i = 0; i < strArray.length; i++) {
            if (strArray[i] == ' ') {
                if (strArray[i + 1] >= 97 && strArray[i + 1] <= 122) {
                    strArray[i + 1] -= 32;
                }
            }
        }

        if (strArray[0] >= 97 && strArray[0] <= 122) {
            strArray[0] -= 32;
        }

        return new String(strArray);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        System.out.printf("Converted string: %s%n", toTitleCase(str));
        input.close();
    }
}
