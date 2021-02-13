public class Tester {
    public static void main (){
        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        head.next = second; second.next = third;

        System.out.println("List Before Deletion");
        printLinkedList(head); // Should be 1 2 3

        // User wants to delete at index 2
        deleteAtIndex(2, head);
        System.out.println("List After Deletion at index 2");
        printLinkedList(head); // Should be 1 2

        // User wants to delete at index 1
        deleteAtIndex(1, head);
        System.out.println("List After Deletion at index 1");
        printLinkedList(head); // Should be 2
    }

    // To pass the linked list to a function, you only need to pass the head
    public static void deleteAtIndex(int value, Node head){
        Node prev, curr;
        int counter = 0;// increment count as you traverse the list

        // INSERT CODE HERE



    }

    public static void printLinkedList(Node head){
        for(Node cur = head;cur!=null;cur=cur.next){
            System.out.print(cur.item+" ");

        }

        System.out.println();

    }

}



