package Semester02.Assignment04;

import java.util.Scanner;

public class LinkedListWithTailAndSize {
    private static Node head;
    private static Node tail;
    private static int size = 0;

    static Scanner scanner = new Scanner(System.in);

    private static class Node {
        private int regd_no;
        private float mark;
        private Node next;

        Node(int regd_no, float mark) {
            this.regd_no = regd_no;
            this.mark = mark;
            this.next = null;
        }
    }

    public record Result(int regd_no, float mark) {
    }

    private static Node get(int position) {
        if (position < 0 || position >= size)
            return null;
        Node node = head;
        for (int i = 0; i < position; i++) {
            node = node.next;
        }
        return node;
    }

    public static void display() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        System.out.println("\n Regd No. AND Mark");
        Node tempNode = head;
        while (tempNode != null) {
            System.out.printf(" %-8d|   %.2f%n", tempNode.regd_no, tempNode.mark);
            tempNode = tempNode.next;
        }
        System.out.println();
    }

    public static void create() {
        System.out.println("How many node to create?");
        int nodes = scanner.nextInt();
        Result input;
        for (int i = 1; i <= nodes; i++) {
            System.out.println("--Node " + i + "--");
            input = askInput();
            InsEnd(input.regd_no(), input.mark());
        }
    }

    public static Result askInput() {
        System.out.print("Enter the registration number: ");
        int regd_no = scanner.nextInt();
        System.out.print("Enter marks: ");
        float mark = scanner.nextFloat();
        return new Result(regd_no, mark);
    }

    public static void InsBeg(int regd_no, float mark) {
        Node node = new Node(regd_no, mark);
        node.next = head;
        head = node;
        if (tail == null) {
            tail = head;
        }
        size++;
    }

    public static void InsEnd(int regd_no, float mark) {
        if (tail == null) {
            InsBeg(regd_no, mark);
            return;
        }
        Node node = new Node(regd_no, mark);
        tail.next = node;
        tail = node;
        size++;
    }

    public static void InsAny(int regd_no, float mark, int position) {
        System.out.println("Enter Position (1-based): ");
        if (position <= 1 || head == null) {
            System.out.println("No elements present. Inserting at the start.");
            InsBeg(regd_no, mark);
            return;
        }

        if (position > size) {
            System.out.println("Inserting at the very last.");
            InsEnd(regd_no, mark);
            return;
        }

        Node tempNode = head;
        for (int i = 1; i < position - 1; i++) {
            tempNode = tempNode.next;
        }

        Node node = new Node(regd_no, mark);
        node.next = tempNode.next;
        tempNode.next = node;
        size++;
    }

    public static int DelBeg() {
        int regd_no = head.regd_no;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return regd_no;
    }

    public static int DelEnd() {
        if (size <= 1)
            return DelBeg();
        Node secondLastNode = get(size - 2);
        int regd_no = tail.regd_no;
        tail = secondLastNode;
        tail.next = null;
        size--;
        return regd_no;
    }

    public static int DelAny(int position) {
        if (position <= 1)
            return DelBeg();
        if (position >= size)
            return DelEnd();
        Node prevNode = get(position - 2);
        int regd_no = prevNode.next.regd_no;
        prevNode.next = prevNode.next.next;
        size--;
        return regd_no;
    }

    public static void search(int regd_no) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node tempNode = head;
        while (tempNode != null && tempNode.regd_no != regd_no) {
            tempNode = tempNode.next;
        }

        if (tempNode == null) {
            System.out.println("Error RegdNo " + regd_no + " not found in the list.");
        } else {
            System.out.printf("Found -> RegdNo=%d, Current Mark=%.2f%n", tempNode.regd_no, tempNode.mark);
            System.out.print("Enter new mark: ");
            tempNode.mark = scanner.nextFloat();
            System.out.println("Mark updated successfully.");
        }
    }

    public static void sort() {
        if (head == null || head.next == null) {
            System.out.println("Nothing to sort.");
            return;
        }
        boolean swapped;
        do {
            swapped = false;
            Node tempNode = head;
            while (tempNode.next != null) {
                if (tempNode.mark < tempNode.next.mark) {
                    int tempRegd = tempNode.regd_no;
                    tempNode.regd_no = tempNode.next.regd_no;
                    tempNode.next.regd_no = tempRegd;

                    float tempMark = tempNode.mark;
                    tempNode.mark = tempNode.next.mark;
                    tempNode.next.mark = tempMark;

                    swapped = true;
                }
                tempNode = tempNode.next;
            }
        } while (swapped);

        System.out.println("List sorted (highest marks first). ");
    }

    public static void reverse() {
        Node prevNode = null, current = head, oldHead = head, next = null;
        while (current != null) {
            next = current.next;
            current.next = prevNode;
            prevNode = current;
            current = next;
        }
        /* Need to update the global pointers. */
        tail = oldHead;
        head = prevNode;
        System.out.println("List reversed.");
    }

    public static void main(String[] args) {
        int choice;

        while (true) {
            System.out.println("\n╔══════════════════════════╗");
            System.out.println("║        *** MENU ***      ║");
            System.out.println("╠══════════════════════════╣");
            System.out.println("║  0  : Exit               ║");
            System.out.println("║  1  : Create list        ║");
            System.out.println("║  2  : Display list       ║");
            System.out.println("║  3  : Insert at beginning║");
            System.out.println("║  4  : Insert at end      ║");
            System.out.println("║  5  : Insert at position ║");
            System.out.println("║  6  : Delete from begin  ║");
            System.out.println("║  7  : Delete from end    ║");
            System.out.println("║  8  : Delete at position ║");
            System.out.println("║  9  : Search             ║");
            System.out.println("║  10 : Sort               ║");
            System.out.println("║  11 : Count Nodes        ║");
            System.out.println("║  12 : Reverse            ║");
            System.out.println("╚══════════════════════════╝");

            System.out.println("Enter choice: ");
            choice = scanner.nextInt();
            Result input;

            switch (choice) {

            case 0:
                System.out.println("Exiting... Bye!");
                System.exit(0);

            case 1:
                create();
                break;

            case 2:
                display();
                break;

            case 3:
                input = askInput();
                InsBeg(input.regd_no(), input.mark());
                break;

            case 4:
                input = askInput();
                InsEnd(input.regd_no(), input.mark());
                break;

            case 5:
                input = askInput();
                System.out.println("Enter Position (1-based): ");
                int position = scanner.nextInt();
                InsAny(input.regd_no(), input.mark(), position);
                break;

            case 6:
                DelBeg();
                System.out.println("First node deleted.");
                break;

            case 7:
                DelEnd();
                System.out.println("Last node deleted.");
                break;

            case 8:
                System.out.println("Enter position to delete (1-based): ");
                position = scanner.nextInt();
                DelAny(position);
                break;

            case 9:
                System.out.println("Enter Position to update (1-based): ");
                position = scanner.nextInt();
                search(position);
                break;

            case 10:
                sort();
                break;

            case 11:
                System.out.println("Total number of nodes are: " + size);
                break;

            default:
                System.out.println("Wrong choice! Please try again.");
            }
        }
    }

}
