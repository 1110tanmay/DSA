import java.util.Arrays;
public class LeftRotateByOne{
    static void lRotate(int [] numArray){
        //traverse through the Array
        int firstElement = numArray[0]; //storing the first element
        int lastElement = numArray.length-1;
        System.out.println(firstElement);
        System.out.println(lastElement);
        for(int i=0;i<numArray.length-1;i++){
            numArray[i]=numArray[i+1]; //shifting the element by one
        }
        numArray[lastElement] = firstElement; // putting first element in the last index
        System.out.println("Rotated Array:" + Arrays.toString(numArray));
    }

    public static void main(String[] args) {
        int [] numArray = {3,16,6,4,10};
        System.out.println("Original Array:" + Arrays.toString(numArray));
        lRotate(numArray);
    }
}