package Semester02.Assignment02;

class Deposit {
  long principal;
  int time;
  double rate;
  double total_amount;

  Deposit() {
    this.principal = 1000;
    this.time = 2;
    this.rate = 5;
  }

  Deposit(long principal, double rate) {
    this.principal = principal;
    this.rate = rate;
    this.time = 2;
  }

  Deposit(long principal) {
    this.principal = principal;
    this.time = 2;
    this.rate = 5;
  }

  Deposit(double rate) {
    this.principal = 1000;
    this.time = 2;
    this.rate = 5;
  }

  void display() {
    System.out.println("Displaying Details: ");
    System.out.printf("Principal Amount: %d%nTime: %d%nRate: %.2f%n", this.principal, this.time, this.rate);
  }

  double calculateAmount() {
    return this.total_amount = this.principal + (this.principal * this.time * this.rate) / 100;
  }
}

//Assigned On: (Did not Track the Date)
public class Q4 {
  public static void main(String[] args) {
    Deposit deposit = new Deposit(1000, 4);
    System.out.println("Your Deposit Details are as follow: ");
    deposit.display();
    System.out.println("Total Amount: " + deposit.calculateAmount());
  }
}
