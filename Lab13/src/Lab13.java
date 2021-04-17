/*Morgan Warren
 * CSC 2720 Lab 13
 * Section 018
 * 4/17/21
 * */

import java.util.*;

public class Lab13 {
    //main method/driver function
    public static void main(String[] args) {
        System.out.println("Shiraj really gives us too many labs");
        String str = "I like queues but queues do not like me";
        ArrayList<String> toIgnore = new ArrayList<String>();
        toIgnore.add("stacks");
        System.out.println(getMostCommonWord(str, toIgnore)); // should return "like"
    }


    public static String getMostCommonWord(String str, List<String> toIgnore) {

        //creates string array
        String[] array = str.split(" ");
        //creates hashmap
        HashMap<String, Integer> map = new HashMap<>();

        //creates boolean variable flag
        boolean flag = false;

        //for loop that iterates thru String[] array
        for (String i : array) {
            // iterates thru toIgnore
            for (String k : toIgnore) {
                if (i.equals(k)) {
                    flag = true;
                    break;
                }

            }

            //checks of the boolean value of flag
            if (flag == true) {
                continue;
            }

            //creates integer variable
            Integer j = map.get(i);
            map.put(i, (j == null) ? 1 : j + 1);

        }

        //creates empty string for the answer
        String answer = "";

        //stores how often the most occurring word appears
        int max = 0;

        for (Map.Entry element : map.entrySet()) {
            //grabs the string value of the key in element and stores it in key.
            String key = (String) element.getKey();
            //grabs the string value of the value in element and stores it in value.
            int value = (int) element.getValue();

            //checks if value is greater than the max
            if (value > max) {
                max = value;
                answer = key;
            }
        }

        //returns final answer
        return answer;


    }

}