package Semester02.Assignment01;

import java.util.Scanner;

public class Q14 {
    // Assigned on 02/02/2026
    public static double[][] addMatrix(double[][] a, double[][] b) {
        double[][] c = new double[a.length][b.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        return c;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the RowXColumn of both the matrices: ");
        int length = scanner.nextInt();
        double[][] a = new double[length][length];
        double[][] b = new double[a.length][a.length];

        System.out.println("Construct matrix 'a' ");
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b.length; j++) {
                a[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Construct matrix 'b'");
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b.length; j++) {
                b[i][j] = scanner.nextInt();
            }
        }

        double[][] d = addMatrix(a, b);

        System.out.println("a + b is: ");
        for (int i = 0; i < d.length; i++) {
            for (int j = 0; j < d.length; j++) {
                System.out.printf("%.2f ", d[i][j]);
            }
        }
        System.out.println();

        scanner.close();
    }
}
