

public class RecNumberN {
    int accumulator =0; 
     void numberToN(int x){ 
        if(accumulator==x){
            return; //Base case, stops recursion. 
        }
        accumulator=x;
        int result = accumulator-x+1;
        System.out.println(result);//should give one.
        numberToN(result+1);
    }
    public static void main(String[] args) {
       RecNumberN recNumInst = new RecNumberN(); //Created an instance of the class, since the method defined above is non-static.
       recNumInst.numberToN(10);
    }
}