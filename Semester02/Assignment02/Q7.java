package Semester02.Assignment02;

abstract class ShapeQ7 {
    String color;

    ShapeQ7(String color) {
        this.color = color;
    }

    abstract double area();

    abstract void display(double area);
}

class CircleQ7 extends ShapeQ7 {
    double radius;

    CircleQ7(double radius, String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    @Override
    void display(double area) {
        System.out.println("Displaying Circle Information: ");
        System.out.printf("Radius: %.2f Area: %.2f%n", this.radius, area);
    }
}

class RectangleQ7 extends ShapeQ7 {
    double length;
    double width;

    RectangleQ7(double length, double width, String color) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return this.length * this.width;
    }

    @Override
    void display(double area) {
        System.out.println("Displaying Rectangle Information: ");
        System.out.printf("Length: %.2f Width: %.2f Area: %.2f%n", this.length, this.width, area);
    }
}

//Assigned On: (Did not Track the Date)
public class Q7 {
    static void main() {
        ShapeQ7 circleQ7 = new CircleQ7(2, "Red");
        ShapeQ7 rectangleQ7 = new RectangleQ7(2, 4, "Green");
        circleQ7.display(circleQ7.area());
        rectangleQ7.display(rectangleQ7.area());
    }
}
