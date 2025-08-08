package BST;
//
public class Search_Insert_35 {
    public static void main(String[] args) {
        int[] num = {1,3,5,6};
        int target = 2;
        System.out.println(searchInsert(num,target));
        System.out.println(searchInsert2(num, target));
    }
    //Solution 1
    public static int searchInsert(int[] nums, int target) {
        int index = 0;
        while(index < nums.length) {
            if(nums[index]==target) {
                return index;
            }else{
                if(nums[index]>target) return index;
                index++;
            }
        }
        return index;
    }

    //BST - best
    public static int searchInsert2(int[] nums, int target) {
        int l=0,r=nums.length-1,m=0;
        while(l<=r){
            m=(l+r)/2;
            if(target>nums[m]){
                l=m+1;
            }else if(target<nums[m]){
                r=m-1;
            }else{
                return m;
            }
        }
        return l;
    }
}
