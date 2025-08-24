package Two_pointer;

import java.util.ArrayList;
import java.util.List;

public class PartionArrayByPivot_2161 {
    //Solution 1:
    public int[] pivotArray(int[] nums, int pivot) {
        //
        List<Integer> list_left = new ArrayList<>();
        List<Integer> list_pivot = new ArrayList<>();
        List<Integer> list_right = new ArrayList<>();
        //
        for (int num : nums) {
            if (num == pivot) {
                list_pivot.add(num);
            } else if (num > pivot) {
                list_right.add(num);
            } else list_left.add(num);
        }
        //
        int index = 0;
        for (int j = 0; j < list_left.size(); j++) {
            nums[index++] = list_left.get(j);
        }
        //
        for (int j = 0; j < list_pivot.size(); j++) {
            nums[index++] = list_pivot.get(j);
        }
        //
        for (int j = 0; j < list_right.size(); j++) {
            nums[index++] = list_right.get(j);
        }
        //
        return nums;
    }

    //Solution 2:
    public int[] pivotArray2(int[] nums, int pivot) {
        int n = nums.length;
        int[] result = new int[n];
        int left = 0;
        int right = n - 1;
        for (int num : nums) {
            if (num < pivot) {
                result[left++] = num;
            }
        }
        for (int num : nums) {
            if (num == pivot) {
                result[left++] = num;
            }
        }
        for (int num : nums) {
            if (num > pivot) {
                result[left++] = num;
            }
        }
        return result;
    }
}
