import java.util.Arrays;
public class BinarySearchRecursive {
    static void recursiveBinSearch(int [] numArray, int num){
        int startIndex =0;
        int endIndex = numArray.length-1;
        int midPoint = (startIndex+endIndex)/2; 
    }
    public static void main(String[] args) {
        int [] numArray = {23,24,25,27,30,48,123};
        System.out.println("Original array:" + Arrays.toString(numArray));
        recursiveBinSearch(numArray, 25);
    }
}
