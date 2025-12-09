package Semester01.Assignment05;

public class Question10 {
    // Assigned On 08/12/2025 - Ninth Class
    public static void main(String[] args) {
        System.out.println("Pattern using for loops:");
        int i = 4, j = 1;
        for (int row = 0; row < 5; row++) {
            for (int col = 0; col < 5; col++) {
                int value = 5 - col;
                if (col == i && value == j) {
                    System.out.print("* ");
                } else {
                    System.out.print(value + " ");
                }
            }
            i--;
            j++;
            System.out.println();
        }

        System.out.println();

        // OR...

        for (int row = 1; row <= 5; row++) {
            for (int col = 5; col >= 1; col--) {
                if (col == row) {
                    System.out.print("* ");
                } else {
                    System.out.print(col + " ");
                }
            }
            System.out.println();
        }
    }
}
