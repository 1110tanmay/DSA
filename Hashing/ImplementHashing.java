import java.util.ArrayList;
import java.util.LinkedList;

public class ImplementHashing{
    //create a bucket(sections)
    int sections;
    //create a variable named table.
    ArrayList<LinkedList<Integer>> table;
    //creating a constructer that we will call while doing operations on this table
    ImplementHashing(int b){
        //b is the number of sections
        table = new ArrayList<LinkedList<Integer>>();
        sections = b;
        for(int i=0;i<b;i++){
            table.add(new LinkedList<Integer>());
        }
    }
    //create a hash function that decides what value goes where, using sections here to determine, the index of the dynamic sized array.
    int hashFunc(int key){
        return key % sections;
    }
    //inset, search and delete operations:
    void insert(int key){
        // need to store the section as index so call the hash function here
        int index = hashFunc(key);
    /*get the section or bucket at that index which was calculated by the hashfunction after we passed the key, meaning the given number
    is the key. We then add the key at the given index.*/
        table.get(index).add(key);
    }
     boolean search(int key){
        //search the section(bucket)
        int index = hashFunc(key);
        //we get that section and then check if the linkedlist in that section(index) also known as bucket and then with containts we check whether the key is present or not.
        return table.get(index).contains(key);
    }
    void delete(int key){
        //move the to section
        int index = hashFunc(key);
        table.get(index).remove(Integer.valueOf(key));
    }
    void printTable(){
    for (int i = 0; i < sections; i++) {
        System.out.print("Sections " + i + ": ");
        for (int val : table.get(i)) {
          System.out.print(val + " -> ");
        }
    }
        System.out.println("null");
      }
    public static void main(String[] args) {
        //need to create an instance of the class, with the number of buckets
        ImplementHashing ht = new ImplementHashing(5);
        //inserting keys:
        ht.insert(17);
        ht.insert(12);
        ht.insert(3);
        //printing the table
        ht.printTable();

        ht.search(12);
        ht.search(4);

        ht.delete(17);
        ht.printTable();
    }
}