public class stockSpanProblem {
    //function to calculate the stock span for each day, we will use a stack to store the indices of the days.  
    void stockSpan(int numArray[]){
        for(int i=0;i<numArray.length;i++){
            int span = 1;
            for(int j=i-1;j>= 0; j--){
                if(numArray[j]<numArray[i]){
                    span++;
                }
                else{
                    break;
                }
            }
            System.out.println("Stock span for day " + (i+1) + " is: " + span);
        }
    }
    public static void main(String[] args) {
        //Defining an array of integers to store the stock prices for 10 days.
        int numArray [] ={100,20,105,73,72,80,99,112,36,4};
        stockSpanProblem stockSpanObj = new stockSpanProblem();
        stockSpanObj.stockSpan(numArray);
    }
}
