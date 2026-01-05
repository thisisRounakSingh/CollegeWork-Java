package Semester01.Assignment07;

import java.util.Scanner;

public class Question10 {
    // Assigned On 22/12/2025 - Eleventh Class

    public static int[] eliminateDuplicate(int[] list) {
        boolean[] seen = new boolean[101];
        int uniqueCount = 0;

        for (int i = 0; i < list.length; i++) {
            if (!seen[list[i]]) {
                seen[list[i]] = true;
                uniqueCount++;
            }
        }

        seen = new boolean[101];

        int[] result = new int[uniqueCount];
        int index = 0;

        for (int i = 0; i < list.length; i++) {
            if (!seen[list[i]]) {
                result[index] = list[i];
                index++;
                seen[list[i]] = true;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten number: ");
        int[] list = new int[10];
        for (int i = 0; i < list.length; i++) {
            list[i] = input.nextInt();
        }

        System.out.print("The distinct numbers are: ");
        for (int i = 0; i < eliminateDuplicate(list).length; i++) {
            System.out.printf("%d ", eliminateDuplicate(list)[i]);
        }
        System.out.println();
        input.close();
    }
}
