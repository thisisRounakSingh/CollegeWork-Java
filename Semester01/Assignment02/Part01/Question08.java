package Semester01.Assignment02.Part01;

import java.util.Scanner;

public class Question08 {
    // Assigned On - 13/10/2025 - Fourth Class
    public static void main(String[] args) {
        int numberOfEggs;
        int grossEggs;
        int remainingEggsAfterGross;
        int remainingDozenEggs;
        int remainingLeftOverEggs;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of eggs: ");
        numberOfEggs = scanner.nextInt();

        grossEggs = numberOfEggs / 144;
        remainingEggsAfterGross = numberOfEggs % 144;
        remainingDozenEggs = remainingEggsAfterGross / 12;
        remainingLeftOverEggs = remainingEggsAfterGross % 12;

        System.out.println("Total number of eggs is " + grossEggs + " gross, " + remainingDozenEggs + " dozens, and "
                + remainingLeftOverEggs + " left over eggs.");

        scanner.close();
    }
}
