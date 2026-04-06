import java.util.Arrays;
public class BinarySearchRecursive {
    
    static int recursiveBinSearch(int [] numArray, int num, int startIndex, int endIndex){

        //base case
        if(startIndex>endIndex){
            return 0;
        }
        
        int midPoint = (startIndex+endIndex)/2; 

        if(numArray[midPoint] == num){ //Return midpoint
            return numArray[midPoint];
        }
        else if(num<numArray[midPoint]){
            return recursiveBinSearch(numArray, num, startIndex, midPoint-1);
        }
        else if(num>numArray[midPoint]){
            return recursiveBinSearch(numArray, num, midPoint+1, endIndex);
        }
        return -1;
    }
   
    public static void main(String[] args) {
        int [] numArray = {23,24,25,27,30,48,123};
        int startIndex = 0;
        int endIndex = numArray.length-1;
        System.out.println("Original array:" + Arrays.toString(numArray));
        int result = recursiveBinSearch(numArray, 25, 0, endIndex);
        if(result==-1){
            System.out.println("Number not found.");
        }else{
            System.out.println("Number found:" +result);
        }
    }
}
