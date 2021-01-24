import java.util.Stack;

public class Lab2 {

    /**
     * Write a function called isBalanced that takes a string of braces as input and returns true if
     * the braces in the string are balanced. If there are more ‘{’ than ‘}’ or more ‘}’ than ‘{’ in the
     * string, the function should return false. You should make use of the built-in java
     * implementation of the stack data structure under java.util.Stack .
     */

    public static void main (String [] args){
        String str = "{}{{{{}}"; // this test works
        String str2 = "{{{}}}";
        boolean ans = isBalanced(str2);
        System.out.println("Answer " + ans); // should print false

    }


    public static boolean isBalanced(String str){ // look up java.util.Stack on java docs
        Stack<Character> stack = new Stack <Character>();
        int l=0; // variable to count left braces
        int r=0; //variable to count right braces
        for (int i =0; i <str.length(); i++){
            stack.push(str.charAt(i));
            if (str.charAt(i) == '{'){
                stack.pop();
                l++;
            }
            else if (str.charAt(i) == '}') {
                stack.pop();
                r++;
            }
        }

        if (l==r){

            return true;
        }
        else{
            return false;
        }

    }






}

