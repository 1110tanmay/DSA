//Check for duplicates in the given array, if match found, remove it.
import java.util.ArrayList;
public class RemoveDuplicates {
static void remDup(ArrayList<Integer>inArray){
  for(int i=0;i<inArray.size()-1;i++){ //for traversing through each element
    for(int j=i+1;j<inArray.size();j++){ //Comparing all the elements
        if(inArray.get(i)==inArray.get(j)){
            inArray.remove(j);
            j--;
        }
    }
  }
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
