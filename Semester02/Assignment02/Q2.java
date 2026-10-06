package Semester02.Assignment02;

import java.util.Scanner;

class Complex {
  double real;
  String imaginary;

  void setData(double real, String imaginary) {
    this.real = real;
    this.imaginary = imaginary;
  }

  void display() {
    System.out.printf("Real: %f", this.real);
    System.out.printf("Imaginary: %s", this.imaginary);
  }

  public Complex add(Complex c1, Complex c2) {
    Complex sum = new Complex();
    sum.real = c1.real + c2.real;
    sum.imaginary = (c1.imaginary.charAt(0) - '0' + c2.imaginary.charAt(0) - '0') + "i";
    return sum;
  }
}

//Assigned On: (Did not Track the Date)
public class Q2 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Complex c1 = new Complex();
    c1.setData(3, "4i");
    Complex c2 = new Complex();
    c2.setData(4, "7i");
    Complex add = new Complex();
    Complex result = add.add(c1, c2);
    System.out.printf("Summation: Real -> %.2f, Imaginary -> %s%n", result.real, result.imaginary);
    scanner.close();
  }
}
