import java.util.Arrays;
import java.io.*;

public class Lab11 {

    static void bubbleSort(int[] array) {
        //int for length of array
        int arrayLength = array.length;
        //double for loop that sorts the array
        for (int i = 0; i < arrayLength-1; i++)
            for (int j = 0; j < arrayLength-i-1; j++)
                //checks if value of array[j] is greater than array[j+1]
                if (array[j] > array[j+1]) {
                    // swap temp and arr[i]
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
    }

    static void printArray(int []array) {
        //int for length of array
        int arrayLength = array.length;
        //for loop that goes thru array and prints each element.
        for (int i=0; i<arrayLength; ++i)
            System.out.print(array[i] + " ");
    }


    public static void main(String []args){
    //Driver Code To test the working of your function
        int[] arr = {0, 1, 2, 0, 1, 2};
        //runs sort method
         bubbleSort(arr);
        System.out.print("Final sorted array: ");
        //prints array
        printArray(arr);

    }

}