import java.util.ArrayList;
import java.util.List;

public class ArrayIntersection {
    public static void main (String[] args){
        //print the intersecting values as an array

        int[] nums1 = {4,9,5}; // values in nums1 can be changed w/out problems
        int[] nums2 = {9,4,7,8}; // values in nums2 can be changed w/out problems

        ArrayIntersection arrayIntersection = new ArrayIntersection();
        System.out.println(arrayIntersection.findIntersection(nums1, nums2));

    }

    public List<Integer> findIntersection (int [] a1, int [] a2) {
        //initializes array list that will collect the intersecting values
        List<Integer> a3 = new ArrayList<>();

        for (int i =0; i<a1.length; i++){ //for loop checks through first array
            for (int j =0; j< a2.length; j++){ //for loop checks through second array
                if (a1[i]== a2[j]){ // if there is a common element it will add it to a3
                    a3.add(a1[i]);
                }
            }
        }

        return a3;

    }

}

