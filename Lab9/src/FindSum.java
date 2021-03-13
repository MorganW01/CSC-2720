import java.util.HashSet;

public class FindSum {

    public static void main(String[] args) {
        int[] array = {1, 5, 4, 6, 7, 9};
        HashSet<Integer> res = findSums(array);
        System.out.println(res.toString()); // Should return [6,5,7,9]
    }

    public static HashSet<Integer> findSums(int[] elements) {
        HashSet<Integer> sums = new HashSet<Integer>();
        HashSet<Integer> hashtable = new HashSet<Integer>();

        for (int k =0; k <elements.length;k++){
            hashtable.add(elements[k]);

        }

        for (int i = 0; i < elements.length; i++) {

            for (int j = i; j < elements.length; j++) {
                int sum = elements[i] + elements[j];

                if (hashtable.contains(sum)) {

                    sums.add(sum);
                }

            }


        }


        return sums;
    }
}
