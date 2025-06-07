//Check for duplicates in the given array, if match found, remove it.
/*Thought process: 
 1. Set current element to the first element. 
 2. Traverse through the Array, compare each element with the current element, if match is found update it. 
 3. Update current element to i+1 with every iteration. 
 */
import java.util.ArrayList;
public class RemoveDuplicates {
static void remDup(ArrayList<Integer>inArray){
   int currentElement = inArray.get(0);//First element always distinct.
    
   System.out.println("Duplicates removed:"+inArray);
}
    public static void main(String[] args) {
    ArrayList<Integer> inArray = new ArrayList<Integer>();
    inArray.add(10);
    inArray.add(20);
    inArray.add(30);
    inArray.add(40);
    inArray.add(20);
    System.out.println("Original Array:"+inArray);
    remDup(inArray);
    }
}
