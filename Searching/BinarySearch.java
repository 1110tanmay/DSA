import java.util.Arrays;
public class BinarySearch {
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
    public static void main(String[] args) {
        int [] numArray = {21,23,42,45,1,2,14};
        System.out.println("Original Array: "+Arrays.toString(numArray));
        binSearch(numArray, 21);
        binSearch(numArray, 12);
    }
}
