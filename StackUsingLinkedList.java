import java.util.Scanner;

public class StackUsingLinkedList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node top = null;

    static void push(int value) {
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;

        System.out.println(value + " pushed into stack");
    }

    static void pop() {
        if (top == null) {
            System.out.println("Stack Underflow");
        } else {
            System.out.println(top.data + " popped from stack");
            top = top.next;
        }
    }

    static void display() {
        if (top == null) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Stack elements:");

            Node current = top;

            while (current != null) {
                System.out.println(current.data);
                current = current.next;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Display");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value: ");
                    push(sc.nextInt());
                    break;

                case 2:
                    pop();
                    break;

                case 3:
                    display();
                    break;

                case 4:
                    System.out.println("Program ended.");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
