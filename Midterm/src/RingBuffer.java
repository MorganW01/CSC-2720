/*
* MORGAN WARREN
* CSC 2720 MIDTERM QUESTION 1
* 2/22/21
* SECTION 018
* */
public class RingBuffer {


    // Java program to implement a queue using an array

        private static int front, rear, capacity;
        private static int queue[];

        RingBuffer (int c) {
            front = rear = 0;
            capacity = c;
            queue = new int[capacity];
        }

        // function to insert an element at the rear of the queue
        public static void enqueue (int data) {

            // check queue is full or not
            if (capacity == rear) {
                System.out.println("The Ring Buffer is full");
            }
            // insert element at the rear
            else {
                queue[rear] = data; rear++; }
        }

        public static int dequeue (){
            int dequeuedElement=0;
            if (front == -1){

                System.out.println("The Ring Buffer is empty.");
            }

            else if (front == rear){

                front=rear= -1;
            }

            else if (front == capacity-1){ //could be capacity*
                front = 0;


            }

            dequeuedElement = queue[front];
            front = front+1;

            return dequeuedElement;
        }

        public static void printQueue () {
            int i;
            if (front == rear) {
                System.out.print("The Ring Buffer is empty");
            }

            // traverse front to rear and print elements
            for (i = front; i < rear; i++) {

                if (i<capacity -1){
                    System.out.print(queue[i] + ", ");
                }
                else {
                    System.out.println(queue[i]);
                }
            }
        }


        public static void main (String [] args){
            RingBuffer ringBuffer = new RingBuffer(4);
            enqueue(1);
            enqueue(2);
            enqueue(3);
            enqueue(4);

            //FIRST TEST:
            System.out.println("Deleted element: "+ dequeue()); //Deleted element = 1
            printQueue();
            System.out.println("Deleted element: "+ dequeue()); //Deleted element = 2
            printQueue();

            //SECOND TEST
            enqueue(5);
            enqueue(6); //Ring Buffer is full


        }




}


