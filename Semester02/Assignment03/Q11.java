package Semester02.Assignment03;

public class Q11 {
    static int gcd(int m, int n) {
        if (n == 0) {
            return m;
        }
        return gcd(n, m % n);
    }

    // Assigned On: (Untracked)
    static void main() {
        System.out.println(gcd(48, 18));
    }
}
