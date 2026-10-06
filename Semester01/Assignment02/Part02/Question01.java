package Semester01.Assignment02.Part02;

public class Question01 {
    // Assigned On - 13/10/2025 - Fourth Class
    public static void main(String[] args) {
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        int num3 = Integer.parseInt(args[2]);
        int num4 = Integer.parseInt(args[3]);
        int num5 = Integer.parseInt(args[4]);
        int num6 = Integer.parseInt(args[5]);
        System.out.println("Evenly Divides " + num2 + " " + num1 + " --> " + (num2 % num1 == 0));
        System.out.println("Evenly Divides " + num4 + " " + num3 + " --> " + (num4 % num3 == 0));
        System.out.println("Evenly Divides " + num6 + " " + num5 + " --> " + (num5 % num6 == 0));
    }
}
