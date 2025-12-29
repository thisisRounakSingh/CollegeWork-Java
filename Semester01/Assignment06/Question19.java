import java.util.Scanner;

public class Question19 {
    // To be assigned.
    public static boolean checkConsecutive(int first, int second, int third) {
        return third - second == 1 && second - first == 1;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the first number: ");
        int fn = input.nextInt();
        System.out.print("Input the second number: ");
        int sn = input.nextInt();
        System.out.print("Input the third number: ");
        int tn = input.nextInt();
        System.out.printf("Check whether the three said numbers are consecutive or not! %s%n",
                checkConsecutive(fn, sn, tn) ? "True" : "False");

        input.close();
    }
}
