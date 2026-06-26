
class Node{
//type of data
int data;
//storing this class as an object Similar to int x. 
Node nextNode;

//Contructor of this class
    public Node(int x) {
        data = x;
    }

}

//main class
public class BasicImplementation{
    public static void main(String[] args) {
        //storing values in the nodes
        Node firstNode = new Node(10);
        Node secondNode = new Node(20);
        Node thirdNode = new Node(30);
        Node fourthNode = new Node(45);
        firstNode.nextNode =  secondNode;
        secondNode.nextNode = thirdNode;
        thirdNode.nextNode = fourthNode;
        //Setting the starting point as the current Node.
        Node currentNode = firstNode;
        while(currentNode!=null){
            System.out.print(currentNode.data + " -> ");
            //Shifting to the next node
            currentNode = currentNode.nextNode;
        }
        System.out.println("null");
    }
}