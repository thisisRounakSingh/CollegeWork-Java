package Semester02.Assignment03;

public class Q18 {
    // Assigned On: (Untracked)
static void hanoi(int n, char from, char to, char aux) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + from + " to " + to);
            return;
        }
        hanoi(n - 1, from, aux, to);
        System.out.println("Move disk " + n + " from " + from + " to " + to);
        hanoi(n - 1, aux, to, from);
    }

    static void main() {
        int n = 3;
        hanoi(n, 'A', 'C', 'B');
    }
}
