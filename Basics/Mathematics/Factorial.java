package Mathematics;

public class Factorial {
    static int isFactorial(int inp){
        int result = 1;
        for(int i=2;i<=inp;i++){
            result = result *i;
        }
        return  result;
    }
    public static void main(String[] args) {
        System.out.println("The result is:" + isFactorial(5));
    } 
}
