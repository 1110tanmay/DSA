package Hashing;

public class DAT {
    static boolean  search(int nums[], int key) {
        if(nums[key]==1){
            return true;
        } else{
            return false;
        }
    }
    static void insert(int nums[], int key) {
        nums[key] =1;
    }
    static void delete(int nums[], int key) {
        nums[key] = 0;
    }
    public static void main(String[] args) {
        //new int needed to help compiler understand.
    int nums [] = new int[1000];
    int key;
    insert(nums, 10);
    search(nums, 10);
    delete(nums, 10);
    }
}
