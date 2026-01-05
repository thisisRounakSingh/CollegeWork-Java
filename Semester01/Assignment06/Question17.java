import java.util.Scanner;

public class Question17 {
    // Assigned On 22/12/2025 - Eleventh Class

    public static char middleCharacter(String str) {
        char middle = ' ';
        if (str.length() % 2 == 0) {
            /*
            * There are two middle characters here,
            * (n/2 - 1) and n/2, we need n/2.
            */
            middle = str.charAt(str.length() / 2);

        } else if (str.length() % 2 != 0) {
            /* Integer division rounds down. */
            middle = str.charAt(str.length() / 2);
        }
        return middle;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a string: ");
        String str = input.nextLine();
        System.out.printf("The middle character in the string: %c%n", middleCharacter(str));
        input.close();
    }
}
