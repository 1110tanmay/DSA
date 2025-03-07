
import java.util.ArrayList;

public class DelArrayOp {

    static ArrayList<Integer> dyArray(int number){
        //Creating Dynamic array using array list
        ArrayList<Integer> dArrayList = new ArrayList<Integer>();
        dArrayList.add(12);
        dArrayList.add(11);
        dArrayList.add(21);
        dArrayList.add(23);

        // int index = position-1; //Since index is always 1 less than the position.
        //     for (int i = index ;i<=dArrayList.size();i++){
        //             dArrayList.get(index+1) = dArrayList.get(index); 
        //     }
        // return 1;
        System.err.println("Array before inserting the element."+dArrayList);
        dArrayList.add(number);
        return dArrayList;
    }
    
    public static void main(String[] args) {
        System.out.println("Inserting stuff in an array!");
        System.out.println("After adding element:" + dyArray(11));
    }
}
