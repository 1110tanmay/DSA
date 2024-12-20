import java.util.Scanner;
public class userinputarray{
    public static void main(String[]args){
        Scanner myobj = new Scanner(System.in);
        System.out.println("Enter your name!");
        String userName = myobj.nextLine();
        System.out.println("Hello!" + userName);
    }
}