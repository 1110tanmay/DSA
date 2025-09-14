
import java.util.Stack;

public class stackTest {

    static void stackPeekTest (Stack<String> testingStack){
        System.out.println("Peek operation: " + testingStack.peek());
    }

    static void stackPopTest(Stack<String> testingStack){
        System.out.println("Popped string: " + testingStack.peek());
    }
    public static void main(String[] args) {
        System.out.print("Testing Stack");
        Stack <String> testingStack = new Stack<String>();
        testingStack.push("Tanmay");
        testingStack.push("Shrikant");
        testingStack.push("Swati");
        testingStack.push("Shelar");
        System.out.println("Entire stack: " + testingStack);
        stackPeekTest(testingStack);
        stackPopTest(testingStack);
        System.out.println("Entire stack after pop: " + testingStack);
    }
}
