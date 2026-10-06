package Semester02.Assignment03;

import java.util.Scanner;

public class Q2 {
    // Assigned On: (Untracked)
    static void main() {
        String[] colorArray = new String[3];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input 3 colors: ");
        try {
            for (int i = 1; i < colorArray.length; i++) {
                colorArray[i] = scanner.next();
            }
            System.out.println("Attempting to access a null location.");
            System.out.println(colorArray[0].length());

            System.out.println("Attempting to access invalid 4th slot...");
            System.out.println(colorArray[4]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array Index Out of Bounds.");
        } catch (NullPointerException e) {
            System.out.println("Error: Attempted to read a null object reference.");
        } finally {
            System.out.println("Exiting the try-catch block safety net.");
            scanner.close();
        }
        System.out.println("\nPrinting the array contents:");
        for (String s : colorArray) {
            System.out.println(s);
        }
    }
}
