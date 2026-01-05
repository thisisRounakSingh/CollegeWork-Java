import java.util.Scanner;

public class Question09 {
    // Assigned On 22/12/2025 - Eleventh Class

    public static int reverseInt(int number) {
        int reversed = 0;
        while (number != 0) {
            int lastDigit = number % 10;
            reversed = reversed * 10 + lastDigit;
            number /= 10;
        }

        return reversed;
    }

    public static boolean isPalindrome(int number) {
        return number == reverseInt(number);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = input.nextInt();
        System.out.printf(isPalindrome(n) ? "%d is a palindrome%n" : "%d is not a palindrome.%n", n);
        input.close();

    }
}
