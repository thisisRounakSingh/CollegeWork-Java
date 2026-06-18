package Semester02.Assignment02;

import java.util.Scanner;

class Student {
    protected String name;
    protected int roll;

    public void inputDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.print("Enter Roll Number: ");
        roll = sc.nextInt();
    }

    public void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + roll);
    }
}

class Test extends Student {
    protected int mark1;
    protected int mark2;

    @Override
    public void inputDetails() {
        super.inputDetails();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Mark 1: ");
        mark1 = sc.nextInt();
        System.out.print("Enter Mark 2: ");
        mark2 = sc.nextInt();
    }

    @Override
    public void showDetails() {
        super.showDetails();
        System.out.println("Mark 1: " + mark1);
        System.out.println("Mark 2: " + mark2);
    }
}

interface Sports {
    int SCORE1 = 45;
    int SCORE2 = 35;
}

class Result extends Test implements Sports {
    private int grandTotal;

    public void calculateTotal() {
        grandTotal = mark1 + mark2 + SCORE1 + SCORE2;
    }

    public void displayResult() {
        showDetails();
        System.out.println("Sports Score 1: " + SCORE1);
        System.out.println("Sports Score 2: " + SCORE2);
        System.out.println("==========================");
        System.out.println("Grand Total: " + grandTotal);
    }
}

//Assigned On: (Did not Track the Date)
public class Q10 {
    static void main() {
        Result studentResult = new Result();

        System.out.println("--- Enter Student Information ---");
        studentResult.inputDetails();

        studentResult.calculateTotal();

        System.out.println("\n--- Final Report Card ---");
        studentResult.displayResult();
    }
}
