
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class QueueImplement {
    public static void main(String[] args) {
        //Defining a queue using a LinkedList. 
        Queue<String> queue = new LinkedList<>();
        //Adding elements to the queue. 
        queue.add("Apple");
        queue.add("Meta");
        queue.add("Tesla");

            //Using the iterator interface to iterate through the queue
            Iterator check =  queue.iterator(); 
        while (check.hasNext()) { 
            System.out.println("The queue has:" + check.next());
        }
    }
}
