package Semester02.Assignment03;

import java.util.Scanner;

class StudentQ3 {
    double mark;
    String name;

    StudentQ3(String name, double mark) {
        this.name = name;
        this.mark = mark;
    }
}

class MarksOutOfBoundsException extends Exception {
    MarksOutOfBoundsException(String message) {
        super(message);
    }
}

public class Q3 {
    // Assigned On: (Untracked)
static void main() {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Student Name: ");
            String studentName = scanner.next();
            System.out.print("Student Marks: ");
            double marks = scanner.nextDouble();

            if (marks < 0 || marks > 100) {
                throw new MarksOutOfBoundsException("Marks can't be greater than 100 and less than 0.");
            } else {
                StudentQ3 studentQ3 = new StudentQ3(studentName, marks);
                System.out.println("Student " + studentQ3.name + " Marks: " + studentQ3.mark);
            }
        } catch (MarksOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
