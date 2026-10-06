package Semester01.Assignment02.Part02;

public class Question05 {
    // Assigned On - 27/10/2025 - Fifth Class
    public static void main(String[] args) {
        double float1 = Double.parseDouble(args[0]);
        double float2 = Double.parseDouble(args[1]);
        double float3 = Double.parseDouble(args[2]);

        System.out.println("Strict Order Check " + float1 + " " + float2 + " " + float3 + " --> "
                + ((float1 < float2 && float2 < float3) || (float1 > float2 && float2 > float3)));

    }
}
