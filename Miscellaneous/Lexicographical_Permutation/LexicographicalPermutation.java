package Lexicographical_Permutation;

import java.util.Scanner;

public class LexicographicalPermutation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String s = input.next();
        char[] arr = s.toCharArray();

        insertionSort(arr);
        do {
            System.out.println(new String(arr));
        } while (nextPermutation(arr));
        input.close();
    }

    private static void insertionSort(char[] a) {
        for (int i = 1; i < a.length; i++) {
            char key = a[i];
            int j = i - 1;

            while (j >= 0 && a[j] > key) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = key;
        }
    }

    private static boolean nextPermutation(char[] a) {
        int i = a.length - 2; // pivot

        while (i >= 0 && a[i] >= a[i + 1])
            i--;

        if (i < 0)
            return false;

        int j = a.length - 1; // successor

        while (a[j] <= a[i])
            j--;

        char tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;

        int left = i + 1, right = a.length - 1;

        while (left < right) {
            tmp = a[left];
            a[left] = a[right];
            a[right] = tmp;
            left++;
            right--;
        }

        return true;
    }
}
