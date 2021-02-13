public class Tester {
    //NAME: MORGAN WARREN

    public static void main(String[] args) {
        //Creates node objects and sets values to them.
        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        head.next = second;
        second.next = third;

        System.out.println("List Before Deletion:");
        printLinkedList(head); // Should be 1 2 3

        // User wants to delete at index 2
        deleteAtIndex(2, head);
        System.out.println("List After Deletion at index 2:");
        printLinkedList(head); // Should be 1 2

        // User wants to delete at index 1
        deleteAtIndex(1, head);
        System.out.println("List After Deletion at index 1:");
        printLinkedList(head); // Should be 1
    }

    // To pass the linked list to a function, you only need to pass the head
    public static void deleteAtIndex(int value, Node head) {
        // INSERT CODE HERE
        /*for loop passes through the head until it gets to the spot before the specified index, then checks to make sure that the index is not empty
         * replaces the value in order to 'delete' the specified index.
         * */
        for (int counter = 0; counter < value - 1 && head.next != null; counter++) {
            head = head.next;
        }
        assert head.next != null;
        head.next = head.next.next; //replaces values to delete specified node

    }
    // Node traversal and printing
    public static void printLinkedList(Node head) {
        for (Node cur = head; cur != null; cur = cur.next) {
            System.out.print(cur.item + " ");

        }

        System.out.println();

    }

}



