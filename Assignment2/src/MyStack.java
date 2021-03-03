class MyStack {
    private static final int MAXIMUM = 500;
    private int top;
    private int min;
    private int[] myStack = new int[MAXIMUM]; // Maximum size of Stack

    //Constructor
    MyStack (){
        //makes the first value pushed into the stack at index 0 instead of 1.
        top = -1;
    }

    // Prints minimum element of MyStack
    void getMin() {
        if (top == -1) { //checks if there are no elements in the stack.
            System.out.println("Stack is empty");
        }
        else{
            System.out.println("The minimum of this stack is: " + min);
        }
    }

    // Prints top element of MyStack
    void peek(){
        System.out.println("The top of this stack is: " + myStack[top]);
    }


    // Removes the top element from MyStack
    void pop() {
        if (top < 0) { //checks to see if the stack is empty
            System.out.println("Stack Underflow");
            System.out.println(0);
        } else {
            System.out.println(myStack[top--] +" was popped out of this stack");
        }
        newMin();
    }

    // Minimum will change as the minimum element of the stack is being removed.
    void newMin (){
        min = myStack[0]; //sets min to the first index of the stack
        for (int i =0; i<= top; i++){
            if (myStack[i] < min){ //checks to see if other values are less than the current min
                min= myStack[i]; //if so, it becomes the new min
            }
        }
    }

    // Insert new number into MyStack
    void push(int n) {
        if (top >= (MAXIMUM - 1)) { //checks to see if the stack is too large
            System.out.println("Stack Overflow");
        } else {
            myStack[++top] = n; //makes n, the value being pushed, the next value in the stack.
            System.out.println(n + " pushed into stack");
        }
        //checks if n, the new number, is less than the current min
        if(n < min){
            min = n; //if so, n becomes the new min
        }
        newMin(); //changes min
    }

    // Main method
    public static void main(String[] args) {
        //creates stack object
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
