import java.util.Arrays;

public class InsertionSort {
    void intSort(int nums[]){
        //Iterating through the array.
        for(int i=1;i<nums.length;i++){
            //assuming the first element is the lowest: 
            int key = nums[i];
            //j is the sorted array
            int j = i-1;
            //To move the number forward
            while(j>=0&&nums[j]>key){
                nums[j+1] = nums[j];
                j--;
            }
            nums[j+1] = key;
        }
        System.out.println("Sorted Array:" + Arrays.toString(nums));
    }
    public static void main(String[] args) {
        int nums [] = {3,2,1,17,12,14,18,11};
        System.out.println("Usorted array:" + Arrays.toString(nums));
        InsertionSort newObj = new InsertionSort(); //creating an instance of a the class since you cannot pass a non-static method in a static method
        newObj.intSort(nums);
    }
}
