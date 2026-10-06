package Semester02.Assignment01;

import java.util.Scanner;

public class Q12 {
    // Assigned on 02/02/2026
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type few words with either spacing or in new lines (type 'exit' when done): ");
        String line = "";
        while (scanner.hasNextLine()) {
            String currentLine = scanner.nextLine();
            if (currentLine.equalsIgnoreCase("exit"))
                break;
            line = currentLine + "\n" + line;
        }
        System.out.println(line);
        scanner.close();
    }
}
