import java.util.Stack;
public class Lab3 {

    public static void main (String[] args){

        //test strings s1 and s2
        String s1 = "DataStructuresIssss###Fun";
        String s2 = "DataStructuresIszwp###Fun";
        //boolean variable used to run the method
        boolean ans = backspaceCompare(s1,s2);
        System.out.println(ans); // Should be True
    }

    public static boolean backspaceCompare(String s1, String s2) {
        //creates new stack variables
        Stack<Character> s1_stack = new Stack<Character>();
        Stack<Character> s2_stack = new Stack<Character>();

        // goes through s1 and pops all of the hash tags out and pushes all of the other characters into the stack.
        for (int i =0; i<s1.length(); i++){
            if (s1.charAt(i) == '#') {
                s1_stack.pop();
            }
            else {
                s1_stack.push(s1.charAt(i));
            }
        }

        // goes through s2 and pops all of the hash tags out and pushes all of the other characters into the stack.
        for (int j=0; j< s2.length(); j++){
            if (s2.charAt(j) == '#') {
                s2_stack.pop();
            }
            else {
                s2_stack.push(s2.charAt(j));
            }
        }

        //creates new empty strings that will be used for storing the characters from the stacks.
        String new_s1 = "";
        String new_s2 = "";


        //adds the values from s1_stack to new_s1 until the stack is empty
        while (!s1_stack.isEmpty()) {
            new_s1 += s1_stack.peek(); //peeks then adds to the new string
            s1_stack.pop(); // pops the value out of the stack until it is empty.

        }

        //adds the values from s2_stack to new_s2 until the stack is empty.
        while (!s2_stack.isEmpty()) {
            new_s2 += s2_stack.peek(); //peeks then adds to the new string
            s2_stack.pop(); // pops the value out of the stack until it is empty.
        }

        return new_s1.equals(new_s2); //checks if new_s1 and new_s2 are equal and returns true if they are and false if they are not.

    }

}
