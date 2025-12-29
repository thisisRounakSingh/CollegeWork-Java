import java.util.Scanner;

public class Question08 {
    // To be assigned.

    /*
    % (with another variable) helps extract last digit.
    / (with same variable) help eject the last digit from the original one.
    */
    public static int largestDigit(int n) {
        int lD = 0, prevValue = n % 10;
        for (int i = n; i > 0; i /= 10) {
            if (i % 10 >= prevValue) {
                lD = i % 10;
                prevValue = i % 10;
            }
        }
        return lD;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = input.nextInt();
        System.out.printf("Largest Digit: %d%n", largestDigit(n));
        input.close();
    }
}
