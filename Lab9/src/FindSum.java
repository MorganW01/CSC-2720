import java.util.HashSet;

public class FindSum {

    public static void main(String[] args) {
        //given test array
        int[] array = {1, 5, 4, 6, 7, 9};
        HashSet<Integer> res = findSums(array);
        System.out.println(res.toString());
    }

    public static HashSet<Integer> findSums(int[] elements) {
        //creates HashSets sums and hashtable
        HashSet<Integer> sums = new HashSet<Integer>();
        HashSet<Integer> hashtable = new HashSet<Integer>();

        //for loop that adds the elements of the array to the hashtable.
        for (int k =0; k <elements.length;k++){
            hashtable.add(elements[k]);

        }

        //double for loop that calculates the sum and adds it to the sums HashSet
        for (int i = 0; i < elements.length; i++) {

            for (int j = i; j < elements.length; j++) {
                int sum = elements[i] + elements[j];

                //checks if the hashtable contains the sum
                if (hashtable.contains(sum)) {
                    sums.add(sum);
                }
            }
        }
        //returns the sums HashSet
        return sums;
    }
}
