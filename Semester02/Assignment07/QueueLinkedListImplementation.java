package Semester02.Assignment07;

import java.util.Scanner;

class Node {
    int info;
    Node next;

    Node(int info) {
        this.info = info;
        this.next = null;
    }
}

public class QueueLinkedListImplementation {
    static Scanner scanner = new Scanner(System.in);
    private static int size;

    private static Node makeNewNode() {
        System.out.print("Enter data: ");
        return new Node(scanner.nextInt());
    }

    private static boolean isEmpty() {
        return size == 0;
    }

    public static Node insert(Node rear, Node front) {
        Node newNode = makeNewNode();
        if (!isEmpty()) {
            rear.next = newNode;
        }
        size++;
        return newNode;
    }

    public static Node delete(Node rear, Node front) {
        if (!isEmpty()) {
            front = front.next;
            size--;
            return front;
        } else {
            System.out.println("Nothing to delete. List is empty.");
            return front;
        }
    }

    public static void display(Node rear, Node front) {
        if (!isEmpty()) {
            Node currNode = front;
            System.out.println("Elements: ");
            while (currNode != null) {
                System.out.println(currNode.info + " ");
                currNode = currNode.next;
            }
            System.out.println();
        } else
            System.out.println("Queue is empty. Nothing to print.");
    }

    public static void main(String[] args) {
        Node rear = null, front = null;

        while (true) {
            System.out.println("****MENU****");
            System.out.println("0:Exit");
            System.out.println("1:Insert");
            System.out.println("2:Delete");
            System.out.println("3:Display\n");

            System.out.println("Enter your choice");
            int choice = scanner.nextInt();

            switch (choice) {
            case 0:
                System.out.println("Shutting Down...");
                System.exit(0);
                break;
            case 1:
                if (isEmpty()) {
                    rear = insert(rear, front);
                    front = rear;
                } else {
                    rear = insert(rear, front);
                }
                break;
            case 2:
                front = delete(rear, front);
                if (isEmpty()) {
                    rear = null;
                }
                break;
            case 3:
                display(rear, front);
                break;

            default:
                System.out.println("Wrong Input. Please enter again.");
            }

        }
    }
}
