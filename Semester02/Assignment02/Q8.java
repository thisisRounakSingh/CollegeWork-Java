package Semester02.Assignment02;

interface Flyable {
    void fly();
}

interface Swimmable {
    void swim();
}

class Duck implements Flyable, Swimmable {
    String name;
    boolean canFly;
    boolean canSwim;

    // Pass the specific capabilities through the constructor
    Duck(String name, boolean canFly, boolean canSwim) {
        this.name = name;
        this.canFly = canFly;
        this.canSwim = canSwim;
    }

    @Override
    public void fly() {
        if (canFly) System.out.println("Flying...");
    }

    @Override
    public void swim() {
        if (canSwim) System.out.println("Swimming...");
    }

    void displayDetails() {
        System.out.println("Duck Name: " + this.name);
        System.out.print("Capabilities: ");
        System.out.print(canFly ? "Can Fly! " : "Cannot Fly. ");
        System.out.println(canSwim ? "Can Swim! " : "Cannot Swim. ");
    }
}

//Assigned On: (Did not Track the Date)
public class Q8 {
    static void main() {
        Duck donald = new Duck("Donald", true, true);
        Flyable flyDuck = new Duck("Duck", true, true);
        flyDuck.fly();
        Swimmable swimDuck = new Duck("Swim", true, true);
        swimDuck.swim();
        donald.fly();
        donald.swim();
        System.out.println();
        donald.displayDetails();
    }
}
