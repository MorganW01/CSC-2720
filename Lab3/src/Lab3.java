import java.util.Stack;
public class Lab3 {

    public static void main (String[] args){
        String s1 = "DataStructuresIssss###Fun";
        String s2 = "DataStructuresIszwp###Fun";
        boolean ans = backspaceCompare(s1,s2);
        System.out.println(ans); // Should be True
    }

    public static boolean backspaceCompare(String s1, String s2) {
        Stack<Character> s1_stack = new Stack<Character>();
        Stack<Character> s2_stack = new Stack<Character>();

        for (int i =0; i<s1.length(); i++){
            if (s1.charAt(i) == '#') {
                s1_stack.pop();
            }
            else {
                s1_stack.push(s1.charAt(i));
            }
        }

        for (int j=0; j< s2.length(); j++){
            if (s2.charAt(j) == '#') {
                s2_stack.pop();
            }
            else {
                s2_stack.push(s2.charAt(j));
            }
        }

        String new_s1 = "";
        String new_s2 = "";

        while (!s1_stack.isEmpty()) {
            new_s1 += s1_stack.peek();
            s1_stack.pop();

        }

        while (!s2_stack.isEmpty()) {
            new_s2 += s2_stack.peek();
            s2_stack.pop();
        }

        return new_s1.equals(new_s2);

    }

}
