package Array;

public class Check1s_1437 {
    public static void main(String[] args) {
        int[] a = {1,0,0,1,0,1};
        System.out.println(kLengthApart(a,2));
    }

    public static boolean kLengthApart(int[] nums, int k) {
        int end=0;
        //find last index of 1
        for(int i=nums.length-1; i>0; i--){
            if(nums[i]==1){
                end=i;
                break;
            }
        }
        //check valid
        for(int i=end-1; i>-1; i--){
            if(nums[i]==1){
                if(end-i-1<k) return false;
                end=i;
            }
        }
        return true;
    }
}
