public class RecProb3 {

    static int func(int n){
        if (n==1){
        return n;
        }
        else{
           return  1+func(n/2);
        }
    }
    public static void main(String[] args) {
        System.out.println("Hello! Recurisve output is:"+func(16));
    }
}
