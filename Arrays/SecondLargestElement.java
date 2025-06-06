import java.util.ArrayList;
public class SecondLargestElement {
    static void secondLarEle(ArrayList<Integer>slarArrayList){
        int largestElement = 0; 
        int secondLargestElement = 0;
        int currentLargest = slarArrayList.get(0);
        for (int i=0;i<slarArrayList.size()-1;i++){
            //To check if current index is higher than before
            if(slarArrayList.get(i+1)>slarArrayList.get(i)){
                currentLargest = slarArrayList.get(i+1);
            }
            //To check if the current largest is larger than largest until now. 
            if(currentLargest>largestElement){
                largestElement=currentLargest;
            }
            for(int j=0;j<slarArrayList.size()-1;j++){
                if(slarArrayList.get(j+1)>slarArrayList.get(j)&&slarArrayList.get(j+1)!=largestElement){
                    secondLargestElement = slarArrayList.get(j+1);
                }
            }
        }
        System.out.println("Largest element = "+largestElement+"\nSecond Largest element = "+secondLargestElement);
    }
    public static void main(String[] args) {
        ArrayList<Integer>slarArrayList = new ArrayList<>();
        slarArrayList.add(10);
        slarArrayList.add(15);
        slarArrayList.add(20);
        slarArrayList.add(31);
        slarArrayList.add(17);
        slarArrayList.add(32);
        System.out.println("Orinigal Array:");
        secondLarEle(slarArrayList);
    }
}
