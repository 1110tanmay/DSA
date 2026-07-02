class Node{
    int data;
    Node nextNode;
    //constructor 
    public Node(int x){
        data = x;
        nextNode = null;
    }
}
public class InsertionInMIddle {
    static Node insertAnywhere(Node firstNode, int data, int toInsertPlace){
        Node tempSpace = new Node(data);
        //if the position is one
        if(toInsertPlace==1){
            tempSpace.nextNode = firstNode;
            return tempSpace;
        }
        //traverse through the node until the position
        Node currentNode = firstNode;
        for(int i = 1;i<=toInsertPlace -2 && currentNode!=null;i++){
            currentNode = currentNode.nextNode;
        }
        //Making sure the position exists
        if(currentNode==null){
            return firstNode;
        }
        //rewiring, the new node needs to point towards the next node and the previous nodes then points towards the new node.
        //Current node being our neew node, points towads the position + 1 node.
        tempSpace.nextNode = currentNode.nextNode;
        //The current node points towards the new node
        currentNode.nextNode = tempSpace;
        return firstNode;
    }
    static void printLL(Node firstNode){
        Node currentNode = firstNode;
        while(currentNode !=null){
            System.out.print(currentNode.data +"->");
            currentNode = currentNode.nextNode; 
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
          Node n1 = new Node(12);
          Node n2 = new Node(31);
          Node n3 = new Node(45);
          Node n4 = new Node(8);
          Node n5 = new Node(2);
          Node n6 = new Node(125);
          n1.nextNode =n2;
          n2.nextNode =n3;
          n3.nextNode =n4;
          n4.nextNode =n5;
          n5.nextNode =n6;
          printLL(n1);
          n1= insertAnywhere(n1, 68, 5);
          printLL(n1);
    }    
}
