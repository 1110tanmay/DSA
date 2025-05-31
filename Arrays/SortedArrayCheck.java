import java.util.ArrayList;
public class SortedArrayCheck {

    static boolean checkArray(ArrayList<Integer>inArrayList){
        for(int i=0;i<inArrayList.size()-1;i++){
            if(inArrayList.get(i)>inArrayList.get(i+1)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        ArrayList<Integer> intArrayList = new ArrayList<>(); //Valid syntax for ArrayList post, Java 7.
    //Dynamic Array with 6 elements
    intArrayList.add(10);
    intArrayList.add(15);
    intArrayList.add(20);
    intArrayList.add(25);
    intArrayList.add(35);
    intArrayList.add(40);
    System.out.println("Entire Array:"+intArrayList);
    System.err.println("Is this error sorted?" +checkArray(intArrayList));
    }
}
