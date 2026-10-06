package Semester02.Assignment02;

abstract class ShapeClass {

  abstract double calculateArea();

  public void displayArea() {
    System.out.println("The magnitude of the area is: " + calculateArea());
  }
}

class Triangle extends ShapeClass {
  double base;
  double height;

  Triangle(double base, double height) {
    this.base = base;
    this.height = height;
  }

  double calculateArea() {
    return 0.5 * this.base * this.height;
  }
}

class Square extends ShapeClass {
  double side;

  Square(double side) {
    this.side = side;
  }

  double calculateArea() {
    return side * side;
  }
}

class Circle extends ShapeClass {
  double radius;

  Circle(double radius) {
    this.radius = radius;
  }

  double calculateArea() {
    return 4 * Math.PI * Math.pow(radius, 2);
  }
}

//Assigned On: (Did not Track the Date)
public class Q5 {
  public static void main(String[] args) {
    Triangle triangle = new Triangle(2, 4);
    Square square = new Square(2);
    Circle circle = new Circle(4);

    triangle.displayArea();
    square.displayArea();
    circle.displayArea();
  }
}
