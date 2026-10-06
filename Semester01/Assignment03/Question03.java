package Semester01.Assignment03;

import java.util.Scanner;

public class Question03 {
    // Assigned On - 27/10/2025 - Fifth Class
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input first number: ");
        int Int1 = scanner.nextInt();
        System.out.print("Input second number: ");
        int Int2 = scanner.nextInt();
        System.out.print("Input third number: ");
        int Int3 = scanner.nextInt();

        if (Int1 < Int2 && Int2 < Int3) {
            System.out.println("\"Increasing\"");
        } else if (Int1 > Int2 && Int2 > Int3) {
            System.out.println("\"Decreasing\"");
        } else {
            System.out.println("\"Neither increasing nor decreasing\"");
        }

        scanner.close();
    }
}
