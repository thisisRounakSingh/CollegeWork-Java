package Semester01.Assignment05;

import java.util.Scanner;

public class Question01_Rev0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int primeNumberFromUser = scanner.nextInt(), tempNumber = primeNumberFromUser, lastDigit, twistedNumber = 0;
        boolean isUserNumberPrime = true, isTwistedNumberPrime = true; // by default we assume that the number and its reverse is  a prime.

        // Checking if the number is prime or not in the first place.
        for (int i = 1; i <= primeNumberFromUser; i++) {
            if (i != 1 && i != primeNumberFromUser) {
                isUserNumberPrime = primeNumberFromUser % i == 0 ? false : true;
                if (isUserNumberPrime == false)
                    break; // we need to close the loop, because 12 is not prime, but its also not divisible by 11 which algorithm will assume it to be.
            }
        }

        // Twisting the number if it is prime.
        if (isUserNumberPrime) {
            while (tempNumber != 0) {
                lastDigit = tempNumber % 10;
                twistedNumber = twistedNumber * 10 + lastDigit;
                tempNumber /= 10;
            }

            for (int i = 1; i <= twistedNumber; i++) {
                if (i != 1 && i != twistedNumber) {
                    isTwistedNumberPrime = twistedNumber % i == 0 ? false : true;
                    if (isTwistedNumberPrime == false)
                        break;
                }
            }

            if (isTwistedNumberPrime) {
                System.out.println(primeNumberFromUser + " is a twisted number.");
            } else {
                System.out.println(primeNumberFromUser + " is not a twisted number.");
            }

        } else {
            System.out.println("The number you provided is not prime. Terminating Program.");
        }

        scanner.close();
    }
}
