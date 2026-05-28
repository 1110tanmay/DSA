
import java.util.Arrays;
public class MergeSort {
    //Naive solution: 1. Create an array of the size of two arrays. 2. Copy the elements into that array. 3. Sort it.
    void addElements(int nums[], int nums2[], int mergedArr[]){
        //Copying the elements of the first array.
        for (int i =0;i<nums.length;i++){
            mergedArr[i] = nums[i];
        }
        //Copying the elements of the second array.
        for (int j=0; j<=nums2.length-1;j++){
            mergedArr[nums.length+j] = nums2[j];
        }
        System.out.println("Combined array:" + Arrays.toString(mergedArr));
    }
    //sorting function
    void sort (int mergedArr[]){
        int temp = 0;
        for (int j = 0;j<mergedArr.length;j++){
        for (int i = 0;i<mergedArr.length-1-j;i++){
            if(mergedArr[i]>mergedArr[i+1]){
                temp = mergedArr[i];
                mergedArr[i] = mergedArr [i+1];
                mergedArr[i+1] =temp;
            }
        }
    }
        System.out.println("Sorted array:" + Arrays.toString(mergedArr));
    }
    //Naive solution ends.

    //Liner solution: 
    void linSolu(int nums[], int nums2[]){
    //We traverse both arrays simultaneously. 
    //Whichever array has smaller element, index of that array is incremented because that elements is correct placed.(both arrays need to be sorted)
    int i=0;
    int j =0;
        //Whichever is smaller outta the first elements in the two arrays, it is printed. 
        while(i<nums.length && j<nums2.length) {
        if(nums[i]<=nums2[j]){
            System.out.println(nums[i]);
            i++;
        }else{
            System.out.println(nums[j]);
            j++;
        }}
        //printing the remaining elements from either of the arrays, one will always run.
        while(i<nums.length){
            System.out.println(nums[i]);
            i++;
        }
        while(j<nums2.length){
            System.out.println(nums2[j]);
            j++;
        }
    }
    public static void main(String[] args) {
        int nums [] = {1,2,4,6,7};
        int nums2 [] = {51,62,73,85,94,94};
        //Creating an array of size of both arrays.
        int mergedArr [] = new int[nums.length+nums2.length]; 
        System.out.println("Original unsorted arrays:"+Arrays.toString(mergedArr));
        MergeSort nonStatInst = new MergeSort();
        nonStatInst.addElements(nums, nums2, mergedArr);
        nonStatInst.sort(mergedArr);
        nonStatInst.linSolu(nums, nums2);
    }
}
