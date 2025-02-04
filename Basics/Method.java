
import java.util.Scanner;

public class Method{

    public double Addition(double num1, double num2){
        return num1 + num2;
    }

    public double Subtraction(double num1, double num2){
        return num1 - num2;
    }
    public double Multiplcation(double num1, double num2){
        return num1 * num2;
        
    }
    public double Division(double num1, double num2){
        return num1 / num2;
    }
    public static void main(String[] args) { //Main method
        Scanner myScanner = new Scanner(System.in); //Creating scanner object created.
        System.out.println("Hi there, welcome to my calculater, select an operation: 1. Addition\n2. Subtraction\n3. Multiplcation\n4. Division");
        int choice = myScanner.nextInt();
        System.out.println("Enter the first number:\n");
        int num1 = myScanner.nextInt();
        System.out.println("Enter the second number:\n");
        int num2 = myScanner.nextInt();

        switch (choice) {
            case 1:
                Division(int num1,num2);
                break;
                    case 2:
                
                        break;
                                case 3:
                
                                    break;
                        case 4:
                
                     break;
                default:
                    System.out.println("Enter a valid number!");
                break;
        }
    }
}