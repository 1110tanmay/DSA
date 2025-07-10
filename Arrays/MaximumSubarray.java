/*Give the subarray that has the maximum sum, input could be negative numbers as well.
Leetcode 53 - Medium */
import java.util.Arrays;
public class MaximumSubarray {
    static void maxSubArray(int [] numArray){
        int maxSum = 0;
        int currentMax = 0;
        for(int i=0;i<numArray.length-1;i++){
            currentMax =0;
            for(int j=i;j<numArray.length-1;j++){
                //currentMax = numArray[i]+numArray[j];
                currentMax = currentMax +numArray[j];
                maxSum = Math.max(maxSum, currentMax);
            }
        }
        System.out.println("Maximum sub array:"+maxSum);
    }
    public static void main(String[] args) {
        int [] numArray = {1,3,52,12,1,23,-12,0};
        System.out.println("Original array:"+ Arrays.toString(numArray));
        maxSubArray(numArray);
    }
}
