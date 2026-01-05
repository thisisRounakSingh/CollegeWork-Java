import java.util.Scanner;

public class Question05 {
    // Assigned On 22/12/2025 - Eleventh Class

    public static int collatzLength(int n) {
        int count = 0;
        while (n != 1) {
            if (n % 2 == 0) {
                n /= 2;
                count++;
            } else if (n % 2 != 0) {
                n = 3 * n + 1;
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = inputScanner.nextInt();

        System.out.printf("Collatz length: %d%n", collatzLength(n));
        inputScanner.close();
    }
}
