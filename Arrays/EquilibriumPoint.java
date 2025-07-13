
import java.util.Arrays;
public class EquilibriumPoint {
    static void equilibriumPoint(int [] numArray){
        boolean flag = false;
        for(int i=0;i<numArray.length;i++){
            //making sure we have the left and the right sum set to 0 for everything. 
            int leftSum = 0;
            int rightSum = 0;
            int equi =0;
            //To calculate the left side
            for(int j=i-1;j>=0;j--){
                leftSum = leftSum + numArray[j];
            }
            //to calculate the right side
            for(int k=i+1;k<=numArray.length-1;k++){
                rightSum = rightSum + numArray [k];
            }//compare the right and the left
            if(leftSum==rightSum){
                flag=true;
               System.out.println("Equilibirum number found: " + numArray[i]);
            }
        }
        if(flag==false){
            System.out.println("Equilibrium number not found.");
        }

    }
    public static void main(String[] args) {
        int [] numArray = {1,16,6,1,16,17};
        System.out.println("Original Array:" +Arrays.toString(numArray));
        equilibriumPoint(numArray);
    }
}
