/*
 * Morgan Warren
 * 4/27/21
 * CSC 2720 Section 018
 * Final Exam Question 2
 * */

public class HashSet {
    //creates hashset array of type boolean.
    boolean[] hashsetArray;

    HashSet(){
        //sets the size of the boolean to 500 (random number used so the array is big enough for elements to be added)
        hashsetArray = new boolean [500];
    }

    public static void main (String [] args){
        //HashSet object
        HashSet hashSet = new HashSet();

        //adds 4 elements to the HashSet
        hashSet.addElement(5);
        hashSet.addElement(10);
        hashSet.addElement(15);
        hashSet.addElement(20);

        //creates contains integer variable to check whether or not an element is in the hashSet.
        int contains = hashSet.containsElement(35);
        if (contains == 0){ // if returned int from containsElement is -1, then it's not in the hashSet
            System.out.println("Element not in hashset");
        }
        else { // if not, it's in the hashSet
            System.out.println("The element " +contains + " is in this hashset");
        }
        //creates contains integer variable to check whether or not an element is in the hashSet and can be removed.
        int remove = hashSet.removeElement(15);
        if (remove == 0){ // if returned int = 0, element does not exist
            System.out.println("Element does not exist");
        }
        else { // if not, it is in the hashset and it's removed
            System.out.println("Element removed");
        }
    }

    public int containsElement(int element){
        //checks if element is in array, returns the element if it is.
        if (hashsetArray[element]){
            return element;
        }
        else { // returns 0 if element is not in the hashset.
            return 0;
        }
    }

    public void addElement (int element) { //adds element to the hashset by making the element true.
        hashsetArray[element] = true;
    }

    public int removeElement (int element){
        if (hashsetArray[element]){ //checks if element is true/ present in the array
            hashsetArray[element]=false; //removes it by making the element false.
            return 1;
        }
        else { // if not in array, it returns 0
            return 0;
        }
    }
}

