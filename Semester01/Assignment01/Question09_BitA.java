package Semester01.Assignment01;

public class Question09_BitA {
    // Assigned On - 22/09/2025 - Second Class
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        int d;

        System.out.println("Before interchange A = " + a + ", B = " + b + ", C = " + c);

        d = a;
        a = b;
        b = c;
        c = d;

        System.out.println("After interchange A = " + a + ", B = " + b + ", C = " + c);
    }
}
