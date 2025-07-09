/*Left rotate the element by D times. Leetcode 189.  */
import java.util.Arrays;
public class LeftRotateByD {
    static void lRotatebyD(int [] numArray, int k){
        //Defining first and the last elements for the array
        //int lastElement = numArray[numArray.length-1]; //passing the element and not the index
        //number of times we want to update our array
        for(int j=0;j<k;j++){
            int firstElement = numArray[0];
        //traverse
        for(int i=0;i<numArray.length-1;i++){
            numArray[i] =numArray[i+1];
        }
         numArray[numArray.length - 1] = firstElement;
        }
         System.out.println("Rotated Array"+ Arrays.toString(numArray));
    }
    public static void main(String[] args) {
        int [] numArray = {3,16,6,4,10};
        System.out.println("Original Array:" +Arrays.toString(numArray));
        lRotatebyD(numArray, 3);
    }
}
