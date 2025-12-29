import java.util.Scanner;

public class Question10 {
    // To be assigned.

    public static int area(int n) {
        return n * n;
    }

    public static int area(int n, int m) {
        return n * m;
    }

    public static double area(double r) {
        return Math.PI * (r * r);
    }

    public static double area(double b, double h) {
        return 0.5 * b * h;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice = 0;
        do {
            System.out.println("=== AREA CALCULATOR (Method Overloading) ===");
            System.out.println("1. Area of Square.");
            System.out.println("2. Area of Rectangle.");
            System.out.println("3. Area of Circle.");
            System.out.println("4. Area of Triangle.");
            System.out.println("5. Exit.");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();
            switch (choice) {
            case 1:
                System.out.print("Enter side: ");
                int s = input.nextInt();
                System.out.printf("Area of Square: %d%n", area(s));
                break;
            case 2:
                System.out.print("Enter length: ");
                int n = input.nextInt();
                System.out.print("Enter Breadth: ");
                int k = input.nextInt();
                System.out.printf("Area of Rectangle: %d%n", area(n, k));
                break;
            case 3:
                System.out.print("Enter radius: ");
                double r = input.nextDouble();
                System.out.printf("Area of Circle: %.2f%n", area(r));
                break;
            case 4:
                System.out.print("Enter Base: ");
                double b = input.nextDouble();
                System.out.print("Enter height: ");
                double h = input.nextDouble();
                System.out.printf("Area of Triangle: %.2f%n", area(b, h));
                break;

            case 5:
                System.out.println("Exiting...");
                break;

            default:
                System.out.println("Please enter correct choice.");
            }
        } while (choice != 5);
        input.close();
    }
}
