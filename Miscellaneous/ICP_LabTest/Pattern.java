package ICP_LabTest;

import java.util.Scanner;

/*
To render the below pattern on the console.
Number of rows = 5
12345
2***6
3***7
4***8
56789
*/

public class Pattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = input.nextInt();

        for (int i = 1; i <= rows; i++) {
            int k = 1;
            for (int j = i; j < rows + i; j++) {
                if (i == 1 || i == rows || k == 1 || k == rows) {
                    System.out.print(j);
                } else {
                    System.out.print("*");
                }
                k++;
            }
            System.out.println();
        }
        System.out.println();

        input.close();
    }
}
