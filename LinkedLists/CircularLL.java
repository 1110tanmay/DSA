
//main class
class Node{
    //type of data
    int data;
    //storing this class as an object Similar to int x. 
    Node nextNode;
    Node prevNode;
    
    //Contructor of this class
        public Node(int x) {
            data = x;
            nextNode =null;
            prevNode= null;
        }
    }
public class CircularLL {
    static Node traverseCLL(Node n1){
        //edge case
        if(n1 ==null){
            return null;
        }
        //printing head first:
        System.out.print(n1.data+"->");
        //traverse from second node until we come back to the head, since this is circular LL
        for(Node i = n1.nextNode;i!=n1;i=i.nextNode){
            System.out.print(i.data+"->");
        }
        return n1;
    }
    static Node insertAtB(Node n1, int data){
        Node temp = new Node(data);
        if(n1 ==null){
            //the new node will point towards itself
            return temp.nextNode =temp;
        }
            Node currentNode = n1;
            while(currentNode.nextNode!=n1){
                currentNode=currentNode.nextNode;
            }
                currentNode.nextNode = temp;
                temp.nextNode = n1;
        return temp;
    }
    static void printLL (Node n1){
        Node currentNode= n1;
        while(currentNode!=null){
            System.out.print(currentNode.data+"->");
            currentNode = currentNode.nextNode;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        Node n1 = new Node(21);
    Node n2 = new Node(23);
    Node n3 = new Node (12);
    Node n4 = new Node(41);
    n1.nextNode = n2;
    n2.prevNode = n1;
    n2.nextNode = n3;
    n3.prevNode = n2;
    n3.nextNode = n4;
    n4.prevNode =n3;
    n4.nextNode = n1;
    n1 = insertAtB(n1, 34);
    n1 = traverseCLL(n1);
    }
}
