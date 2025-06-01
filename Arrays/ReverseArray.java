import java.util.ArrayList;
public class ReverseArray{

static void revArray(ArrayList<Integer>inArray){
int low = 0;
int high = inArray.size()-1;
//Defining
while(low<high){
    //swap the values: 
   int temp = inArray.get(low);
    inArray.set(low, inArray.get(high));
    inArray.set(high, temp);
    //incrementing low and decrementing high
    low++;
    high--;
}
System.err.println("Reversed Array:"+ inArray);
}

public static void main(String[]args){
ArrayList<Integer> inArray = new ArrayList<Integer>();
inArray.add(10);
inArray.add(20);
inArray.add(30);
inArray.add(40);
    System.out.println("Original Array:"+inArray);
    revArray(inArray);
}
}
