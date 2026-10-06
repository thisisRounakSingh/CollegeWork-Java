package Semester01.Assignment03;

import java.util.Scanner;

public class Question08_Improvised {
    // Assigned On - 03/11/2025 - Fifth Class

    /*
     * Implementation of question 08 using nested if-else statements. This is to be
     * mentioned in lab record not the other one.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /* Using type `char` instead of `String`. */
        char decision;
        double discount, priceToPay, finalPriceToPay = 0;

        System.out.print("Enter the number of units consumed: ");
        double unitsConsumed = scanner.nextDouble();

        System.out.print("Do you want to pay the bill online? (Y/N): ");
        decision = scanner.next().charAt(0);

        scanner.close();

        /* Use of nested if-else. */
        if (unitsConsumed <= 50)
            priceToPay = unitsConsumed * 3.00;
        else {
            if (unitsConsumed <= 200)
                priceToPay = (50 * 3) + ((unitsConsumed - 50) * 4.80);
            else {
                if (unitsConsumed <= 400)
                    priceToPay = (50 * 3.00) + (150 * 4.80) + ((unitsConsumed - 200) * 5.80);
                else
                    priceToPay = (50 * 3.00) + (150 * 4.80) + (200 * 5.80) + (unitsConsumed - 400) * 6.20;
            }
        }

        discount = priceToPay * (3.0 / 100);

        if (decision == 'Y' || decision == 'y') {

            System.out.println("You received a 3% online payment discount of Rs. " + discount);
            finalPriceToPay = priceToPay - discount;
        } else {
            finalPriceToPay = priceToPay;
        }

        System.out.println("Total Electricity Bill: Rs. " + (float) priceToPay);
        System.out.println("Amount payable: Rs. " + (float) finalPriceToPay);
    }
}
