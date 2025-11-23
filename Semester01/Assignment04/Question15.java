package Semester01.Assignment04;

public class Question15 {
    // To be assigned.
    public static void main(String[] args) {
        int sum = 0, squaredSum = 0;
        for (int i = 1; i <= 100; i++) {
            squaredSum += i * i;
            sum += i;
        }

        System.out.println("Sum of squares of first 100 natural numbers: " + squaredSum);
        System.out.println("Square of first 100 natural numbers: " + sum * sum);
        System.out.println("Difference = " + (sum * sum - squaredSum));
    }
}