package Semester02.Assignment01;

public class Q3OneTo1K {
    // Assigned on 02/02/2026
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 1000; i++) {
            int sum = 0, product = 1;
            for (int j = i; j > 0; j /= 10) {
                sum += j % 10;
                product *= j % 10;
            }

            if (sum == product) {
                count++;
            }
        }

        System.out.printf("The total spy numbers between 1 and 1000 are: %d%n", count);
    }
}
