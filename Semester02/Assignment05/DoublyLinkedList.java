package Semester02.Assignment05;

import java.util.Scanner;

class Node {
    protected int regd_no;
    protected float mark;
    protected Node next;
    protected Node prev;

    Node(int regd_no, float mark) {
        this.regd_no = regd_no;
        this.mark = mark;
        this.next = null;
        this.prev = null;
    }
}

public class DoublyLinkedList {
    static Scanner scanner = new Scanner(System.in);

    private static Node makeNewNode() {
        System.out.print("Enter registration number: ");
        int regd_no = scanner.nextInt();
        System.out.print("Enter marks: ");
        float marks = scanner.nextFloat();
        return new Node(regd_no, marks);
    }

    public static Node create(Node start, Node end) {
        System.out.print("How many nodes to create: ");
        int numberOfNodes = scanner.nextInt();

        if (numberOfNodes <= 0) {
            System.out.println("Invalid number of nodes.");
            return start;
        }

        for (int i = 1; i <= numberOfNodes; i++) {
            System.out.println("\n--- Entering Details for Student " + i + " ---");
            start = insEnd(start, null);
        }
        System.out.println("\n Successfully initialized " + numberOfNodes + " nodes.");
        return start;
    }

    public static void search(Node start, Node end) {
        if (start == null) {
            System.out.println("The list is empty.");
            return;
        }
        System.out.println("Enter registration number: ");
        int regd_no = scanner.nextInt();

        Node current = start;
        boolean found = false;

        while (current != null) {
            if (current.regd_no == regd_no) {
                found = true;
                System.out.printf("Record Found! Current Marks for Regd No %d: %.2f%n", current.regd_no, current.mark);

                System.out.println("Enter the new mark obtained: ");
                float newMark = scanner.nextFloat();

                current.mark = newMark;
                System.out.println("Updated mark!");
                break;
            }
            current = current.next;

        }

        if (!found) {
            System.out.println("Student record with Registration Number " + regd_no + " not found.");
        }
    }

    public static Node insBeg(Node start, Node end) {
        Node newNode = makeNewNode();
        if (start != null) {
            start.prev = newNode;
        }
        newNode.next = start;
        return newNode;
    }

    public static Node insEnd(Node start, Node end) {
        Node newNode = makeNewNode();
        if (start == null) {
            System.out.println("List is empty. Inserting at the start.");
            return newNode;
        }

        Node currentEnd = (end != null) ? end : start;
        while (currentEnd.next != null) {
            currentEnd = currentEnd.next;
        }

        currentEnd.next = newNode;
        newNode.prev = currentEnd;

        return start;
    }

    public static Node insAny(Node start, Node end) {
        System.out.print("Enter position (1-based): ");
        /* Letting users enter 1-based, internally mapping the same to 0-based. */
        int position = scanner.nextInt() - 1;

        if (position <= 0 || start == null) {
            System.out
                    .println("Either list is empty, or index supplied is out of bounds. Inserting at first position.");
            return insBeg(start, end);
        }

        Node current = start;
        int index = 0;
        while (current.next != null && index < position - 1) {
            current = current.next;
            index++;
        }

        if (index < position - 1) {
            System.out.println("Index too large. Out of bounds. Inserting at last.");
            return insEnd(start, end);
        }

        Node newNode = makeNewNode();
        Node nextNode = current.next;

        newNode.next = nextNode;
        current.next = newNode;

        newNode.prev = current;
        if (nextNode != null) {
            nextNode.prev = newNode;
        }
        return start;
    }

    public static Node delBeg(Node start, Node end) {
        if (start == null) {
            System.out.println("Empty list. Nothing to delete.");
            return null;
        }

        Node current = start;
        if (current.next != null) {
            current.next.prev = null;
        }

        return current.next;
    }

    public static Node delEnd(Node start, Node end) {
        if (start == null) {
            System.out.println("Nothing to delete.");
            return null;
        }

        if (start.next == null) {
            System.out.println("Only one node exist. Deleting it.");
            return null;
        }

        Node lastNode = (end != null) ? end : start;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
        }
        System.out.printf("Deleting Regd No: %d from end.%n", lastNode.regd_no);

        Node secondLastNode = lastNode.prev;
        secondLastNode.next = null;

        return start;
    }

    public static Node delAny(Node start, Node end) {
        if (start == null) {
            System.out.println("Nothing to delete.");
            return null;
        }
        System.out.print("Enter the position of the node to delete (1-based): ");
        int position = scanner.nextInt() - 1;

        if (position <= 0) {
            System.out.println("Index out of bounds. Deleting at the start.");
            return delBeg(start, end);
        }

        Node current = start;
        int index = 0;
        while (current.next != null && index < position) {
            current = current.next;
            index++;
        }

        if (current == null || current.next == null) {
            return delEnd(start, end);
        }

        // Standard Middle Deletion (Splicing out 'current')
        System.out.printf("Deleting Regd No: %d%n", current.regd_no);

        Node leftNode = current.prev;
        Node rightNode = current.next;

        leftNode.next = rightNode;
        rightNode.prev = leftNode;
        return start;
    }

    public static void display(Node start, Node end) {
        if (start == null) {
            System.out.println("The list is empty. Nothing to print.");
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

    public static void main(String[] args) {
        Node start = null;
        Node end = null;
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
            System.out.println("╚══════════════════════════╝");

            System.out.println("Enter choice: ");
            choice = scanner.nextInt();

            switch (choice) {
            case 0:
                System.out.println("Shutting down the program...");
                System.exit(0);
            case 1:
                start = create(start, end);
                if (start == null) {
                    end = null;
                } else {
                    Node tempNode = start;
                    while (tempNode.next != null) {
                        tempNode = tempNode.next;
                    }
                    end = tempNode;
                }
                break;
            case 2:
                display(start, end);
                break;
            case 3:
                start = insBeg(start, end);
                break;

            case 4:
                boolean isEmpty = (start == null);
                start = insEnd(start, end);
                if (isEmpty)
                    end = start;
                break;

            case 5:
                /* Here we need to ensure that both pointer start and end are updated correctly. */
                boolean wasEmpty = (start == null);
                start = insAny(start, end);
                if (start == null) {
                    end = null;
                } else if (wasEmpty) {
                    end = start;
                } else {
                    Node tempNode = start;
                    while (tempNode.next != null) {
                        tempNode = tempNode.next;
                    }
                    end = tempNode;
                }
                break;

            case 6:
                start = delBeg(start, end);
                if (start == null) {
                    end = null;
                }
                break;
            case 7:
                start = delEnd(start, end);
                if (start == null) {
                    end = null;
                } else {
                    Node temp = start;
                    while (temp.next != null) {
                        temp = temp.next;
                    }
                    end = temp;
                }
                break;
            case 8:
                start = delAny(start, end);

                if (start == null) {
                    end = null;
                } else {
                    Node temp = start;
                    while (temp.next != null) {
                        temp = temp.next;
                    }
                    end = temp;
                }
                break;
            case 9:
                search(start, end);
                break;

            default:
                System.out.println("Wrong choice! Try again.");
                break;
            }
        }

    }
}
