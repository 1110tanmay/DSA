import java.util.ArrayList;
public class ReverseArray {
    static void revArray(ArrayList<Integer>intArraylist, int size){
        int temp = 0; //To Swap
        int lowest = 0; //0 Index, first element
        int Highest = intArraylist.size()-1; //Last element
        for (int i=0;i<size/2;i++){
            if(intArraylist.get(lowest)!=intArraylist.get(Highest)){ //Until Low meets high. 
                //Swap Logic
                lowest=temp;
                Highest=lowest;
                temp=Highest;
            }
        }
            System.out.println("Reversed Array:"+intArraylist);
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

    revArray(intArrayList, 5);
    }
}
