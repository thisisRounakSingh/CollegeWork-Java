package Semester02.Assignment06;

import java.util.Scanner;

class Node {
    int info;
    Node next;

    Node(int info) {
        this.info = info;
        this.next = null;
    }
}

public class StackLinkedListImplementation {
    static Scanner scanner = new Scanner(System.in);

    private static Node makeNewNode() {
        System.out.print("Enter a value: ");
        return new Node(scanner.nextInt());
    }

    private static boolean isEmpty(Node top) {
        return top == null;
    }

    public static Node push(Node top) {
        Node newNode = makeNewNode();
        newNode.next = top;
        return newNode;
    }

    public static Node pop(Node top) {
        if (!isEmpty(top)) {
            System.out.print("Removing: " + top.info + "\n");
            return top = top.next;
        } else {
            System.out.println("Stack nis empty. There is nothing to remove.");
            return top;
        }
    }

    public static void display(Node top) {
        if (!isEmpty(top)) {
            System.out.println("Elements: ");
            Node currNode = top;
            while (currNode != null) {
                System.out.print(currNode.info + " ");
                currNode = currNode.next;
            }
            System.out.println("END");
        } else {
            System.out.println("There is nothing to display.");
        }
    }

    // Assigned On: (untracked)
    public static void main(String[] args) {
        Node top;
        top = null;

        while (true) {
            System.out.println("****MENU****");
            System.out.println("0:Exit");
            System.out.println("1:Push");
            System.out.println("2:Pop");
            System.out.println("3:Display\n");

            System.out.println("Enter your choice: ");
            int choice = scanner.nextInt();

            System.out.println();

            switch (choice) {
            case 0:
                System.out.println("Shutting Down...");
                System.exit(0);
                break;
            case 1:
                top = push(top);
                break;
            case 2:
                top = pop(top);
                break;
            case 3:
                display(top);
                break;
            default:
                System.out.println("Wrong Choice.");
            }
        }
    }
}
