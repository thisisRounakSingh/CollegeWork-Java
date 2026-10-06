package Semester02.Assignment01;

public class Q4NoLetterCap {
    // Assigned on 02/02/2026
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter a word: ");
        String s = input.next();
        char[] arr = s.toCharArray();

        insertionSort(arr);
        do {
            System.out.println(new String(arr));
        } while (nextPermutation(arr));

        input.close();
    }

    /**
     * Generates the next lexicographical permutation of the given character array.
     * <p>
     * The function rearranges the characters into the next permutation that would
     * appear in dictionary (lexicographical) order. If such an arrangement is not
     * possible (i.e., the array is already in its last permutation, sorted in
     * descending order), the function returns false and the array remains unchanged.
     * <p>
     * Algorithm Steps:
     * <p>
     * 1. Find the Pivot
     * Starting from the right, locate the first index `i` such that:
     * a[i] < a[i + 1]
     * This identifies the position where the next permutation can be formed.
     * If no such index exists, the array is in descending order and is already
     * the last permutation.
     * <p>
     * 2. Find the Successor
     * Starting from the end of the array, find tc the first element `a[j]`
     * that is greater than `a[i]`. This will be the smallest element larger
     * than the pivot.
     * <p>
     * 3. Swap Pivot and Successor
     * Swap `a[i]` and `a[j]`. This increases the value of the permutation
     * slightly while keeping it as small as possible.
     * <p>
     * 4. Reverse the Suffix
     * Reverse the portion of the array from `i + 1` to the end.
     * The suffix was originally in descending order, so reversing it makes
     * it the smallest possible sequence.
     * <p>
     * Example:
     * Input:  [1, 3, 5, 4, 2]
     * Output: [1, 4, 2, 3, 5]
     *
     * @param a the character array representing the current permutation
     * @return true if the next permutation was generated,
     * false if the array was already the last permutation
     */
    private static boolean nextPermutation(char[] a) {
        int i = a.length - 2;
        while (i >= 0 && a[i] >= a[i + 1])
            i--;
        if (i < 0)
            return false; // last permutation

        int j = a.length - 1;
        while (a[j] <= a[i])
            j--;
        // swap a[i] and a[j]
        char tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;

        // reverse a[i+1..end]
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

    // Simple insertion sort for char array (ascending)
    /*
    Compare the next element to the first.
    If the first one was smaller.
    
    Arrange elements in ascending order.
    */
    private static void insertionSort(char[] a) {
        for (int i = 1; i < a.length; i++) {
            char key = a[i];
            int j = i - 1;
            /*
            Utilized short-circuit evaluation to handle edges cases.
            In the first run, j will eventually become -1.
            `&&` supports short-circuit skipping the a[j]>key check.
            */
            while (j >= 0 && a[j] > key) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = key;
        }
    }
}
