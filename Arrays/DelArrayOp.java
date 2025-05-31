//Delete an element from the Array
import java.util.ArrayList;
import java.util.Arrays;


public class DelArrayOp{
    //Dyanmic Array
    static void dyArrayDel(ArrayList<Integer>dArrayList,int element){
        
    }
    //Static Array
    static void stArrayDel(){

    }
    public static void main(String[] args) {
        //Dynamic Array: 
        ArrayList<Integer>dArrayList = new ArrayList<Integer>();
            dArrayList.add(10);
            dArrayList.add(20);
            dArrayList.add(30);
            dArrayList.add(50);
            dArrayList.add(60);
            dArrayList.add(75);
            System.out.println("Original Dynamic Array:"+dArrayList);
        //Static Array: 
        Integer [] sArray = new Integer[10];
        sArray[0]=10;
        sArray[0]=20;
        sArray[0]=30;
        sArray[0]=40;
        sArray[0]=50;
        sArray[0]=60;
        sArray[0]=70;
        sArray[0]=85;
        System.err.println("Original Static Array:"+Arrays.toString(sArray));
        System.out.println("Array Delete element operation.");
        dyArrayDel(dArrayList, 30);
        stArrayDel();
    }
}