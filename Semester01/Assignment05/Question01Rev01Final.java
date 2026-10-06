package Semester01.Assignment05;

import java.util.Scanner;

public class Question01Rev01Final {
    // Assigned On 01/12/2025 - Eighth Class
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int primeNumberFromUser = scanner.nextInt(), tempNumber = primeNumberFromUser, twistedNumber = 0;
        boolean isUserNumberPrime = true, isTwistedNumberPrime = true;

        /*
        * Say the number is 13 (which is prime).
        * If a number has a divisor greater then root(n), then it must also have
        * divisor smaller than root(n).
        * 
        * For examples root(36) = 6 (36 is not a prime)
        * Divisor pair: (1,36), (2,18), (3,12), (4,9), (6,6)
        * Notice that one divisor is always (greater) <= 6 and other (lesser) >= 6.
        * 
        * This also helps reduce time-complexity of the algorithm.
        */
        for (int i = 2; i <= Math.sqrt(primeNumberFromUser); i++) {
            if (primeNumberFromUser % i == 0) {
                isUserNumberPrime = false;
                break;
            }
        }

        if (primeNumberFromUser < 2)
            isUserNumberPrime = false;

        if (!isUserNumberPrime) {
            System.out.println("The number you provided is not prime. Terminating Program.");
        } else {
            while (tempNumber != 0) {
                twistedNumber = twistedNumber * 10 + tempNumber % 10;
                tempNumber /= 10;
            }

            for (int i = 2; i < Math.sqrt(twistedNumber); i++) {
                if (twistedNumber % i == 0) {
                    isTwistedNumberPrime = false;
                    break;
                }
            }

            if (twistedNumber < 2)
                isTwistedNumberPrime = false;

            System.out.println(
                    primeNumberFromUser + (isTwistedNumberPrime ? " is a twisted number" : " is not a twisted number"));
        }

        scanner.close();
    }
}
