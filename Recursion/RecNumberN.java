public class RecNumberN {
    static void numberToN(int x){
        int accumulator =0;
        if(accumulator==x){
            return; //Base case, stops recursion. 
        }
        accumulator=x;
        int result = accumulator-x+1;
        System.out.println(result);//should give one.
        numberToN(x);
    }
    public static void main(String[] args) {
    numberToN(5);
    }
}