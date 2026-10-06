package Semester02.Assignment02;

import java.util.Scanner;

class Car {
  String model;
  int year;

  void setDetails(String model, int year) {
    this.model = model;
    this.year = year;
  }

  void displayDetails() {
    System.out.printf("Car mode name: %s%n", this.model);
    System.out.printf("Car release year: %d%n", this.year);
  }
}

//Assigned On: (Did not Track the Date)
public class Q1 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Car car1 = new Car();
    car1.setDetails("Toyota", 1998);
    System.out.print("Enter second car model and year: ");
    Car car2 = new Car();
    car2.setDetails(scanner.next(), scanner.nextInt());

    System.out.println("Displaying car details.");
    car1.displayDetails();
    car2.displayDetails();

    String newerCar = car1.year > car2.year ? car1.model : car2.model;
    System.out.printf("Newer car is %s%n", newerCar);
    scanner.close();
  }
}
