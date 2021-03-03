import java.util.Stack;

// A   user defined stack that supports getMin() in
// addition to push() and pop()
class MyStack {
    // Your Code Here
    private static final int MAXIMUM = 1000;
    private int top;
    private int min;
    private int[] a = new int[MAXIMUM]; // Maximum size of Stack


    // Prints minimum element of MyStack
    void getMin() {
        System.out.println(min);
    }

    // prints top element of MyStack
    // Your Code Here

    void peek(){

    }


    // Removes the top element from MyStack
    // Your Code Here


    // Minimum will change as the minimum element of the stack is being removed.
    // Your Code Here


    // Insert new number into MyStack, push
    boolean push(int x) {
        if (top >= (MAXIMUM - 1)) {
            System.out.println("Stack Overflow");
            return false;
        } else {
            a[++top] = x;
            System.out.println(x + " pushed into stack");
            return true;
        }
    }


    // If new number is less than original minimum
    // Your Code Here

    // Driver Code
    public static void main(String[] args) {
        MyStack s = new MyStack();
        s.push(3);
        s.push(5);
        s.getMin();
        s.push(2);
        s.push(1);
        s.getMin();
        s.pop();
        s.getMin();
        s.pop();
        s.peek();
    }
}
