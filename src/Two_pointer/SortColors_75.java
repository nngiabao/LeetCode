package Two_pointer;

public class SortColors_75 {
    //Solution 1:Using cage
    public void sortColors(int[] nums) {
        //using 2 pointers
        int n = nums.length;
        //
        int red = 0, white = 0, blue = 0;
        for (int num : nums) {
            if (num == 0) red++;
            else if (num == 1) white++;
            else if (num == 2) blue++;
        }
        //put into nums
        for (int i = 0; i < n; i++) {
            if (red > 0) {
                nums[i] = 0;
                red--;
            } else if (white > 0) {
                nums[i] = 1;
                white--;
            } else {
                nums[i] = 2;
            }
        }
    }

    //Solution 2:swap in-place
    //Selection sort
    public void sortColors2(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    //swap
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
    }

    //Solution 3: 2 pointers - best
    public void sortColors3(int[] nums) {
        int n = nums.length;
        int low = 0, high = n - 1,mid = 0   ;
        while (mid <= high) {
            if(nums[mid] == 0){
                swap(nums, mid, low);
                low++;
                mid++;
            }else if(nums[mid] == 1){
                mid++;
            }
            else if(nums[mid] == 2){
                swap(nums, mid, high);
                mid++;
                high--;
            }
        }

    }

    //swap method
    public void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
