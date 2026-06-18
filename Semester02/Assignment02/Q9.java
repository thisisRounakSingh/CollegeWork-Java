package Semester02.Assignment02;

abstract class EmployeeQ9 {
    String name;
    double salary;

    EmployeeQ9(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void displayEmployeeInfo() {
        System.out.println("Employee Information: ");
        System.out.printf("Employee Name: %s, Salary: %.2f%n", this.name, this.salary);
    }
}

class ManagerQ9 extends EmployeeQ9 {
    String department;

    ManagerQ9(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }

    void displayManagerDetails() {
        super.displayEmployeeInfo();
        System.out.printf("%s is a manager. Department: %s%n", this.name, this.department);
    }
}

//Assigned On: (Did not Track the Date)
public class Q9 {
    static void main() {
        ManagerQ9 managerQ9 = new ManagerQ9("John", 45000, "Marketing");
        managerQ9.displayManagerDetails();
    }
}
