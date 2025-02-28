public class RecNnumber {
    static int ntoOne(int x){
        if(x==0){
            return 0;
        }else{
             ntoOne(x-1);
            System.out.println(x);
            return x;
        }
    }
    public static void main(String[] args) {
        System.out.println();
    }
}
