package Semester02.Assignment03;

public class Q15 {
    static String reverse(String s) {
        if (s.isEmpty()) {
            return s;
        }
        return reverse(s.substring(1)) + s.charAt(0);
    }

    /* Assigned On: (Untracked) */
    static void main() {
        System.out.println(reverse("pots&pans")); // snap&stop
    }
}
