package Semester01.Assignment01;

public class Question09_BitB {
    // Assigned On - 22/09/2025 - Second Class
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;

        System.out.println("Before interchange A = " + a + ", B = " + b + ", C = " + c);

        /*
         * We can swap `a` and `b` and then `b` and `c` also as used in Question08_BitB.
         */
        a = a + b + c;
        c = a - (b + c);
        b = a - (b + c);
        a = a - (b + c);

        System.out.println("After interchange A = " + a + ", B = " + b + ", C = " + c);
    }
}
