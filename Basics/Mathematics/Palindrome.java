package Mathematics;

public class Palindrome {
    static boolean isPalindrome(int inp){
        int temp=inp;
            int rev = 0;
        while(inp!=0){ //num 763
            int store = inp%10; //num now becomes 76 
                rev = rev *10+store;
                inp = inp/10;
        }
        return rev==temp;
    }
    public static void main(String[] args) {
        System.out.println("The result is:" + isPalindrome(763));
    } 
}
