package Semester02.Assignment01;

import java.util.Scanner;

public class Q7 {
    // Assigned on 02/02/2026
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of elements of Array: ");
        int[] array = new int[scanner.nextInt()];

        System.out.print("Enter elements of the array: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        int maxNum = array[0], maxOccurrence = 1, maxPosition = 0, minNum = array[0], minOccurrence = 1,
                minPosition = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxNum) {
                maxNum = array[i];
                maxOccurrence = 0;
                maxPosition = maxPosition == 0 ? i : maxPosition;
            }
            if (array[i] == maxNum) {
                maxOccurrence++;
            }
        }
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minNum) {
                minNum = array[i];
                minOccurrence = 0;
            }
            if (array[i] == minNum) {
                minOccurrence++;
                minPosition = i;
            }
        }
        System.out.printf("Maximum element of Array is %d and occurs %d times.%n", maxNum, maxOccurrence);
        System.out.printf("Minimum element of Array is %d and occurs %d times.%n", minNum, minOccurrence);
        System.out.printf("First occurrence of maximum element is at position %d%n", maxPosition + 1);
        System.out.printf("Last occurrence of minimum element is at position %d%n", minPosition + 1);
        scanner.close();
    }
}
