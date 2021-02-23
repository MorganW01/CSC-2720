/*
* MORGAN WARREN
* CSC 2720 MIDTERM QUESTION 1
* 2/22/21
* SECTION 018
* */

public class RingBuffer {

    //creates the private variables needed throughout the program
        private static int front, rear, capacity;
        //creates empty int array called ringBuffer
        private static int[] ringBuffer;

        private RingBuffer(int c) { //sets/initializes variables
            front = rear = 0;
            capacity = c;
            ringBuffer = new int[capacity];
        }

        //method to add values into the Ring Buffer
        public static void enqueue (int data) {
            //checks to see if the Ring Buffer is at capacity.
            if (capacity == rear) {
                System.out.println("The Ring Buffer is full");
            }
            // if it's not full, it inserts elements at the rear
            else {
                ringBuffer[rear] = data; rear++;
            }
        }

        //method to remove values from the Ring Buffer
        public static int dequeue (){
            int dequeuedElement = 0;
            //checks to see if the Ring Buffer is empty.
            if (front == -1){
                System.out.println("The Ring Buffer is empty.");
            }

            //checks to see if Ring Buffer has only one value.
            else if (front == rear){
                front=rear= -1;
            }

            //checks to see if the rear is at the last position of the Ring Buffer.
            else if (front == capacity-1){
                front = 0;
            }
            // deletes the element from Ring Buffer
            dequeuedElement = ringBuffer[front];
            //sets front equal to next value in the Ring Buffer
            front = front+1;

            return dequeuedElement;
        }

        public static void printRingBuffer () {
            //used for locating values in the Ring Buffer
            int i;
            //checks to see if Ring Buffer is empty.
            if (front == rear) {
                System.out.println("The Ring Buffer is empty");
            }

            // goes through Ring Buffer front to rear and prints elements
            System.out.print("The elements in the Ring Buffer are: ");
            for (i = front; i < rear; i++) {
                if (i<capacity -1){ //if capacity has not been reached.
                    System.out.print(ringBuffer[i] + ", ");
                }
                else { //stops printing comma once capacity is reached
                    System.out.println(ringBuffer[i]);
                }
            }
        }


        public static void main (String [] args){

            //FIRST TEST:
            RingBuffer ringBuffer1 = new RingBuffer(4);
            enqueue(1);
            enqueue(2);
            enqueue(3);
            enqueue(4);
            printRingBuffer();

            System.out.println("Deleted element = "+ dequeue()); //Deleted element = 1
            System.out.println("Deleted element = "+ dequeue()); //Deleted element = 2
            printRingBuffer();

            System.out.println();
            //SECOND TEST:
            RingBuffer ringBuffer2 = new RingBuffer(5);
            enqueue(3);
            enqueue(4);
            enqueue(9);
            enqueue(20);
            enqueue(5);
            enqueue(1); // returns that the buffer is full when trying to add another value that's over the capacity
            printRingBuffer();


        }

}


