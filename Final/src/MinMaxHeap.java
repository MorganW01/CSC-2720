/*
* Morgan Warren
* 4/27/21
* CSC 2720 Section 018
* Final Exam Question 1
* */
public class MinMaxHeap {

    public void rearrangeHeap (int array[]) {
        int n = array.length;
        // rearrange array to max heap
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(array, n, i);

    }

    void heapify(int array[], int n, int i) {
        int largest = i; // Initialize largest as root
        int l = 2*i + 1; // left = 2*i + 1
        int r = 2*i + 2; // right = 2*i + 2

        // If left child is larger than root
        if (l < n && array[l] > array[largest])
            largest = l;

        // If right child is larger than largest so far
        if (r < n && array[r] > array[largest])
            largest = r;

        // If largest is not root
        if (largest != i)
        {
            int swap = array[i];
            array[i] = array[largest];
            array[largest] = swap;

            // Recursively heapify the affected sub-tree
            heapify(array, n, largest);
        }
    }

    public static void main(String [] args){
        //creates min heap array
        int[] array = {3, 5, 9, 6, 8, 20, 10, 12, 18, 9};

        //creates MinMaxHeap object
        MinMaxHeap object = new MinMaxHeap();

        System.out.println("Min Heap Array: "); //prints original min heap
        for (int value : array) {
            System.out.print(value + " ");
        }

        System.out.println();
        object.rearrangeHeap(array); //sorts and converts to max heap

        System.out.println("Max Heap Array: "); //prints sorted max heap
        for (int value : array) {
            System.out.print(value + " ");
        }
    }

}
