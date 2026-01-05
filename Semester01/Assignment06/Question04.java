import java.util.Scanner;

public class Question04 {
    // Assigned On 22/12/2025 - Eleventh Class

    /**
     * Area of a regular polygon:
     * Area = (pi*s^2)/4*tan(pi/n)
     * 
     * @param n number of sides
     * @param side length of each side
     * @return area of regular polygon.
     */
    public static double area(int n, double side) {
        return (n * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / n));
    }

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Enter number of sides: ");
        int n = inputScanner.nextInt();

        System.out.print("Enter length of each side: ");
        double sides = inputScanner.nextDouble();

        System.out.printf("Area of the regular polygon: %.12f%n", area(n, sides));
        inputScanner.close();
    }
}
