package Leetcode;
public class waterContainer {
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
    }
}
