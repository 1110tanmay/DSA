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
        int choice;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter the number: ");
                int input = scanner.nextInt();
                System.out.println("The result is:" + countingDigits(input));
                System.out.println("Do you want to continue, press 1 for yes, 0 for no. ");
                 choice = scanner.nextInt();
            } while (choice ==1);
            scanner.close();
    }
}