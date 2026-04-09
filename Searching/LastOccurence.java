import java.util.Arrays;
public class LastOccurence {
    static int occCheck(int [] numArray, int num, int startIndex, int endIndex){
        int midPoint = (startIndex + endIndex)/2;
        boolean flag = false;
        int currentIndex=0;
        while(flag==false){
            if(num==numArray[midPoint]){
                currentIndex = numArray[midPoint];
            }else if (num<numArray[midPoint]) {
                 
            }
        }
        return -1;
    }
        public static void main(String[] args) {
            int [] numArray = {23,24,25,27,30,48,123};
            int startIndex = 0;
            int endIndex = numArray.length-1;
            System.out.println("Original array:" + Arrays.toString(numArray));
        }
    }
