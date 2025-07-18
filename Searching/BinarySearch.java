import java.util.Arrays;
public class BinarySearch {
    //for unsorted array as well
    static void binSearch(int [] numArray, int num){
        boolean flag = false;
        for(int i=0;i<numArray.length-1;i++){
            if(numArray[i] ==num){
                flag =true;
                System.out.println("Number found at at index: " + i);
            } 
        }
        if(flag!=true){
            System.out.println("Element not found.");
        }
    }
    //For sorted arrays:
    static void binSearchOptimized(int[] numArraySorted, int num){
        //At the starting we want our startIndex and endIndex to be the ends of the array.
        int startIndex = 0;
        int endIndex = numArraySorted.length-1;  
        boolean flag = false;  
            while(startIndex<=endIndex){
                //We want to keep updating our mid-point everytime
                int midPoint = (startIndex+endIndex)/2;
                if(numArraySorted[midPoint] == num){
                    System.out.println("Number found at:" +midPoint);
                    flag =true;
                    break;
                }
                else if(num>numArraySorted[midPoint]){
                    startIndex = midPoint +1;
                }
                else{
                    endIndex = midPoint-1;
                }
        }
        if(flag!=true){
            System.out.println("Number not found.");
            }
    }
    public static void main(String[] args) {
        int [] numArray = {21,23,42,45,1,2,14};
        System.out.println("Original unsorted array: "+Arrays.toString(numArray));
        int [] numArraySorted = {1,23,42,45,47,236,1447};
        binSearch(numArray, 1);
        binSearchOptimized(numArraySorted, 1447);
    }
}
