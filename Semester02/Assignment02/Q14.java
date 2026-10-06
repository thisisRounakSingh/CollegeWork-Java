package Semester02.Assignment02;

abstract class Distance {
    int feet;
    int inches;

    Distance(int feet, int inches) {
        this.feet = feet;
        this.inches = inches;
    }

    void displayDistance() {
        System.out.printf("Feet Distance: %d%n Inches: %d%n", this.feet, this.inches);
    }
}

class Measurement extends Distance {
    double centimeters;

    Measurement(int feet, int inches, double centimeters) {
        super(feet, inches);
        this.centimeters = centimeters;
    }

    void displayMeasurement() {
        super.displayDistance();
        System.out.printf("In Centimeter: %.2f%n", this.centimeters);
    }
}

//Assigned On: (Did not Track the Date)
public class Q14 {
    static void main() {
        Measurement measurement = new Measurement(2, 24, 60.96);
        measurement.displayMeasurement();
    }
}
