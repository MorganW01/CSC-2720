import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;

/* A palindrome is a string of characters that reads the same from left to right as it does from right to left.
 * Write  a function called checkPalindrome that takes a string s1 and evaluate if the string is a palindrome
 * or not  using only a stack and a queue data structures. You should make use of the built-in java implementation of
 * the stack and queue data structure under java.util.Stack and java.util.Queue . */


public class Lab4 {
    public static void main(String[] args) {

        String s1 = "radar";
        boolean answer1 = checkPalindrome(s1);
        System.out.println("Answer 1: " + answer1); // Should be True

        String s2 = "HitTheRoadJack";
        boolean answer2 = checkPalindrome(s2);
        System.out.println("Answer 2: " + answer2); //Should be False
    }

    public static boolean checkPalindrome(String string) {
        Stack<Character> s = new Stack<Character>();
        Queue<Character> q = new LinkedList<Character>();

        //for loop goes through all the characters in the string and adds a char to both the stack and the queue.
        for (int i = 0; i < string.length(); i++) {
            s.push(string.charAt(i)); //puts the characters into the stack from first to last.
            q.add(string.charAt(i)); // adds the data in the queue from beginning to end
        }

        boolean answer = true;

        // goes through the loop while the queue is empty (until the queue is empty)
        while (q.isEmpty() == false) {
            // queue will poll elements from the beginning of the string and stack will pop elements from the end of the string
            // checks if they are the same and if they are it will continue
            if (q.poll() == s.pop())
                continue;

            // and if not it returns false.
            answer = false;
            break;
        }

        return answer;


    }
}

