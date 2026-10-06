package Semester02.Assignment03;

public class Q14 {
    // Assigned On: (Untracked)
    static int multiply(int a, int b) {
        if (b == 0) {
            return 0;
        }
        if (b > 0) {
            return a + multiply(a, b - 1);
        }
        return -multiply(a, -b);
    }

    static void main() {
        System.out.println(multiply(6, 4));   // 24
        System.out.println(multiply(6, -3));  // -18
    }
}
