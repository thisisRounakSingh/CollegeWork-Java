package Semester01.Assignment02.Part01;

import java.util.Scanner;

public class Question10 {
    // Assigned On - 13/10/2025 - Fourth Class
    public static void main(String[] args) {
        double distanceInKM;
        double inMeter;
        double inFeet;
        double inInch;
        double inCentimeter;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter distance in KM: ");
        distanceInKM = scanner.nextInt();

        /*
         * 1 KM = 1000 meter
         * 1 KM = 3280.8399 feet
         * 1 KM = 39370.0787 inch
         * 1 KM = 100000 centimeter
         */

        inMeter = distanceInKM * 1000;
        inFeet = distanceInKM * 3280.8399;
        inInch = distanceInKM * 39370.0787;
        inCentimeter = distanceInKM * 100000;

        System.out.println((int) distanceInKM + " KM is " + (int) inMeter + " meters.");
        System.out.println((int) distanceInKM + " KM is " + inFeet + " feet.");
        System.out.println((int) distanceInKM + " KM is " + inInch + " inch.");
        System.out.println((int) distanceInKM + " KM is " + (int) inCentimeter + " centimeters.");

        scanner.close();
    }
}
