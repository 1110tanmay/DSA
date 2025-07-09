/*You're given an Array of prices of a stock. We are to make the maximum profit by buying on lower prices
and selling on higher prices.*/ 
/*Example: I/P arr[] = {1,5,3,8,12}, 13 is the maximum profit.*/
//Leetcode 171 Also has a recursive solution, think.
import java.util.Arrays;
public class StockBuyAndSell {
    static void stockProb(int [] numArray){
        int maxProfit = 0;
        for (int i=1;i<numArray.length-1;i++){
            if(numArray[i]>numArray[i-1]){
                maxProfit =maxProfit + (numArray[i]-numArray[i-1]);
            }
        }
        System.out.println("Total profit:" + maxProfit);
}
    public static void main(String[] args) {
        int [] numArray = {3,2,56,21,40,12};
        System.out.println("Original array:" + Arrays.toString(numArray));
        stockProb(numArray);
    }
}
