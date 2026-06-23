
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
        //Initially the size of the array is 0 since no elements have been added.
        size =0;
        //filling the array with impty slots
        for(int i=0;i<cap;i++){
            nums[i] = EMPTY;
        }
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
        while(nums[index] !=EMPTY && nums[index]!=DELETED && nums[index]!=key){
            //This is to make sure we keep the search in loop and not linear
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
            int startIndex = hashFunction(key);
            int currentIndex = startIndex;
            //keep checking while the slot is not empty:
            while(nums[currentIndex]!=EMPTY){
                //key found:
                if(nums[currentIndex] == key){
                    return true;
                }
                //if the key isn't found, we move forward in a circular direction
                currentIndex = (currentIndex+1)%cap;
                if(currentIndex == startIndex){
                    return false;
                }
            }
        return false;
    }
    //delete function
    void deleteFunction(int key){
        int startIndex = hashFunction(key);
        int currentIndex = startIndex;
        while(nums[currentIndex]!=EMPTY){
            //if the key is found
            if(nums[currentIndex] == key){
                nums[currentIndex] = DELETED;
                size--;
                return;
            }
            //looping through the array
            currentIndex = (currentIndex+1)%cap;
            //if the key is not present in the current iteration
            if(currentIndex == startIndex){
                System.out.println("The key was not found to be deleted."+key);
                return;
            }
        }
    }
    //print table
    void printTable() {
        System.out.println("(-1 is empty, -2 is deleted)");
        for (int i = 0; i < nums.length; i++) {
            System.out.println("Index " + i + ": " + nums[i]);
        }
    }
    public static void main(String[] args) {
        DoubleHashing instance1 = new DoubleHashing(5);
        instance1.insertFunction(12);
        instance1.printTable();
        instance1.insertFunction(14);
        instance1.insertFunction(3);
        instance1.insertFunction(4);
        instance1.insertFunction(1);
        instance1.insertFunction(76);
        instance1.printTable();
        System.out.println("Search 14:"+instance1.searchFunction(14));
        System.out.println("Search 2:"+instance1.searchFunction(2));
        instance1.deleteFunction(76);
        instance1.printTable();
    }
}