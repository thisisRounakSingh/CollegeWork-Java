package Semester02.Assignment01;

import java.util.Scanner;

public class Q3SpyTillRange {
    // Assigned on 02/02/2026
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter range: ");
        int range = input.nextInt();

        int spyArray[] = new int[range];
        int count = 0;
        for (int i = 1; i <= range; i++) {
            int sum = 0, product = 1;
            for (int j = i; j > 0; j /= 10) {
                sum += j % 10;
                product *= j % 10;
            }

            if (sum == product) {
                // count value is used, then after incremented.
                spyArray[count++] = i;
            }
        }

        System.out.printf("Total spy numbers till %d are: %d%n", range, count);
        /*
        As the range increase, so does the character length of number.
        Therefore, it is essential to first calculate that.
        */
        int maxNum = (count > 0) ? spyArray[count - 1] : 0;
        int width = String.valueOf(maxNum).length() + 2;

        /* 
        Using count variable to print, to avoid printing zero if present in array.
        */
        for (int i = 0; i < count; i++) {
            System.out.printf("%" + width + "d", spyArray[i]);

            /*
            (i + 1) will create a new line.
            After every 10th number.
            As i = 0, so 0 to 9 are 10 numbers.            
            */
            if ((i + 1) % 10 == 0) {
                System.out.println();
            }

        }

        // Create new line only if needed.
        if (count % 10 != 0) {
            System.out.println();
        }

        input.close();
    }
}
