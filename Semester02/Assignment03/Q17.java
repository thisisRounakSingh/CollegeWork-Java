package Semester02.Assignment03;

public class Q17 {
    static void rearrange(int[] arr, int k) {
        rearrangeRec(arr, 0, arr.length - 1, k);
    }

    private static void rearrangeRec(int[] arr, int low, int high, int k) {
        if (low >= high) {
            return;
        }
        while (low < arr.length && arr[low] <= k) {
            low++;
        }
        while (high >= 0 && arr[high] > k) {
            high--;
        }
        if (low < high) {
            int tmp = arr[low];
            arr[low] = arr[high];
            arr[high] = tmp;
            rearrangeRec(arr, low + 1, high - 1, k);
        }
    }

    /* Assigned On: (Untracked) */
    static void main() {
        int[] data = {9, 3, 7, 2, 8, 1, 5};
        int k = 5;
        rearrange(data, k);
        for (int v : data) {
            System.out.print(v + " ");
        }
        System.out.println();
    }
}
