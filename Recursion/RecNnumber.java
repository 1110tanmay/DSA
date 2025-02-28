public class RecNnumber {
    static void ntoOne(int x){
        if(x==0){
            return;
        }
            System.out.println(x);
            ntoOne(x-1);
        }
    public static void main(String[] args) {
        ntoOne(5);
    }
}
