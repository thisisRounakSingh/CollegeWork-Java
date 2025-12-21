import java.util.Scanner;

public class Question01 {
    // Assigned On 15/12/2025 - Tenth Class

    /*
    * Writing all the methods that will be used to perform
    * calculation as demanded. Note that y > x.
    */

    public static int additionSimple(int x, int y) {
        return x + y;
    }

    // To check if y > x.
    public static int subtractionSimple(int x, int y) {
        return y - x;
    }

    public static int multiplicationSimple(int x, int y) {
        return x * y;
    }

    // To check if x == 0.
    public static double divisionSimple(int x, int y) {
        return y / x;
    }

    public static int remainderSimple(int n, int m) {
        return n % m;
    }

    // To check if n >= 0.
    public static double squareRootSimple(int n) {
        return Math.sqrt(n);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice, firstNumber = 0, secondNumber = 0;

        do {
            System.out.println("----- SIMPLE CALCULATOR -----");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Remainder");
            System.out.println("6. Square Root");
            System.out.println("7. Exit");

            System.out.print("Choose an option: ");
            choice = input.nextInt();

            if (choice >= 1 && choice <= 5) {
                System.out.print("Enter first number (x): ");
                firstNumber = input.nextInt();
                System.out.print("Enter second number (y) : ");
                secondNumber = input.nextInt();
                System.out.println("x = " + firstNumber + " y = " + secondNumber);
            } else if (choice == 6) {
                System.out.print("Enter a number: ");
                firstNumber = input.nextInt();
                System.out.println("n = " + firstNumber);
            }

            System.out.println();
            switch (choice) {
            case 1:
                System.out.println("Result (x+y): " + additionSimple(firstNumber, secondNumber));
                break;

            case 2:
                if (firstNumber > secondNumber) {
                    System.out.println("Please enter second number greater than the first.");
                    break;
                } else {
                    System.out.println("Result (y-x): " + subtractionSimple(firstNumber, secondNumber));
                    break;
                }

            case 3:
                System.out.println("Result (x*y): " + multiplicationSimple(firstNumber, secondNumber));
                break;

            case 4:
                if (firstNumber == 0) {
                    System.out.println("Can't divide by 0, ensure first number (x) is not zero!");
                    break;
                } else {
                    System.out.println("Result (y/x): " + divisionSimple(firstNumber, secondNumber));
                    break;
                }

            case 5:
                System.out.println("Result (x%y): " + remainderSimple(firstNumber, secondNumber));
                break;

            case 6:
                if (firstNumber < 0) {
                    System.out.println("Square root of a negative number is not allowed.");
                    break;
                } else {
                    System.out.println("Result (root n): " + squareRootSimple(firstNumber));
                    break;
                }
            case 7:
                System.out.println("Exiting... Thank you!");
                break;

            default:
                System.out.println("Invalid input, please try again!");
            }
            System.out.println();

        } while (choice != 7);

        input.close();
    }
}
