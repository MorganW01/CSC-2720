// A binary tree node
class Node {
    int data;
    Node left, right;

    Node(int d) {

        data = d;
        left = right = null; }
}

class BinarySearchTree {
    // Root of BST
    Node root;

    // Constructor
    BinarySearchTree() {
        root = null;
    }

    // function to insert nodes
    public void insert(int data) {
        this.root = this.insertRec(this.root, data);
    }

    /* A utility function to insert a new node with given key in BST */
    Node insertRec(Node node, int data) {
        // if the tree is empty, a new node is returned.
        if (node == null){
            this.root = new Node(data);
            return this.root;
        }

        if (data == node.data){
            return node;
        }

        if (data < node.data){
            node.left = this.insertRec(node.left, data);
        }

        else {
            node.right = this.insertRec(node.right, data);
        }
        return node;
    }

    // class that stores the value of count
    public class Count {
        int c = 0;
    }

    // utility function to find kth largest node in a given tree
    void kthLargestUtil(Node node, int k, Count C) {
        // Base cases, the second condition is important to avoid unnecessary recursive calls
        if (node == null || C.c >= k) {
            return;
        }

        else { // if the node isn't null
            this.kthLargestUtil(node.right, k, C);

            C.c++;

            if (C.c == k) {
                System.out.println("the " + k + " largest element is " + node.data);
            }

            this.kthLargestUtil(node.left, k, C);
        }
    }

    // Method to find the kth largest no in given BST
    void kthLargest(int k) {
        Count c = new Count(); // object of class count
        this.kthLargestUtil(this.root, k, c);

    }

    //main method
    public static void main(String[] args){
        //BinarySearchTree object
        BinarySearchTree tree = new BinarySearchTree();

        //inserts all elements of the tree
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        //sets k
        int k = 3;
        //finds kth largest node
        tree.kthLargest(k);
    }

}
