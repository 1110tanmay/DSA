class Node{
    int data;
    Node nexNode;
    Node prevNode;

    //constructor
    public Node(int x) {
        data= x;
        nexNode = null;
        prevNode = null;
    }
    
}
public class DoublyLL {
    static Node insertAtStart(Node n1, int data){
        Node temp = new Node(data);
        if(n1==null){
            return temp;
        }
       temp.nexNode = n1;
       n1.prevNode = temp;
        return temp;
    }
    static void printLL (Node n1){
        Node currentNode= n1;
        while(currentNode!=null){
            System.out.print(currentNode.data+"->");
            currentNode = currentNode.nexNode;
        }
        System.out.println("null");
    }
public static void main(String[] args) {
    Node n1 = new Node(21);
    Node n2 = new Node(23);
    Node n3 = new Node (12);
    Node n4 = new Node(41);
    n1.nexNode = n2;
    n2.prevNode = n1;
    n2.nexNode = n3;
    n3.prevNode = n2;
    n3.nexNode = n4;
    n4.prevNode =n3;
    printLL(n1);
    n1= insertAtStart(n1, 36);
    printLL(n1);
}
}
