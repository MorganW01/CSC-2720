import java.util.Arrays;
import java.io.*;

public class Lab11 {

    static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (array[j] > array[j+1])
                {
                    // swap temp and arr[i]
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
    }

    static void printArray(int []array)
    {
        int n = array.length;
        for (int i=0; i<n; ++i)
            System.out.print(array[i] + " ");
    }


    public static void main(String []args){
    //Driver Code To test the working of your function
        int[] arr = {0, 1, 2, 0, 1, 2};
         bubbleSort(arr);
        System.out.print("Final sorted array: ");
        printArray(arr);
    }

}