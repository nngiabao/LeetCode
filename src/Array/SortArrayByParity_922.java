package Array;

public class SortArrayByParity_922 {
    public static void main(String[] args) {
        SortArrayByParity_922 a = new SortArrayByParity_922();
        int[] num = {4, 2, 5, 7};
        //System.out.println();;
        for (int i : a.sortArrayByParityII(num)) {
            System.out.println(i);
        }
    }

    //Solution 1:Using 2 pointers
    public int[] sortArrayByParityII(int[] nums) {
        // pointer i for even
        //pointer j for odd
        int i = 0, j = 1;
        int len = nums.length;
        while (i< len && j < len) {
            //move i when even until meet the wrong place
            while (i<len && (nums[i] & 1) == 0) i+=2;
            //move j when odd until meet wrong place
            while (j<len && (nums[j] & 1) == 1) j+=2;
            //swap i and j
            if(i < len && j < len){//if we dont have this condition ill be throw out of array
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
            //
        }
        return nums;
    }
}
