package Semester02.Assignment03;

public class Q16 {
    // Assigned On: (Untracked)
    static boolean isPalindrome(String s) {
        if (s.length() <= 1) {
            return true;
        }
        if (s.charAt(0) != s.charAt(s.length() - 1)) {
            return false;
        }
        return isPalindrome(s.substring(1, s.length() - 1));
    }

    static void main() {
        System.out.println(isPalindrome("racecar")); // true
        System.out.println(isPalindrome("hello"));   // false
    }
}
