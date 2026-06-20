package Semester02.Assignment03;

class Q12 {
    /* Assigned On: (Untracked) */
    static int binarySearch(int[] arr, int key, int low, int high) {
        if (low > high) {
            return -1;
        }
        int mid = low + (high - low) / 2;
        if (arr[mid] == key) {
            return mid;
        } else if (key < arr[mid]) {
            return binarySearch(arr, key, low, mid - 1);
        } else {
            return binarySearch(arr, key, mid + 1, high);
        }
    }

    // Assigned On: (Untracked)
    static void main() {
        int[] data = {1, 3, 5, 7, 9, 11, 13};
        System.out.println(binarySearch(data, 7, 0, data.length - 1)); // prints index 3
        System.out.println(binarySearch(data, 4, 0, data.length - 1)); // prints -1 (not found)
    }
}
