package Semester02.Assignment07;

import java.util.Scanner;

public class QueueArrayImplementation {
    public static final int MAX = 5;
    public static int front = -1;
    public static int rear = -1;
    public static int size;
    static Scanner scanner = new Scanner(System.in);

    /* Helper Function */
    private static int giveValue() {
        System.out.print("Enter a value: ");
        return scanner.nextInt();
    }

    public static void insert(int Q[]) {
        if (!is_full()) {
            if (is_empty()) {
                rear = 0;
                front = 0;
            }
            Q[rear] = giveValue();
            rear = (rear + 1) % MAX;
            size++;
        } else {
            System.out.println("The Queue is full. Delete an element first.");
        }
    }

    public static void delete(int Q[]) {
        if (!is_empty()) {
            front = (front + 1) % MAX;
            size--;
        } else {
            System.out.println("The Queue is empty. Nothing to delete.");
        }
    }

    public static void display(int Q[]) {
        if (!is_empty()) {
            System.out.print("Elements: ");
            for (int i = 0; i < size; i++) {
                System.out.print(Q[(front + i) % MAX] + " ");
            }
            System.out.println("END");
        } else {
            System.out.println("No elements present.");
        }
    }

    public static boolean is_full() {
        return size == MAX;
    }

    public static boolean is_empty() {
        return size == 0;
    }

    // Assigned On: (untracked)
    public static void main(String[] args) {
        int queue[] = new int[MAX];
        while (true) {
            System.out.println("***MENU***");
            System.out.println("0: Exit");
            System.out.println("1: Insert");
            System.out.println("2: Delete");
            System.out.println("3: Display\n");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
            case 0:
                System.out.println("Shutting Down.");
                System.exit(0);
                break;
            case 1:
                insert(queue);
                break;
            case 2:
                delete(queue);
                break;
            case 3:
                display(queue);
                break;
            default:
                System.out.println("Wrong Choice. Please select choice.");
                break;
            }
        }
    }
}
