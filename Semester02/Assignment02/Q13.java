package Semester02.Assignment02;

import java.util.Scanner;

class BankQ13 {
    String bankName;
    double depositAmount;
    static double totalAmount;

    void setBankName(String bankName) {
        this.bankName = bankName;
    }

    void setAmount(double depositAmount) {
        this.depositAmount = depositAmount;
        totalAmount += depositAmount;
    }

    void showData() {
        System.out.printf("Bank Name: %s%n Deposit Amount: %.2f%n", this.bankName, this.depositAmount);
        System.out.printf("Total Deposited Amount: %.2f%n", totalAmount);
    }
}

//Assigned On: (Did not Track the Date)
public class Q13 {

    static void bankWithMinimumDeposit(BankQ13[] bank) {
        System.out.println("Bank With Maximum Deposit: ");

        double depositAmount = bank[0].depositAmount;
        String bankName = bank[0].bankName;
        for (int i = 1; i < bank.length; i++) {
            if (bank[i].depositAmount > depositAmount) {
                bankName = bank[i].bankName;
                depositAmount = bank[i].depositAmount;
            }
        }
        System.out.print(bankName + "\n");
    }

    static void main() {
        Scanner scanner = new Scanner(System.in);
        BankQ13[] bank = new BankQ13[5];
        System.out.println("Please enter details one-by-one: ");

        for (int i = 0; i < bank.length; i++) {
            bank[i] = new BankQ13();
            System.out.println("-- Bank " + i + " --");
            System.out.print("Enter Bank Name: ");
            bank[i].setBankName(scanner.next());
            System.out.print("Enter Deposit Amount: ");
            double amount = scanner.nextDouble();
            while (amount < 1000) {
                System.out.println("Deposit amount can't be less than 1000. Enter again: ");
                amount = scanner.nextDouble();
            }
            bank[i].setAmount(amount);
        }

        for (BankQ13 i : bank) {
            i.showData();
        }

        bankWithMinimumDeposit(bank);
        scanner.close();
    }
}
