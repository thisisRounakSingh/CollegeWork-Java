package Semester02.Assignment02;

class PersonQ12 {
  String name;
  int age;

  PersonQ12(String name, int age) {
    this.name = name;
    this.age = age;
  }
}

class EmployeeQ12 extends PersonQ12 {
  int EId;
  double salary;

  EmployeeQ12(String name, int age, int EId, double salary) {
    super(name, age);
    this.EId = EId;
    this.salary = salary;
  }

  void empDisplay() {
    System.out.println("Displaying Employee Information: ");
    System.out.printf("Employee Name: %s%n Age: %d EId: %d Salary: %.2f%n", super.name, super.age, this.EId,
        this.salary);
  }
}

//Assigned On: (Did not Track the Date)
public class Q12 {
  static void main() {
    EmployeeQ12 employeeQ12 = new EmployeeQ12("John", 19, 45, 45000);
    employeeQ12.empDisplay();
  }
}
