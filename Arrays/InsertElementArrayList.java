import java.util.ArrayList;
import java.util.Arrays;
public class InsertElementArrayList {
    int inElement, index;
    //Dynamic array
    static void insertElementDA(ArrayList<Integer>inArrayList ,int inElement, int index){
        for(int i=index;i<inArrayList.size()-1;i++){ //Start from given index, to the end, -1 to avoid overflowing
            inArrayList.set(i, inArrayList.get(i+1)); //Moving the element ahead.
        } //All elements from the position have been moved forward now the index given is vacant.
        //Will add the element at the given index now
            inArrayList.set(index, inElement);
            System.out.println("Dynamic Array implementation:"+inArrayList);
    }
        //Static Array logic
    static void insertElementSA(Integer[]inArrayListStatic, int inElement, int index){
        //Checking whether the array is full or not
        for (int i =index;i<inArrayListStatic.length-1;i++){
            inArrayListStatic[i]=inArrayListStatic[i+1];
        }
        inArrayListStatic[index] = inElement;
        System.out.println("Static Array Implementation:"+Arrays.toString(inArrayListStatic));//Need to convert to string.
    }

    public static void main(String[] args) {
        //Part 1 - Defining Dynamic Array:
        ArrayList<Integer> intArrayList = new ArrayList<>(); //Valid syntax for ArrayList post, Java 7.
        intArrayList.add(10);
        intArrayList.add(15);
        intArrayList.add(20);
        intArrayList.add(25);
        intArrayList.add(30);
        intArrayList.add(35);
        
        //Part 2 - Defining Static Array:
            Integer [] inArrayListStatic = new Integer[7];
            inArrayListStatic[0] = 10;
            inArrayListStatic[1] = 20;
            inArrayListStatic[2] = 17;
            inArrayListStatic[3] = 25;
            inArrayListStatic[4] = 35;
            inArrayListStatic[5] = 45;
        System.out.println("Original Dynamic Array:"+intArrayList);
        insertElementDA(intArrayList ,17,1);
        insertElementSA(inArrayListStatic, 100, 2);
    }   
}