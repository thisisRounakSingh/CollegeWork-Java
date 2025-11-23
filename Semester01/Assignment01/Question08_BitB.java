package Semester01.Assignment01;

public class Question08_BitB {
    // Assigned On - 22/09/2025 - Second Class
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        System.out.println("Before Swap A = " + a + ", B = " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After Swap A = " + a + ", B = " + b);
    }
}
