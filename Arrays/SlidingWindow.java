import java.util.Arrays;
public class SlidingWindow {
    static void slidingWindow(int [] numArray, int k){
        int currentSum= 0;
        int maxSum = 0;
        //int currentIndex = numArray[0];
        //traversing through the array
        for(int i = 0;i<numArray.length-k;i++){ // - k is needed here because otherwise array goes out of bound.
            currentSum =0; //Needed to be set to 0 because currentSum should exist for that window only.
            for(int j=i;j<i+k;j++){
                currentSum = currentSum + numArray[j];
                maxSum = Math.max(maxSum, currentSum);
            }
        }
        System.out.println("Sliding window:" + maxSum);
    }
    public static void main(String[] args) {
        int [] numArray = {3,2,21,10,15,6};
        System.out.println("Original array:" + Arrays.toString(numArray));
        slidingWindow(numArray, 2);
    }
}
