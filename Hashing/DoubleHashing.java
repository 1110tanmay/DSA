
public class DoubleHashing{
    //declaring the array: 
    int nums [];
    //setting the ground rules for the array: 
    int cap;
    int size;
    static final int EMPTY = -1;
    static final int DELETED = -2;

    //Above we use final so the values of the variables can't be changed in any instances, static so multiple copies aren't needed.
    //Constrcutor: 
    public DoubleHashing(int Capacity) {
        cap = Capacity;
        //creating an array sized of the capacity
        nums = new int [cap];
        size =0;
    }
    //hash function:
    int hashFunction(int key){
        return key % cap;
    }
    //insert function (boolean since we return false in case to fail to insert the key):
    boolean insertFunction(int key){
        if(size ==cap){
            System.out.println("The table is full"+key);
            return false;
        }
        //converting the key into array index
        int index = hashFunction(key);

        //Checking for the slot to be empty, checking for the slot not to be deleted, make sure the traversal is circlular and not liner.
        while(nums[index] !=1 && nums[index]!=-2 && nums[index]!=key){
            index = (index +1) %cap;
        }
        //Checking if the key exists, can't permit duplicate keys
        if(nums[index] ==key){
            System.out.println("The key already exists:"+key);
            return false;
        }
        //post satisfying the conditions, we add the key:
        nums[index] = key;
        //increase the size of course:
        size++;
        return true;
    }
    //search function:
    boolean searchFunction(int key){
        return true;
    }
    //insert function
    void deleteFunction(int key){

    }
    //print table
    void printTable(int key){

    }
    
    
    public static void main(String[] args) {
        
    }
}