public class Recprob2 {
    static void fun(int x){
        if(x==0){
            return;
        }
        fun(x-1);
        System.out.println(x);
        fun(x-1);
    }
    public static void main(String[] args) {
        fun(3);
    }
}
