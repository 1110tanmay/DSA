
import java.util.HashSet;

public class CountDistinctElement {
     public static void main(String[] args) {
        HashSet<Integer> countDist = new HashSet<>();
        int nums []= {12,14,12,13,14,16,14,17,16};
        for(int i=0;i<nums.length;i++){
            countDist.add(nums[i]); 
        }
        System.out.println("Total distinct elements:"+ countDist.size());
    }
}
