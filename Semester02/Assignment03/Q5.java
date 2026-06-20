package Semester02.Assignment03;

public class Q5 {
    public static <E> void printArray(E[] inputArray) {
        for (E e : inputArray) {
            System.out.print(e + " ");
        }
        System.out.println();
    }

    // Assigned On: (Untracked)
// Assigned On: (Untracked)
static void main() {
        Integer[] ints = {1, 2, 3};
        String[] strings = {"Apple", "Banana", "Mango"};

        printArray(ints);
        printArray(strings);
    }
}
