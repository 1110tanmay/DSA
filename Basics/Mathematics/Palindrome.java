package Mathematics;

public class Palindrome {
    static boolean Palindrome(int inp){
        int temp=0, x=0;
            int rev = 0;
        while(x!=0){ //num 763
            int store = inp%10; //num now becomes 76 
                rev = rev *10+store;
                temp = temp/10;
        }
        return (temp==inp);
    }
    public static void main(String[] args) {
        
    } 
}
