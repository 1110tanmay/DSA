import java.util.Scanner;
public class halfpyramidpattern{

static void patternMethod(int k){
    int choice;
  for (int i = 0;i<=k;i++){
            for (int j=1;j<=i;j++){
            System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
       Scanner myObj = new Scanner(System.in);
       System.out.println("Hello! Enter the number of lines you want to print:");
       int userinput = myObj.nextInt();
       patternMethod(userinput);
    }
}