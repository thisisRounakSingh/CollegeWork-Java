package Semester02.Assignment02;

import java.util.List;
import java.util.Scanner;

class StudentQ11 {
    int rollNumber;
    String name;
    double DSAMark;

    void getData(int rollNumber, String name, double DSAMark) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.DSAMark = DSAMark;
    }

    void showData() {
        System.out.println("Roll Number: " + this.rollNumber);
        System.out.println("Name: " + this.name);
        System.out.println("DSA Mark: " + this.DSAMark);
    }
}

//Assigned On: (Did not Track the Date)
public class Q11 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        StudentQ11 s1 = new StudentQ11();
        StudentQ11 s2 = new StudentQ11();
        StudentQ11 s3 = new StudentQ11();
        StudentQ11 s4 = new StudentQ11();
        StudentQ11 s5 = new StudentQ11();

        System.out.println("Enter the details of 5 students one-by-one (Roll Number, Name And Marks In Sequence): ");
        int index = 1;
        for (StudentQ11 student : List.of(s1, s2, s3, s4, s5)) {
            System.out.println("-- Student " + index + " --");
            student.getData(scanner.nextInt(), scanner.next(), scanner.nextDouble());
            index++;
        }

        System.out.println("Here are the details of all 5 students: ");
        index = 1;
        for (StudentQ11 student : List.of(s1, s2, s3, s4, s5)) {
            System.out.println("-- Student " + index + " --");
            student.showData();
            index++;
        }
        System.out.println();

        String studentName = s1.name;
        double mark = s1.DSAMark;

        for (StudentQ11 student : List.of(s2, s3, s4, s5)) {
            if (student.DSAMark > mark) {
                studentName = student.name;
                mark = student.DSAMark;
            }
        }

        System.out.println("Student with highest marks: ");
        System.out.printf("Student Name: %s\n", studentName);

        scanner.close();
    }
}
