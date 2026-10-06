package Semester01.Assignment07;

import java.util.Scanner;

public class Question02 {
    // Assigned On 22/12/2025 - Eleventh Class

    public static void readInput(int[] counts) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter integers between 1 and 100: ");
        for (int i = 0; i < counts.length; i++) {
            counts[i] = input.nextInt();
            if (counts[i] == 0)
                break;
        }
        input.close();
    }

    public static void displayCounts(int[] counts) {
        // Using index as the number.
        boolean[] isVisited = new boolean[100];

        for (int i = 0; i < counts.length; i++) {
            if (counts[i] == 0)
                break;

            /*
            * OR Use:
            * if (isVisited[counts[i]]) { 
            *   continue;
            * }
            */

            if (!isVisited[counts[i]]) {
                int count = 0;
                for (int j = 0; j < counts.length; j++) {
                    if (counts[j] == 0)
                        break;

                    if (counts[j] == counts[i])
                        count++;
                }

                System.out.printf("%d occurs %d times.%n", counts[i], count);
                isVisited[counts[i]] = true;
            }
        }
    }

    public static void main(String[] args) {
        int[] counts = new int[100];
        readInput(counts);
        displayCounts(counts);
    }
}
