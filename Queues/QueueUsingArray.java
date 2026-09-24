
//Queue class
class Queue{
    //Capacity is the final capacity of the queue
    int capacity;
    //The current size of the queue.
    int size;
    int arr[];
Queue(int c){
    //defining the capacity of the queue:
    capacity = c;
    //Creating array of the capacity of the queue:
    arr = new int[capacity];
    size = 0;
}
    int enque(int x){
        if(checkFull()){
            return 0;
        }
        //FIFO architecture
        arr[size] =x;
        size ++;
        return x;
    }
    int deque(){
        if(checkEmpty()){
            return -1;
        }
        int removed = arr[0];
        for(int i=0;i<size-1;i++){
            //Next element is current element
            arr[i] = arr[i+1];
        }
        //reducing the size:
        size--;
        return removed;
    }
    int checkSize(){
        return size;
    }
    int checkFront(){
        if (checkEmpty()) {
            return 0;
        }
        return arr[0];
    }
    int checkRear(){
        if(checkEmpty()){
            return 0;
        }
        return arr[size-1];
    }
    boolean checkFull(){
       return  (size == capacity);
        
    }
    boolean checkEmpty(){
        return size == 0;
    }
    void printQueue(){
        System.out.print("[");
        for(int i=0;i<size;i++){
            System.out.print(arr[i] +",");
        }
        System.out.println("] size = " +size);
    }
}
public class QueueUsingArray {
    public static void main(String[] args) {
        //Define a queue
        Queue q = new Queue(5);
        q.enque(17);
        q.enque(12);
        q.checkEmpty();
        q.printQueue();
        q.deque();
        q.printQueue();
    }
}
