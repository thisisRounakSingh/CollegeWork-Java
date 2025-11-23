package Semester01.Assignment02.Part02;

public class Question09 {
    // Assigned On - 27/10/2025 - Fifth Class
    public static void main(String[] args) {
        int firstDigit = (int) args[0].charAt(0);
        int secondDigit = (int) args[0].charAt(3);

        int sum = (firstDigit - 48) + (secondDigit - 48);
        System.out.println("Sum of the first and last digit of " + args[0] + " is: " + sum);
    }
}
