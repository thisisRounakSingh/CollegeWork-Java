import java.util.Scanner;

public class Question20 {
    // To be assigned.
    public static int countSpaces(String str) {
        int countSpace = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                countSpace++;
            }
        }
        return countSpace;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = input.nextLine();
        System.out.printf("Number of spaces in the string: %d%n", countSpaces(str));
        input.close();
    }
}
