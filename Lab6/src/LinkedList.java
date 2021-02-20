//NAME: MORGAN WARREN

public class LinkedList {
    static Node head;

    static class Node {
        int data;
        Node next;

        //Node Constructor
        Node(int d) {

            data = d;
            next = null;
        }
    }

    public static void main(String[] args) {
        //LinkedList object
        LinkedList list = new LinkedList();

        // creates new node values to go into the list
        list.head = new Node(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(3);
        list.head.next.next.next = new Node(4);

        System.out.println("Given Linked list:");

        //prints original linked list
        list.printList(head);

        // reverses linked list
        head = list.reverse(head);
        System.out.println("");
        System.out.println("Reversed linked list:");

        //prints reversed linked list
        list.printList(head);
    }

    // Function to reverse the linked list
    Node reverse(Node node) {

        Node prev = null;
        Node current = node;
        Node next = null;

        //while loop that switches next, current, and prev variables in order to reverse the linked list.
        while (current != null){ //while node is NOT empty or "null"
            next = current.next; //sets next variable to next value in the node
            current.next = prev; //sets previous variable to next value in the current node
            prev = current; //sets previous variable equal to the current node value
            current = next; //sets current node value equal to the next variable value.
        }

        node = prev; //since current was = node and now prev = current, node has to = prev in order to return it.
        return node; //returns reversed node at the end

    }
    // prints content of double linked list while the node is NOT empty or "null"
    void printList(Node node) {
        while(node != null){
            System.out.println(node.data + " ");
            node = node.next; //sets node equal to the next value so it can get printed too
        }

    }

}