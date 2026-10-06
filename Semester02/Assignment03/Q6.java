package Semester02.Assignment03;

public class Q6 {
    public static <T> int count(T[] array, T item) {
        int count = 0;
        for (T t : array) {
            if (item == null) {
                if (t == null) {
                    count++;
                }
            } else if (item.equals(t)) {
                count++;
            }
        }
        return count;
    }

    // Assigned On: (Untracked)
static void main() {
        Integer[] intArr = {1, 2, 3, 2, 4, 2};
        System.out.println("Count of 2 in intArr: " + count(intArr, 2));

        String[] strArr = {"apple", "banana", "apple", "cherry"};
        System.out.println("Count of \"apple\" in strArr: " + count(strArr, "apple"));

        Object[] objArr = {"hello", null, "world", null, "hello"};
        System.out.println("Count of null in objArr: " + count(objArr, null));
    }
}
