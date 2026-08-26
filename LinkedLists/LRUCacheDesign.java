
import java.util.HashMap;
//Node class
class Node{
    //parameters that we will pass through the node class, key - value pair is needed.
    int value;
    int key; 
    Node prevNode;
    Node nextNode;
    //Constructor
    Node(int v, int k){
     value = v;
     key = k;
     nextNode = null;
     prevNode = null;
    }
}//Seperate LRU class is needed to avoid bloating of the main function
class LRUcache{
    //Define capacity of the LRU cache. It needs to be equal to the size of the hashmap.
    int capacity;
    //We define an interger hash map that stores int as the key and Node for values
    HashMap<Integer, Node> hMap;
    /*We define headNode and tailNode, because it is easier to traverse,
    tailNode is least recently used and headNode is the newest.
    Currently there are only two nodes, they point towards each other.*/
    Node headNode;
    Node tailNode;
}

public class LRUCacheDesign {
   public static void main(String[] args) {
       
   }
}
