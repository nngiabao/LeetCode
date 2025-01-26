public class MoveZero_283 {
    public static void main(String[] args) {
        moveZeroes(new int[] { 0,1,0,3,12});
    }
    //Solution 1
    //2 pointers

    public static void moveZeroes(int[] nums) {
        int p_zero,p_nonzero;
        if(nums.length==1) return;
        else{
            p_zero=0;
            p_nonzero=1;
        }
        //
        while(p_nonzero<nums.length){
            //
            if(nums[p_zero]!=0) p_zero++;

            if(nums[p_nonzero]!=0 && nums[p_zero]==0){
                //swap
                int temp=nums[p_nonzero];
                nums[p_nonzero]=nums[p_zero];
                nums[p_zero]=temp;
                p_zero++;
            }
            p_nonzero++;
        }
        for(int i : nums) System.out.print(i+" ");
    }

    public static void swap(int a,int b){
        int temp =a;
        a=b;
        b=temp;
    }

    //Solution 2

}
