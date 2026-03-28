package Leetcode;
public class waterContainer {
    //brute force approach
    public int maxArea(int[] height) {
        int currentMax = 0;
        int maxEver = 0;
        for (int i = 0;i<=height.length-1;i++){
            for(int j = i+1;j<=height.length-1;j++)
            {
                currentMax= (j-i)*Math.min(height[i], height[j]);
                if (currentMax >=maxEver){
                    maxEver = currentMax;
                }
            }
        }
        return maxEver;
    }
    //optimized approach: 
    public int optMaxArea(int [] height){
        //Two pointers
        int left = 0;
        int right = (height.length)-1;
        int currentMax=0;
        int totalMax = 0;
        while(left<right)   //terminating condition
        {
            //calculating area
            currentMax = (right - left) * Math.min(height[left], height[right]);
            if(height[left]<height[right]){
                left++;
            }else{
                right--;
            }
            if(currentMax>totalMax){
                totalMax=currentMax;
            } 
        }
        return totalMax;
    }
    public static void main(String[] args) {
        int [] height = new int[9];
        height[0]=1;
        height[1]=8;
        height[2]=6;
        height[3]=2;
        height[4]=5;
        height[5]=4;
        height[6]=8;
        height[7]=3;
        height[8]=7;
        waterContainer wc = new waterContainer();
        System.out.println(wc.maxArea(height));
        System.out.println(wc.optMaxArea(height));
    }
}
