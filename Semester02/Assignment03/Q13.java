package Semester02.Assignment03;

public class Q13 {
    static String toBinary(int n) {
        if (n == 0) {
            return "0";
        }
        if (n == 1) {
            return "1";
        }
        return toBinary(n / 2) + (n % 2);
    }
    // Assigned On: (Untracked)
    static void main() {
        System.out.println(toBinary(10)); // 1010
        System.out.println(toBinary(0)); // 0
    }
}