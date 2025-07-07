package Array;

public class RemEle_27 {
    public static void main(String[] args) {
    }
    public int removeElement(int[] nums, int val) {
        int count=0;
        int []temp=new int[nums.length];
        for(int i: nums) temp[count++]=i;
        count =0;
        for(int i: temp){
            if(i!= val) nums[count++]=i;
        }
        return count;
    }
}
