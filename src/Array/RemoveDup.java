package Array;

public class RemoveDup {
    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int k = removeDuplicates(nums);

        // Output the result
        System.out.println("k = " + k);
        System.out.print("Modified Array: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int k = 1; // Start with the first unique element
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[k - 1]) {
                nums[k] = nums[i]; // Place the unique element in the next position
                k++;
            }
        }
        return k;
    }
}
