/*
* Morgan Warren
* 4/27/21
* CSC 2720 Section 018
* Final Exam Question 1
* */
public class MinMaxHeap {

    public void sort(int arr[]) {
        int n = arr.length;
        // Build heap (rearrange array)
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);

    }

    void heapify(int arr[], int n, int i) {
        int largest = i; // Initialize largest as root
        int l = 2*i + 1; // left = 2*i + 1
        int r = 2*i + 2; // right = 2*i + 2

        // If left child is larger than root
        if (l < n && arr[l] > arr[largest])
            largest = l;

        // If right child is larger than largest so far
        if (r < n && arr[r] > arr[largest])
            largest = r;

        // If largest is not root
        if (largest != i)
        {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // Recursively heapify the affected sub-tree
            heapify(arr, n, largest);
        }
    }

    public static void main(String [] args){

        int[] array = {3, 5, 9, 6, 8, 20, 10, 12, 18, 9};
        int arrayLength = array.length;

        MinMaxHeap x = new MinMaxHeap();

        System.out.println("Min Heap Array: ");
        for (int value : array) {
            System.out.print(value + " ");
        }

        System.out.println();
        x.sort(array);

        System.out.println("Max Heap Array: ");
        for (int value : array) {
            System.out.print(value + " ");
        }
    }

}
