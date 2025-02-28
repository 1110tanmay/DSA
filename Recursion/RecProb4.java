import java.util.Scanner;

public class RecProb4 {
    static int fun(int n){
        if(n==0){
            return 0;
        }
        fun(n/2);
        System.out.println(n%2);
        return n;
    }
    public static void main(String[] args) {
        int cont;
        do { 
        Scanner scanner = new Scanner(System.in); //initialised a scanner object. 
        System.out.println("Yo! Welcome to Decimal to Binary converter code. Put in the number that you wish to convert to Binary.");
            int useChoice = scanner.nextInt();
            fun(useChoice);
            System.out.println("Do you want to continue or exit? Press 1 to continue and 0 to exit.");
            cont = scanner.nextInt();
        } while (cont ==1);
    }
}