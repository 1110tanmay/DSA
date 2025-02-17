package Mathematics;

public class Factorial {
    static int isFactorial(int inp){
        int result = 1;
        for(int i=2;i<=inp;i++){
            result = result *i;
        }
        return  result;
    }
public static int isFactorialRec(int inp2){
    if(inp2 ==0){
        return 1;
    }
    return inp2 *isFactorial(inp2-1);
}
    public static void main(String[] args) {
        System.out.println("The result without recursion is:" + isFactorial(5));
        System.out.println("The result with recursion is:"+ isFactorialRec(5));

    } 
}
  