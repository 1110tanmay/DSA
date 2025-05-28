package Mathematics;

public class Palindrome {
    static boolean isPalindrome(int inp){
        //recursive function
        int temp=inp;
            int rev = 0;
        while(inp!=0){ //num 763
            int store = inp%10; //Remainder is store in store which is 3. 
                rev = rev *10+store;
                inp = inp/10;
        }
        return rev==temp;
    }
    public static void main(String[] args) {
        System.out.println("The result is:" + isPalindrome(32123));
    } 
}
//Not breaking the streak. 