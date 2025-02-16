package Mathematics;
import java.util.Scanner;
public class Countdigits {
     static int countingDigits(int inp){
       int result = 0; 
       while(inp>0){
        inp=inp/10;
        result++;
       }
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the number: ");
                int input = scanner.nextInt();
                System.out.println("The result is:" + countingDigits(input));
    }
}