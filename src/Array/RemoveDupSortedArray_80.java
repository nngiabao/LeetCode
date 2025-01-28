package Array;

public class RemoveDupSortedArray_80 {
    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{1,1,1,2,2,3}));
    }
    //Solution 1
    public static int removeDuplicates(int[] nums) {
        if (nums.length <= 2) {
            return nums.length; // If array length is 2 or less, return it directly
        }

        int j = 2; // Pointer for valid elements (start at index 2)

        for (int i = 2; i < nums.length; i++) {
            // If the current element is not equal to nums[j - 2], it's valid
            if (nums[i] != nums[j - 2]) {
                nums[j] = nums[i]; // Place the current element in the valid section
                j++; // Move the pointer
            }
        }
        //
        for(int a : nums) {
            System.out.print(a + " ");
        }
        return j;
    }
}
