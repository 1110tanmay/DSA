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
    static Node insertAtEnd(Node n1, int data){
        
        Node temp = new Node(data);
        if(n1==null){
            return temp;
        }
        Node currentNode = n1;
        while(currentNode!=null){
            if(currentNode.nexNode==null){
                currentNode.nexNode = temp;
                temp.prevNode = currentNode;
                break;
            }
            currentNode = currentNode.nexNode;
        }
        return n1;
    }
    static Node reverseLL(Node n1){
        //Ruling out the edge cases
        if(n1==null||n1.nexNode ==null){
            return n1;
        }
        Node currentNode = n1;
        Node prevNode = null;
        while(currentNode!=null){
            //begin swapping:
            //Step1: Setting the current's node previous to previous. 
            prevNode = currentNode.prevNode;
            //Step2: The previous of the current node needs to point to the next of current node:
            currentNode.prevNode = currentNode.nexNode;
            //Step3: The next of the current node needs to point to the previous of current node:
            currentNode.nexNode = prevNode;
            //Moving forward, the previous is now become next
            currentNode = currentNode.prevNode;
        }
        return prevNode;
    }
    static Node deleteFirstNode(Node n1){
        //edge cases:
        //Case1: If the LinkedList is empty
        if(n1==null){
            return null;
        }
        //Case2: If theere is only one element
        if(n1.nexNode==null){
            return null;
        }
        //Second is the new first
        n1 = n1.nexNode;
        //Updating previous of the current node to null
        n1.prevNode = null;
        return n1;
    }
    static Node deleteEndNode(Node n1){
        if(n1==null){
            return null;
        }
        if(n1.nexNode==null){
            return null;
        }
        Node prevNode =null;
        Node currentNode = n1;
        while(currentNode!=null){
            if(currentNode.nexNode==null){
                currentNode.prevNode.nexNode =null;
                break;
            }
            currentNode=currentNode.nexNode;
        }
        return n1;
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
    n1 = insertAtEnd(n1, 105);
    printLL(n1);
    n1 = reverseLL(n1);
    printLL(n1);
    n1 = deleteFirstNode(n1);
    printLL(n1);
    n1 =deleteEndNode(n1);
    printLL(n1);
}
}
