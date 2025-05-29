package Greedy;

public class ContainerWater_11 {
    public int maxArea(int[] height) {
        //2 pointers
        //area = min height * distance 2 column
        int max = 0,len = height.length,left = 0,right = len-1;
        while(left < right){
            max = Math.max(max, Math.min(height[left], height[right]) * (right-left));
            if(height[left] < height[right]) left++;
            else right--;
        }
        return max;
    }
}
