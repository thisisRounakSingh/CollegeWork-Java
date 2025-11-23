package Semester01.Assignment02.Part02;

public class Question08 {
    // Assigned On - 27/10/2025 - Fifth Class
    public static void main(String[] args) {
        int Int1 = Integer.parseInt(args[0]);
        int Int2 = Integer.parseInt(args[1]);
        int Int3 = Integer.parseInt(args[2]);

        System.out.println("Product Check " + Int1 + " " + Int2 + " " + Int3 + " -> "
                + (Int2 * Int3 >= Int1 || Int3 * Int1 >= Int2 || Int1 * Int2 >= Int2));
    }
}
