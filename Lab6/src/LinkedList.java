//NAME: MORGAN WARREN

public class LinkedList {
    static Node head;
    static class Node {
        int data;
        Node next;
        Node(int d) //Node Constructor
        {
            data = d;
            next = null;
        }
    }
    /* Function to reverse the linked list */
    Node reverse(Node node) {
        //Write Your Code Here
    }
    // prints content of double linked list
    void printList(Node node) {
        //Write Your Code Here
    }
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.head = new Node(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(3);
        list.head.next.next.next = new Node(4);
        System.out.println("Given Linked list");
        list.printList(head);
        head = list.reverse(head);
        System.out.println("");
        System.out.println("Reversed linked list ");
        //Write Your Code to print the linked list Here.
    }
}