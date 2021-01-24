import java.util.Stack;

public class Lab2 {

    public static void main (String [] args){
        // first example from lab instructions.
        String str = "{}{{{{}}";
        //String str2 = "{{{}}}"; // second example from lab instructions.
        boolean ans = isBalanced(str); //replace with str2 when testing second example.
        System.out.println("Answer " + ans); //should print false for str and true for str2.
    }

    public static boolean isBalanced(String str){
        // initializes stack object
        Stack<Character> stack = new Stack <Character>();
        // variable to count left braces
        int l=0;
        //variable to count right braces
        int r=0;
        //for loop to iterate through the string check the braces
        for (int i =0; i <str.length(); i++){
            stack.push(str.charAt(i)); // pushes string values to the stack
            if (str.charAt(i) == '{'){ //checks for a left brace
                stack.pop();
                l++; //increases if there is a left brace
            }
            else if (str.charAt(i) == '}') { //checks for a right brace
                stack.pop();
                r++; //increases if there is a right brace
            }
        }
        if (l==r){ // returns true if there are an equal amount of left and right braces.
            return true;
        }
        else { // returns false if there is not an equal amount of left and right braces.
            return false;
        }

    }
}

