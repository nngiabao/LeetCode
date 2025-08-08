package BST;

public class FindDup_287 {
    //Solution 1:Using array to check
    public int findDuplicate(int[] nums) {
        //
        int len = nums.length;
        boolean[] arr = new boolean[len];
        //
        for (int i = 0; i < nums.length; i++) {
            //
            if (!arr[nums[i]]) arr[nums[i]] = true;
            else return nums[i];
        }
        //
        return 1;
    }

    //Solution 2:Floyd’s Cycle Detection (Tortoise and Hare)
    public int findDuplicate2(int[] nums) {
        // Step 1: Find the intersection point
        int slow = nums[0];
        int fast = nums[0];
        //
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);

        // Step 2: Find the entrance to the cycle (duplicate number)
        slow = nums[0];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }
        //
        return slow;
    }
}
