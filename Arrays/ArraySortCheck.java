import java.util.ArrayList;
public class ArraySortCheck {
    static void checkSortedArray(ArrayList<Integer>sortCheckArray){
        boolean flag = true;
        while (flag==true) {
        for(int i=0;i<sortCheckArray.size()-1;i++){
            if(sortCheckArray.get(i+1)<sortCheckArray.get(i)){
                flag = false;
            }
        }
        System.out.println("The Array is not sorted.");
    }
    }
    public static void main(String[] args) {
        ArrayList<Integer> sortCheckArray = new ArrayList<>();
        sortCheckArray.add(10);
        sortCheckArray.add(11);
        sortCheckArray.add(12);
        sortCheckArray.add(13);
        sortCheckArray.add(14);
        sortCheckArray.add(15);
        sortCheckArray.add(16);
        System.out.println("Original Array:"+sortCheckArray);
        checkSortedArray(sortCheckArray);
    }
}
