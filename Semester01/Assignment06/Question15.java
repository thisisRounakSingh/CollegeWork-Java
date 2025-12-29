import java.util.Scanner;

public class Question15 {
    // To be assigned.
    public static boolean isPalindrome(String str) {
        char[] strArr = str.toCharArray();
        char revStr[] = new char[strArr.length];
        int r = 0;
        for (int i = strArr.length - 1; i >= 0; i--) {
            revStr[r] = strArr[i];
            r++;
        }

        if (str.equals(new String(revStr))) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        System.out.printf(isPalindrome(str) ? "%s is palindrome.%n" : "%s is not palindrome.%n", str);
        input.close();
    }
}
