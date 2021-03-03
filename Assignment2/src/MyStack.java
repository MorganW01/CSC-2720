// A   user defined stack that supports getMin() in
// addition to push() and pop()
class MyStack {
    // Your Code Here
    private static final int MAXIMUM = 1000;
    private int top;
    private int min;
    private int[] myStack = new int[MAXIMUM]; // Maximum size of Stack

    //Constructor
    MyStack (){
        top = -1; //does this so the first value can be set at 0 instead of 1

    }


    // Prints minimum element of MyStack
    void getMin() {
        if (top == -1){
            System.out.println("Stack is empty");
        }
        else{
            System.out.println("The minimum of this stack is: " + min);

        }
    }

    // prints top element of MyStack
    // Your Code Here
    void peek(){
        System.out.println("The top of this stack is: " + myStack[top]);
    }


    // Removes the top element from MyStack
    // Your Code Here
    void pop() {
        if (top < 0) {
            System.out.println("Stack Underflow");
            System.out.println(0); //placeholder
        } else {
            System.out.println(myStack[top--] +" was popped out of this stack");
        }
        newMin();
    }

    // Minimum will change as the minimum element of the stack is being removed.
    void newMin (){
        min= myStack[0];

        for (int i =0; i<= top; i++){
            if (myStack[i]<min){
                min= myStack[i];

            }

        }

    }

    // Insert new number into MyStack, push
    void push(int x) {
        if (top >= (MAXIMUM - 1)) {
            System.out.println("Stack Overflow");
        } else {
            myStack[++top] = x;
            System.out.println(x + " pushed into stack");
        }
        // If new number is less than original minimum
        if(x < min){
            min =x;
        }
        newMin();
    }

    // Driver Code
    public static void main(String[] args) {
        MyStack newStack = new MyStack();
        newStack.push(3);
        newStack.push(5);
        newStack.getMin();
        newStack.push(2);
        newStack.push(1);
        newStack.getMin();
        newStack.pop();
        newStack.getMin();
        newStack.pop();
        newStack.peek();
    }
}
