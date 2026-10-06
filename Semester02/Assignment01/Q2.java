package Semester02.Assignment01;

import java.util.Scanner;

public class Q2 {
    // Assigned on 02/02/2026
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight (kg) and height (m) (give space after each): ");
        double weight = input.nextDouble(), height = input.nextDouble();
        double BMI = weight / Math.pow(height, 2);

        if (BMI < 18.5) {
            System.out.println("The person is underweight.");
        } else if (BMI > 18.5 && BMI < 24.9) {
            System.out.println("Person's weight is normal.");
        } else if (BMI > 25.0 && BMI < 29.9) {
            System.out.println("The person is Overweight.");
        } else if (BMI > 30) {
            System.out.println("The person is obese.");
        }
        input.close();
    }
}
