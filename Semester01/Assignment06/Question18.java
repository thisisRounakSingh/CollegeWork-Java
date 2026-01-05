import java.util.Scanner;

public class Question18 {
    // Assigned On 22/12/2025 - Eleventh Class

    public static double volume(int side) {
        // Cube
        return Math.cbrt(side);
    }

    public static double volume(double length, double width, double height) {
        // Cuboid
        return length * width * height;
    }

    public static double volume(double radius) {
        // Sphere.
        return 1.33 * Math.PI * Math.cbrt(radius);
    }

    public static double volume(double radius, double height) {
        // Cylinder
        return Math.PI * Math.pow(radius, 2) * height;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice = 0;
        do {
            System.out.println("=== VOLUME CALCULATOR (Method Overloading) ===");
            System.out.println("1. Volume Of Cube.");
            System.out.println("2. Volume Of Rectangular Prism (Cuboid)");
            System.out.println("3. Volume Of Sphere");
            System.out.println("4. Volume Of Cylinder");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {
            case 1:
                System.out.print("Enter the side: ");
                int side = input.nextInt();
                System.out.printf("Volume of Cube is: %.1f%n", volume(side));
                break;

            case 2:
                System.out.print("Enter the length: ");
                double l = input.nextDouble();
                System.out.print("Enter the width: ");
                double w = input.nextDouble();
                System.out.print("Enter the height: ");
                double h = input.nextDouble();
                System.out.printf("The volume of the cuboid is: %.1f%n", volume(l, w, h));
                break;

            case 3:
                System.out.print("Enter radius: ");
                double radius = input.nextDouble();
                System.out.printf("The volume of the sphere is: %.1f%n", volume(radius));
                break;

            case 4:
                System.out.print("Enter radius: ");
                double rad = input.nextDouble();
                System.out.print("Enter height: ");
                double height = input.nextDouble();
                System.out.printf("The volume of the cylinder is: %.1f%n", volume(rad, height));
                break;

            case 5:
                System.out.println("Exiting...");
                break;

            default:
                System.out.println("You entered invalid choice. Please try again.");
                break;
            }
        } while (choice != 5);

        input.close();
    }
}
