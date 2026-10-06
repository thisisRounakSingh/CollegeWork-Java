package Semester02.Assignment02;

import java.util.List;

class Book {
  int bookID;
  double price;
  int quantity;
  static int totalAmount;

  Book(int bookID, double price, int quantity) {
    this.bookID = bookID;
    this.price = price;
    this.quantity = quantity;
    totalAmount += quantity * price;
  }

  void displayDetails() {
    System.out.printf("Book ID: %d%n Book Price: %.1f%n Quantity: %d%n", this.bookID, this.price, this.quantity);
  }

  double totalCostOfThisBook() {
    return this.price * this.quantity;
  }
}

//Assigned On: (Did not Track the Date)
class Q3 {
  public static void main(String[] args) {
    Book book1 = new Book(2534, 60, 2);
    Book book2 = new Book(223534, 90, 3);
    Book book3 = new Book(22334, 80, 7);
    Book book4 = new Book(22353, 50, 8);
    Book book5 = new Book(23534, 40, 9);

    System.out.println("Display Details of Each Book");
    int index = 1;
    for (Book book : List.of(book1, book2, book3, book4, book5)) {
      System.out.println("Book " + index);
      book.displayDetails();
      System.out.println("Total Cost Of This Book: " + book.totalCostOfThisBook());
      index++;
    }

    System.out.println("Net payable: " + Book.totalAmount);
  }
}
