package Semester02.Assignment04;

/* How can we make this even more better? */

import java.util.Scanner;

class Node {
    protected int regd_no;
    protected float mark;
    protected Node next;

    Node(int regd_no, float mark) {
        this.regd_no = regd_no;
        this.mark = mark;
        this.next = null;
    }
}

public class LinkedList {
    static Scanner scanner = new Scanner(System.in);

    private static Node makeNewNode() {
        System.out.println("Enter Registration Number: ");
        int regd_no = scanner.nextInt();
        System.out.println("Enter mark: ");
        float mark = scanner.nextFloat();
        return new Node(regd_no, mark);
    }

    public static Node create(Node start) {
        System.out.print("How many node to create? ");
        int nodes = scanner.nextInt();
        for (int i = 1; i <= nodes; i++) {
            System.out.println("--Node " + i + "--");
            start = InsEnd(start);
        }
        return start;
    }

    public static void display(Node start) {
        if (start == null) {
            System.out.println("List is empty.");
            return;
        }
        System.out.println("\n Regd No. AND Mark");
        Node current = start;
        while (current != null) {
            System.out.printf(" %-8d|  %.2f%n", current.regd_no, current.mark);
            current = current.next;
        }
        System.out.println();
    }

    public static Node InsBeg(Node start) {
        Node newNode = makeNewNode();
        newNode.next = start;
        return newNode;
    }

    public static Node InsEnd(Node start) {
        Node newNode = makeNewNode();
        if (start == null)
            return newNode;

        Node current = start;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
        return start;
    }

    public static Node InsAny(Node start) {
        System.out.println("Enter Position (1-based): ");
        int position = scanner.nextInt();
        if (position <= 1 || start == null) {
            System.out.println("No elements present. Inserting at the very start.");
            return InsBeg(start);
        }
        Node newNode = makeNewNode();
        Node current = start;

        for (int i = 1; i < position - 1 && current.next != null; i++) {
            current = current.next;
        }

        /* Not required.
        if (current == null) {
            System.out.println("Position out of range - node added at the end.");
            current = start;
            while (current.next != null) {
                current = current.next;
            }
        }
        */

        newNode.next = current.next;
        current.next = newNode;
        return start;
    }

    public static Node DelBeg(Node start) {
        if (start == null) {
            System.out.println("List is empty. Nothing to delete.");
            return null;
        }
        System.out.printf("Delete Node: RegdNo=%d, Mark=%.2f%n", start.regd_no, start.mark);
        return start.next;
    }

    public static Node DelEnd(Node start) {
        if (start == null) {
            System.out.println("List is empty. Nothing to delete.");
            return null;
        }

        if (start.next == null) {
            System.out.printf("Delete node: RedgNo=%d, Mark=%.2f%n", start.regd_no, start.mark);
            DelBeg(start);
            return null;
        }

        Node current = start;
        while (current.next.next != null)
            current = current.next;
        System.out.printf("Delete node: RegdNo=%d, Mark=%.2f%n", start.regd_no, start.mark);
        current.next = null;
        return start;
    }

    public static Node DelAny(Node start) {
        if (start == null) {
            System.out.println("List is empty. Nothing to delete.");
            return null;
        }

        System.out.println("Enter position to delete (1-based): ");
        int position = scanner.nextInt();

        if (position <= 1)
            return DelBeg(start);
        Node current = start;
        for (int i = 1; i < position - 1 && current.next != null; i++) {
            current = current.next;
        }
        if (current.next == null) {
            System.out.println("Position out of range.");
            return start;
        }
        System.out.printf("Deleted node: RegdNo=%d, Mark=%.2f%n", current.next.regd_no, current.next.mark);
        current.next = current.next.next;
        return start;
    }

    public static void search(Node start) {
        if (start == null) {
            System.out.println("List is empty.");
            return;
        }
        System.out.println("Enter registration No to search: ");
        int key = scanner.nextInt();

        Node current = start;
        while (current != null && current.regd_no != key) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Error RegdNo " + key + "not found in the list.");
        } else {
            System.out.printf("Found -> RegdNo=%d, Current Mark=%.2f%n", current.regd_no, current.mark);
            System.out.println("Enter new mark: ");
            current.mark = scanner.nextFloat();
            System.out.println("Mark update successfully.");
        }
    }

    public static void sort(Node start) {
        if (start == null || start.next == null) {
            System.out.println("Nothing to sort");
            return;
        }
        boolean swapped;
        do {
            swapped = false;
            Node current = start;
            while (current.next != null) {
                if (current.mark < current.next.mark) {
                    int tempRegd = current.regd_no;
                    current.regd_no = current.next.regd_no;
                    current.next.regd_no = tempRegd;
                    float tempMark = current.mark;
                    current.mark = current.next.mark;
                    current.next.mark = tempMark;

                    swapped = true;
                }
                current = current.next;
            }
        } while (swapped);

        System.out.println("List sorted (highest marks first).");
    }

    public static int count(Node start) {
        int count = 0;
        Node current = start;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public static Node reverse(Node start) {
        Node previous = null, current = start, next = null;
        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        System.out.println("List reversed");
        return previous;
    }

    // Assigned On: (untracked)
    public static void main(String[] args) {
        Node start = null;
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

            switch (choice) {

            case 0:
                System.out.println("Exiting... Bye!");
                System.exit(0);

            case 1:
                start = create(start);
                break;

            case 2:
                display(start);
                break;

            case 3:
                start = InsBeg(start);
                break;

            case 4:
                start = InsEnd(start);
                break;

            case 5:
                start = InsAny(start);
                break;

            case 6:
                start = DelBeg(start);
                break;

            case 7:
                start = DelEnd(start);
                break;

            case 8:
                start = DelAny(start);
                break;

            case 9:
                search(start);
                break;

            case 10:
                sort(start);
                break;

            case 11:
                System.out.println("  Total nodes: " + count(start));
                break;

            case 12:
                start = reverse(start);
                break;

            default:
                System.out.println("Wrong choice! Please try again.");
            }
        }
    }
}