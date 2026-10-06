package Semester01.Assignment01;

public class Question15_bitB {
    // Assigned On - 22/09/2025 - Second Class
    public static void main(String[] args) {
        int W = 1;
        int G = 2;
        int K = 3;
        int A = 4;

        System.out.println(
                "Before changing, respective values of 'W', 'G', 'K' and 'A' are: " + W + " " + G + " " + K + " " + A);
        // W -> A; A -> k; k -> G; G->W
        W = W + G + K + A;
        A = W - (G + K + A);
        K = W - (G + K + A);
        G = W - (G + K + A);
        W = W - (G + K + A);

        System.out.println(
                "After changing, respective values of 'W', 'G', 'K' and 'A' are: " + W + " " + G + " " + K + " " + A);

    }
}
