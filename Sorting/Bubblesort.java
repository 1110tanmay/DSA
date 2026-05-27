import java.util.Arrays;
public class Bubblesort{
    void bubSort(int [] nums){
        int swap = 0;
        for(int i=0;i<=nums.length-1;i++){
            for(int j = i+1; j<=nums.length-1;j++){
                if(nums[i]>nums[j]){
                    swap = nums[i];
                    nums[i] = nums[j];
                    nums[j] = swap;
                }
            }
        }
        System.out.println("Sorted Array:"+Arrays.toString(nums));
    }
    public static void main(String[]args){
        int nums [] = {3,2,1,17,12,14,18,11};
        System.out.println("Usorted array:" + Arrays.toString(nums));
        Bubblesort newObj = new Bubblesort();
        newObj.bubSort(nums);
        //while calling a non-static method in a static method (main method), an instance of the class needs to be created. Very important
    }
}