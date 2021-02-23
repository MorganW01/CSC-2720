/*
 * MORGAN WARREN
 * CSC 2720 MIDTERM QUESTION 1
 * 2/22/21
 * SECTION 018
 * */


/*
* [40 Points] Write a Java program to build a Linked List data structure from scratch. i.e. : writing
your own LinkedList class. The most recently added element in the LinkedList is the head element.
Your LinkedList should be able to do the following :
a. Show that it consists of 5 integers of your choice, Indicating the head element.
b. Show the remaining 4 elements of the LinkedList once you have deleted the old head element.
c. Indicate the new head.
* */



public class LinkedList {

    Node head;


    static class Node {

        int data;
        Node next;

        // Constructor
        Node(int d)
        {
            data = d;
            next = null;
        }
    }


    public static void addNode (int value) {


    }

    public static void deleteNode (int index) {





    }

    public static void printLinkedList(LinkedList list) {
        Node currentNode = list.head;

        System.out.print("LinkedList: ");

        // Traverse through the LinkedList
        while (currentNode != null) {
            // Print the data at current node
            System.out.print(currentNode.data + " ");

            // Go to next node
            currentNode = currentNode.next;
        }
    }



    public static void main (String [] args) {

        LinkedList newList = new LinkedList();

        printLinkedList(newList);





    }







}
