import java.util.Scanner;

public class NumberDigitsToSum {
    public static void main(String[] args) {
        int number;
        int sum;
        int tempNumber;
        int digit;

        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter any number between 100 and 1000: ");
        number = scanner.nextInt();

        if (number < 100 || number > 1000) {
            System.out.println("The number should be between 100 and 1000.");
        } else {
            sum = 0;
            tempNumber = number;

            /* This program can be made even without using `while` loop or any loop for that matter. In that case we need to know the total digits the number will have and repeat the logic inside the `while` loop that many times. */

            while (tempNumber > 0) {
                digit = tempNumber % 10; // 4 % 10 = 4.
                /* Integer level division. */
                sum = sum + digit;
                tempNumber = tempNumber / 10;
                /* In integer division the decimal part is removed. */
            }
            System.out.println("The sum of the digits of " + number + " is: " + sum);
        }

        scanner.close();
    }
}
