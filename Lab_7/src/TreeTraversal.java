// NAME: Morgan Warren
// CSC 2720 Section 018 2/27/21

public class TreeTraversal {

    public static void main(String[] args){

        // Creating a tree called tree1
        BinaryTree<Character> tree1 = new BinaryTree("H");

        BinaryTree<Character> rightsubtree1 = new BinaryTree("X");
        rightsubtree1.attachRight('Y');

        BinaryTree<Character> leftsubtree1 = new BinaryTree("D");
        leftsubtree1.attachLeft('B');

        BinaryTree<Character> leftsubtree2 = new BinaryTree("F");
        leftsubtree2.attachRight('G');
        leftsubtree2.attachLeft('E');

        leftsubtree1.attachRightSubtree(leftsubtree2);
        tree1.attachLeftSubtree(leftsubtree1);
        tree1.attachRightSubtree(rightsubtree1);


        // creating a tree called tree2
        BinaryTree<Character> tree2 = new BinaryTree("F");

        BinaryTree<Character> tree2rightsubtree1 = new BinaryTree("G");

        BinaryTree<Character> tree2rightsubtree2 = new BinaryTree("I");
        tree2rightsubtree2.attachLeft('H');


        BinaryTree<Character> tree2leftsubtree1 = new BinaryTree("B");
        tree2leftsubtree1.attachLeft('A');

        BinaryTree<Character> tree2rightsubtree3 = new BinaryTree("D");
        tree2rightsubtree3.attachLeft('C');
        tree2rightsubtree3.attachRight('E');


        tree2leftsubtree1.attachRightSubtree(tree2rightsubtree3);
        tree2.attachLeftSubtree(tree2leftsubtree1);
        tree2.attachRightSubtree(tree2rightsubtree1);


        System.out.println(checkSkipped(tree1)); // Should return true
        System.out.println(checkSkipped(tree2)); // Should return false

    } //end main


    public static boolean checkSkipped(BinaryTree<Character> tree){

        // To Iterate a tree using Inorder Traversal
        TreeIterator <Character> iter = new TreeIterator<Character>(tree);

        //sets iterated tree in order
        iter.setInorder();

        //creates new empty string that will later contain the values from the transversed tree
        String treeString = "";

        //while loop used to add the values to the string
        while (iter.hasNext()) {
            treeString = treeString+iter.next();
        }
        //prints the string
        System.out.println(treeString);

        //ints that will later store the values of the char (ascii)
        int currentChar = 0;
        int nextChar = 0;

        //for loop used to compare the chars and check if there's any skipped letters
        for (int i =0; i<treeString.length(); i++){

            //if statement to ensure no out of range errors
            if (i+1 < treeString.length()){
                currentChar = treeString.charAt(i); //stores char value at index i
                nextChar = treeString.charAt(i+1); //stores the next char value at index i + 1

                if (nextChar != currentChar+1){ //checks to see if the ascii values of the next char is equal to the correct value (currentChar + 1)
                    return true; // if it's not, it returns true because a letter has been skipped

                }

            }

        }
        return false; //returns false if a letter has not been skipped
    } //end checkSkipped
} //end class