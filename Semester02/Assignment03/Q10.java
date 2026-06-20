package Semester02.Assignment03;

public class Q10 {
    public static int fibonacciNumber(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return fibonacciNumber(n - 1) + fibonacciNumber(n - 2);
    }

    // Assigned On: (Untracked)
    static void main() {
        System.out.println(fibonacciNumber(5));
    }
}
