package Semester02.Assignment01;

import java.util.Scanner;

public class Q10 {
    // Assigned on 02/02/2026
    public static double sumColumn(double[][] m, int columnIndex) {
        double sum = 0;
        for (int i = 0; i < m.length; i++) {
            sum += m[i][columnIndex];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a 3-by-4 matrix row by row: ");
        double[][] array = new double[3][4];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                array[i][j] = scanner.nextDouble();
            }
        }
        System.out.printf("Sum of the elements at column 0 is %.2f%n", sumColumn(array, 0));
        scanner.close();
    }
}
