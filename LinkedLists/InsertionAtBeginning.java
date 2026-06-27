//Node class is needed so we could use it as an object
class Node{
    //Define the type of data LinkedList would have
    int data;
    //Define the reference of the nodes:
    Node nextNode;
    //Create a constructor so we can create instances of it
    Node(int x) {      // x is the parameter because caller decides the data
        data = x;      // set data to whatever caller passed
        nextNode = null;   // always null at birth — no parameter needed
    }
}
public class InsertionAtBeginning {
    //Creating a new function for assigning a new node
    static Node insertFirstNode(Node firstNode, int newNode){
        //your newHead is the new Node, we created a new space
        Node newHead = new Node(newNode);
        //your new node should point towards your existing head:
        newHead.nextNode = firstNode;
        return newHead;
    }
    //printing LinkedList
    static void printLinkedList(Node firstNode){
        Node currentNode = firstNode;
        while(currentNode!=null){
            System.out.print(currentNode.data+"->");
            currentNode = currentNode.nextNode;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        //defining the nodes
        Node firstNode = new Node(20);
        Node secondNode = new Node(13);
        Node thirdNode = new Node(36);
        Node fourthNode = new Node(40);
        Node fifthNode = new Node(57);
        //link the nodes:
        firstNode.nextNode = secondNode;
        secondNode.nextNode=thirdNode;
        thirdNode.nextNode=fourthNode;
        fourthNode.nextNode=fifthNode;
        printLinkedList(firstNode);
        firstNode = insertFirstNode(firstNode, 721);
        printLinkedList(firstNode);
    }
}
