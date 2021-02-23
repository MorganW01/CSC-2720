/*
 * MORGAN WARREN
 * CSC 2720 MIDTERM QUESTION 2
 * 2/22/21
 * SECTION 018
 * */


public class LinkedList {
    Node head;
    static class Node {
        int data;
        Node next;
        // Node Constructor
        Node(int d) {
            data = d;
            next = null;
        }
    }

    public void addNode (int value){
        //creates Node object and takes in value
        Node newNode = new Node(value);
        //sets the head variable to the value of newNode.next
        newNode.next = head;
        //head becomes the new node once the next value is added.
        head = newNode;
    }

    public void deleteNode(){
        Node temp = head;
        //checks to see if the LinkedList is empty.
        if (head == null){
            System.out.println("This LinkedList is empty");
        }

        else {
            //sets head equal to the temp.next "deleting" the current head.
            head = temp.next;
        }

    }


    public static void printLinkedList(LinkedList list) {
        //currentNode is set to the head (the first value of the list)
        Node currentNode = list.head;

        //counts the number of elements in the list.
        int numOfElements = 0;

        System.out.println("The LinkedList is as follows: ");

        //while loop will transverse thru the list as long as the current node is not null
        while (currentNode != null) {

            // prints out the data at current node
            System.out.print(currentNode.data + " ");

            // proceeds to the next node
            currentNode = currentNode.next;
            numOfElements++; //numElements increases as the while loop goes.
        }
        System.out.println();
        //prints number of elements
        System.out.println("This linked list consists of: " + numOfElements +" elements");
        //prints the head
        System.out.println("The head of this LinkedList is: " + list.head.data);


    }

    public static void main (String [] args) {

        LinkedList list = new LinkedList();

        //adds node values to the list.
        list.addNode(0);
        list.addNode(1);
        list.addNode(2);
        list.addNode(3);
        list.addNode(4); // most recent entry is the head


        printLinkedList(list); //prints the list
        list.deleteNode(); //deletes the first element
        System.out.println(); //space
        printLinkedList(list); //prints list again
        
    }


}
