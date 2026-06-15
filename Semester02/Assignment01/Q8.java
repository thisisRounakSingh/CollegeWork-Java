package Semester02.Assignment01;

import java.util.Scanner;

public class Q8 {
    // Assigned on 02/02/2026
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of Row and Columns of 2D-Array: ");
        int[][] array = new int[scanner.nextInt()][scanner.nextInt()];
        System.out.print("Enter elements of 2D-Array: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
        System.out.println("The elements of 2D Array are: ");
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.printf("%d ", array[i][j]);
                sum += array[i][j];
            }
            System.out.println();
        }
        System.out.printf("The sum of elements of the 2D-Array is: %d%n", sum);
        scanner.close();
    }
}
