package Semester01.Assignment02.Part02;

public class Question06 {
    // Assigned On - 27/10/2025 - Fifth Class
    public static void main(String[] args) {
        int Int1 = Integer.parseInt(args[0]);
        int Int2 = Integer.parseInt(args[1]);
        int Int3 = Integer.parseInt(args[2]);

        int minimum = Math.min((Math.min(Int1, Int2)), Int3);
        int maximum = Math.max((Math.max(Int1, Int2)), Int3);
        int mid = (Int1 + Int2 + Int3) - (maximum + minimum);

        System.out.println("Ascending Order: " + minimum + " " + mid + " " + maximum);
    }
}
