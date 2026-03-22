package Semester02.Assignment01;

public class Q1 {
    // Assigned on 02/02/2026
    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]), count = 0;
        for (int i = number; i > 2; i /= 2) {
            count++;
        }
        System.out.printf("The positive integer greater than 2 from command line argument is %d%n", number);
        System.out.printf(
                "The number of times one must repeatedly divide this number by 2 before getting a value less than 2 is: %d%n",
                count);
    }
}
