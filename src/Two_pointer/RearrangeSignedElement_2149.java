package Two_pointer;

public class RearrangeSignedElement_2149 {
    public int[] rearrangeArray(int[] nums) {
        ///
        int n = nums.length;
        //
        int[] res = new int[n];
        //put pos first
        int index = 0;
        for(int num : nums){
            if(num>0){
                res[index] = num;
                index+=2;
            }
        }
        //put neg second
        index=1;
        for(int num : nums){
            if(num<0){
                res[index] = num;
                index+=2;
            }
        }
        //
        return res;
    }
    //Solution 2:optimize
    public int[] rearrangeArray2(int[] nums) {
        int[] ans=new int[nums.length];

        int pos=0;
        int neg=1;

        for(int ele:nums){
            if(ele>0){
                ans[pos]=ele;
                pos+=2;
            }
            else{
                ans[neg]=ele;
                neg+=2;
            }
        }
        return ans;
    }

}
