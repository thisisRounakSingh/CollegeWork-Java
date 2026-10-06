package Semester02.Assignment06;

import java.util.Scanner;

public class StackArrayImplementation {
    public static final int MAX = 10;
    static Scanner scanner = new Scanner(System.in);

    private static int returnInput() {
        System.out.print("Enter a value: ");
        return scanner.nextInt();
    }

    public static int push(int S[], int top) {
        if (!isFull(top)) {
            S[top] = returnInput();
            return ++top;
        } else {
            System.out.println("Stack is full. Pop an element first.");
            return top;
        }
    }

    public static int pop(int S[], int top) {
        int data;
        if (!isEmpty(top)) {
            top--;
            data = S[top];
            System.out.print("Removed: " + data + "\n");
            S[top] = 0;
            return top;
        } else {
            System.out.println("Stack is empty. Nothing to delete.");
            return -1;
        }
    }

    public static void display(int S[], int top) {
        if (!isEmpty(top)) {
            System.out.print("Elements: ");
            for (int i = 0; i < top; i++) {
                System.out.print(S[i] + " ");
            }
            System.out.println("END");
        } else {
            System.out.println("Nothing to show. The stack is empty.");
        }
    }

    public static boolean isEmpty(int top) {
        return top <= 0;
    }

    public static boolean isFull(int top) {
        return top == MAX;
    }

    // Assigned On: (untracked)
    public static void main(String[] args) {
        int stack[] = new int[MAX];
        int top = -1;

        while (true) {
            System.out.println("***MENU***");
            System.out.println("0: Exit");
            System.out.println("1: Push");
            System.out.println("2: Pop");
            System.out.println("3: Display\n");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            System.out.println();

            switch (choice) {
            case 0:
                System.out.println("Shutting Down...");
                System.exit(0);
                break;

            case 1:
                if (top == -1)
                    top = 0;
                top = push(stack, top);
                System.out.println("After : " + top);
                break;
            case 2:
                top = pop(stack, top);
                break;
            case 3:
                display(stack, top);
                break;

            default:
                System.out.println("Wrong Choice. Choose Again!");
                break;
            }
        }
    }

}
