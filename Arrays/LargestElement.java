//Find the largest number in a given aray
import java.util.ArrayList;
public class LargestElement{
    static void larArrayCheck(ArrayList<Integer>larArray){
        int largestElement=0;
        int currentLargest = larArray.get(0); //initializing current largest to the first element.
        for(int i=0;i<larArray.size()-1;i++){
            if(larArray.get(i+1)>larArray.get(i)){
                currentLargest = larArray.get(i+1);
            }
            if(currentLargest>largestElement){
                currentLargest=largestElement;
            }
        }
        System.err.println("Largest element:"+largestElement);
    }
public static void main(String[] args) {
    ArrayList<Integer> larArray = new ArrayList<Integer>();
    larArray.add(21);
    larArray.add(32);
    larArray.add(58);
    larArray.add(42);
    larArray.add(11);
    System.out.println("Original Array:" + larArray);
    larArrayCheck(larArray);
}
}