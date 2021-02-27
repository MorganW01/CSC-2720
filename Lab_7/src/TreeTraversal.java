public class TreeTraversal {

    public static void main(String[] args){
        // Create a tree called tree1
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


        BinaryTree<Character> tree2 = new BinaryTree("F");

        //
        //    BUILD tree2 HERE
        //


        System.out.println(checkSkipped(tree1)); // Should return false
        System.out.println(checkSkipped(tree2)); // Should return true

    }

    public static boolean checkSkipped(BinaryTree<Character> tree){
	/*	//   To Iterate a tree using Inorder Traversal
		TreeIterator<Character> iter = new TreeIterator<Character>(tree);
		iter.setInorder();
		while (iter.hasNext()){
			System.out.print (iter.next());
		}
 	*/


        // INSERT CODE HERE
        return false;
    }

}
