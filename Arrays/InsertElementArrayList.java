import java.util.ArrayList;
public class InsertElementArrayList {
    //Dynamic array
    static void insertElement(ArrayList<Integer>inArrayList ,int inElement, int index){
        for(int i=index;i<inArrayList.size()-1;i++){ //Start from given index, to the end, -1 to avoid overflowing
            inArrayList.set(i, inArrayList.get(i+1)); //Moving the element ahead.
        } //All elements from the position have been moved forward now the index given is vacant.
        //Will add the element at the given index now
            inArrayList.set(index, inElement);
            System.out.println("Dynamic Array implementation:"+inArrayList);
    }
    public static void main(String[] args) {
        ArrayList<Integer> intArrayList = new ArrayList<>(); //Valid syntax for ArrayList post, Java 7.
        //Dynamic Array with 6 elements
        intArrayList.add(10);
        intArrayList.add(15);
        intArrayList.add(20);
        intArrayList.add(25);
        intArrayList.add(30);
        intArrayList.add(35);
        System.out.println("Original Array:"+intArrayList);
        insertElement(intArrayList ,17,1);
    }   
}