package Semester01.Assignment03;

import java.util.Scanner;

public class Question08 {
    // Assigned On - 03/11/2025 - Fifth Class
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String decision;
        double discount, priceToPay = 0, finalPriceToPay = 0;

        System.out.print("Enter the number of units consumed: ");
        double unitsConsumed = scanner.nextDouble();

        System.out.print("Do you want to pay the bill online? (Y/N): ");
        decision = scanner.next();

        scanner.close();

        if (unitsConsumed <= 50) {
            priceToPay = unitsConsumed * 3;
            discount = priceToPay * (3.0 / 100);

        } else if (unitsConsumed >= 51 && unitsConsumed <= 200) {
            priceToPay = (50 * 3) + ((unitsConsumed - 50) * 4.80);

        } else if (unitsConsumed >= 201 && unitsConsumed <= 400) {
            priceToPay = (50 * 3) + (150 * 4.80) + ((unitsConsumed - 200) * 5.80);
            discount = priceToPay * (3.0 / 100);

        } else if (unitsConsumed > 400) {
            priceToPay = (50 * 3) + (150 * 4.80) + (200 * 5.80) + ((unitsConsumed - 400) * 6.20);
        }

        discount = priceToPay * (3.0 / 100);

        if (decision.toUpperCase().equals("Y")) {

            System.out.println("You received a 3% online payment discount of Rs. " + discount);
            finalPriceToPay = priceToPay - discount;
        } else {
            finalPriceToPay = priceToPay;
        }

        System.out.println("Total Electricity Bill: Rs. " + (float) priceToPay);
        System.out.println("Amount payable: Rs. " + (float) finalPriceToPay);
    }
}
