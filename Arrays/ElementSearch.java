//Search for an element in the array, if found, return the element with its index.
import java.util.ArrayList;
public class ElementSearch {
    //Granting access of the Array to our function.
    static void checkArray(ArrayList<Integer> intArrayList, int checkNum){
        int index;//To store index of the variable
        boolean found = false; 
        for (int i = 0;i<intArrayList.size();i++){ //To iterate through the Array
            if(intArrayList.get(i)==checkNum){
                System.out.println("The number is present at index:" +intArrayList.get(i));
                found =true;
            }
        }
        if(found!=true)
        {
            System.out.print("The element is not present.");
        }
    }
    public static void main(String[] args) {
    ArrayList<Integer> intArrayList = new ArrayList<>(); //Valid syntax for ArrayList post, Java 7.
    //Dynamic Array with 6 elements
    intArrayList.add(10);
    intArrayList.add(15);
    intArrayList.add(20);
    intArrayList.add(25);
    intArrayList.add(30);
    intArrayList.add(35);
    System.out.println("Entire Array:"+intArrayList);
    checkArray(intArrayList, 17);
    }
}
