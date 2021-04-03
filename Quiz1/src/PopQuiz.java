import java.util.ArrayList;
public class PopQuiz {
    public static void main (String []args){
        //Quiz
        System.out.println("Pop Quiz Programming");
        Node head = new Node (1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next=new Node(1);
        head.next.next.next.next=new Node(2);

        head = getUnique(head);
        printLinkedList(head);

    }

    public static Node getUnique(Node head){

        //INSERT CODE HERE
    }

    public static void printLinkedList(){
        for (Node cur = head;cur!=null;cur=cur.next){
            System.out.print(cur.item+" ");

        }
        System.out.println();
    }


}
