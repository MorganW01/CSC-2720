import java.util.ArrayList;
import java.util.HashMap;

public class PopQuiz {
    public static void main (String []args){
        System.out.println("Pop Quiz Programming");
        //initializes all of the elements in the node
        Node head = new Node (1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next=new Node(1);
        head.next.next.next.next=new Node(2);

        //driver code for methods
        head = getUnique(head);
        printLinkedList(head);

    }

    public static Node getUnique(Node head){
        //checks if head is null, if so return null
        if (head==null){
            return null;
        }

        HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();

        //initializes currNode and prevNode
        Node currNode = head.next;
        Node prevNode = head;
        Node temp;
        map.put(head.item, 1);

        //runs while currNode is null
        while(currNode!=null){
            //initializes integer variable data
            int data = currNode.item;
            //checks if map contains the key data
            if (map.containsKey(data)){
                //sets the value of the next element in prevNode to the value of currNode.next
                prevNode.next = currNode.next;
                //sets temp to the value of the current Node
                temp=currNode;
                //sets current node to the next value
                currNode=currNode.next;
                //next temp value becomes null
                temp.next=null;
            }
            else{ //if map doesn't contain data key
                //puts value of data and 1 into the map
                map.put(data,1);
                //sets value of the prevNode to the currNode
                prevNode = currNode;
                //current node becomes the next value in the current node.
                currNode=currNode.next;
            }
        }
        return head;

    }

    public static void printLinkedList(Node head){
        //iterates thru the Node and prints each item
        for (Node cur = head;cur!=null;cur=cur.next){
            System.out.print(cur.item+" ");
        }
        System.out.println();
    }


}
