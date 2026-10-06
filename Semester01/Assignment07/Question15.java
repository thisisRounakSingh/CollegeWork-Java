package Semester01.Assignment07;

import java.util.Scanner;

public class Question15 {
    // Assigned On 22/12/2025 - Eleventh Class

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 10 integers: ");
        int array[] = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }

        int index = array.length - 1;

        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] != 0) {
                array[index] = array[i];
                index--;
            }
        }

        while (index >= 0) {
            array[index] = 0;
            index--;
        }

        System.out.println("After moving all zeros to the beginning: ");
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d ", array[i]);
        }
        System.out.println();

        input.close();
    }
}
