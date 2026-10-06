package Semester01.Assignment06;

public class Question03 {
    // Assigned On 22/12/2025 - Eleventh Class

    /**
     * {@code Pentagonal Number} - n(3n-1)/2.
     * n = 1,2,...,n
     * @param n The pentagonal term in pentagonal series.
     * @return Pentagonal Number at n.
     */
    public static int getPentagonalNumber(int n) {
        return n * (3 * n - 1) / 2;
    }

    public static void main(String[] args) {
        int check11 = 11;
        for (int i = 1; i < 101; i++) {
            if (i == check11) {
                System.out.println();
                check11 += 10;
            }
            System.out.printf("%d \t", getPentagonalNumber(i));
        }
        System.out.println();
    }
}
