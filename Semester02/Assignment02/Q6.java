package Semester02.Assignment02;

abstract class VehicleQ6 {
    String model;
    int year;

    VehicleQ6(String model, int year) {
        this.model = model;
        this.year = year;
    }
}

class CarQ6 extends VehicleQ6 {
    int carID;
    double price;

    CarQ6(String model, int year, int carID, double price) {
        super(model, year);
        this.carID = carID;
        this.price = price;
    }

    void display() {
        System.out.println("Displaying Car Details:");
        System.out.printf("Car Model: %s%n Car Release Year: %d%n CarID: %d%n Car Price: %.2f%n", this.model, this.year,
                this.carID, this.price);
    }
}

//Assigned On: (Did not Track the Date)
public class Q6 {
    static void main() {
        CarQ6 car = new CarQ6("Toyota", 2005, 2345, 3500000.0);
        car.display();
    }
}
