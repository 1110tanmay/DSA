package Mathematics.Recursion;

public class Practice {
    static void fun(int x){
        if(x==0){
            return;
        }
        System.out.println(x);
        fun(x-1);
        System.out.println(x);
    }
    public static void main(String[] args) {
        fun(3);
    }
    
}
