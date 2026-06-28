class Node{
int data;
Node nextNode;
Node(int x){
data = x;
nextNode = null;
}
}
public class InsertionAtEnd {
    static Node insertAtEnd(Node firstNode, int newNode){
        Node temp = new Node(newNode);
        //if linkedlist is empty
        if(firstNode == null){
            return temp;
            //Traverse through LinkedList
        }Node currentNode = firstNode;
            while(currentNode.nextNode !=null){
                currentNode  = currentNode.nextNode;
            }
            currentNode.nextNode = temp;
      return firstNode;
    }
    static void printLL(Node firstNode){
        Node currentNode = firstNode;
        while(currentNode!=null){
            System.out.print(currentNode.data+"->");
            currentNode=currentNode.nextNode;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        Node firstNode = new Node(20);
        Node secondNode = new Node(31);
        Node thirdNode = new Node(18);
        firstNode.nextNode = secondNode;
        secondNode.nextNode = thirdNode;
        printLL(firstNode);
        insertAtEnd(firstNode, 31);
        printLL(firstNode);
    }
}
