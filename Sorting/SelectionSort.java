import java.util.Arrays;

public class SelectionSort {
    static void selSort(int[] nums) {
        // initializing temporary array:
        int swap = 0;
        int minIndex = 0;
        // outer loop to compare an element with the rest of the unsorted array
        for (int i = 0; i < nums.length - 1; i++) {
            // We first assume that the first element i is the lowest and hence:
            minIndex = i;
            // for each i(minIndex) we compare it with the rest of the unsorted array.
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[minIndex] > nums[j]) {
                    minIndex = j; // Crucial: we get store the index of the minimum element so we can swap it
                                  // outside.
                }
            }
            // the main swapping part.
            swap = nums[i];
            nums[i] = nums[minIndex];
            nums[minIndex] = swap;
        }
        System.out.println("Sorted Array:" + Arrays.toString(nums));
    }

    public static void main(String[] args) {
        int nums[] = { 3, 2, 1, 17, 12, 14, 18, 11 };
        System.out.println("Usorted array:" + Arrays.toString(nums));
        SelectionSort newObj = new SelectionSort(); // creating an instance of a the class since you cannot pass a
                                                    // non-static method in a static method
        newObj.selSort(nums);
    }
}
// testing commmit history.