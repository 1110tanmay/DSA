

public class RecNumberN {
//TBelow function was not needed, and was a wrong thought. 
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

    //this is how to write a function in cases like these: 
     void correctFunc(int y){
        if(y==0){
            return;
        }
        correctFunc(y-1); //The function calls recursively here, draw a recursion tree to understand.
        System.out.println(y);
    }

    public static void main(String[] args) {
       RecNumberN recNumInst = new RecNumberN(); //Created an instance of the class, since the method defined above is non-static.
       recNumInst.numberToN(10);
       recNumInst.correctFunc(5); //another instance of the class.
    }
}