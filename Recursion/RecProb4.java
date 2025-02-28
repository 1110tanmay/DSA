public class RecProb4 {
    static int fun(int n){
        if(n==0){
            return 0;
        }
        fun(n/2);
        System.out.println(n);
        return n;
    }
    public static void main(String[] args) {
        System.out.println("Yo!"+ fun(7));
    }
}
