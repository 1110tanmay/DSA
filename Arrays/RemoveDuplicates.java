import java.util.ArrayList;

public class RemoveDuplicates {
static void remDup(ArrayList<Integer>inArray){
   int currentElement = inArray.get(0);//First element always distinct.
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
