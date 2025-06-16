//Move all the zeros to the end keeping the order for the rest of elements the same.

import java.util.Arrays;

public class ZerostoEnd {
    static void zeroToEnd(int []zToE){
        int temp = 0;
        for(int i=0;i<zToE.length-1;i++){ //for traversal of i
            for(int j=zToE.length-1;j>i;j--){ //for traversal of j
                 //swapping the values if not zero
                if(zToE[i]==0&&zToE[j]!=0){
                    temp = zToE[i];
                    zToE[i]=zToE[j];
                    zToE[j]=temp;
                }
            }
        }
        System.out.println("Arrays with zeros to end:"+Arrays.toString(zToE));
    }
    public static void main(String[] args) {
        //using regular array
        int [] zToE = {0,13,42,12,0,14,0,19};
        System.out.println("Original Array:" +Arrays.toString(zToE));
        zeroToEnd(zToE);
    }
}
