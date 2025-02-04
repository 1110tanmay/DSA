
import java.util.Scanner;

public class Method{
    public static int Addition(int num1, int num2){
        return num1 + num2;
    }

    public static int Subtraction(int num1, int num2){
        return num1 - num2;
    }
    public static int Multiplcation(int num1, int num2){
        return num1 * num2;
        
    }
    public static int Division(int num1, int num2){
        return num1 / num2;
    }
    public static void main(String[] args) { //Main method
        int result = 0;
        Scanner myScanner = new Scanner(System.in); //Creating scanner object created.
        System.out.println("Hi there, welcome to my calculater, select an operation: 1. Addition\n2. Subtraction\n3. Multiplcation\n4. Division");
        int choice = myScanner.nextInt();
        System.out.println("Enter the first number:\n");
        int num1 = myScanner.nextInt();
        System.out.println("Enter the second number:\n");
        int num2 = myScanner.nextInt();

        switch (choice) {
            case 1:
                result = Addition(num1,num2);
                break;
                    case 2:
                    result = Subtraction(num1, num2);
                        break;
                                case 3:
                                result = Multiplcation(num1, num2);
                                    break;
                        case 4:
                        result = Division(num1, num2);
                     break;
                default:
                    System.out.println("Enter a valid number!");
                break;
        }
        System.out.println("The result is: " + result);
        myScanner.close();
    }
}