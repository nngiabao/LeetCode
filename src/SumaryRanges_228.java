import java.util.ArrayList;
import java.util.List;

public class SumaryRanges_228 {
    public static void main(String[] args) {
        System.out.println(summaryRanges2(new int[]{0,2,3,4,6,8,9}));
    }

    //best solution - find range smaller then add into bigger 1
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        int n = nums.length;
        if(n == 0) return result;
        int min = nums[0], max = nums[0];

        for(int i = 1;i < n; i++){
            if(nums[i] == nums[i - 1] + 1)  max = nums[i];
            else {
                result.add(getString(min, max));
                min = nums[i];
                max = nums[i];
            }
        }

        result.add(getString(min, max));
        return result;

    }

    public String getString(int a, int b){
        StringBuilder sb = new StringBuilder();
        if(a != b){
            sb.append(a).append("->").append(b);
            return sb.toString();

        }
        sb.append(a);
        return sb.toString();
    }

    //Solution 2 - slower than 1st one
    public static List<String> summaryRanges2(int[] nums) {
        if (null == nums || nums.length == 0) return new ArrayList<>();
        List<String> ranges = new ArrayList<>();
        int start = 0, count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] - nums[i - 1] != 1) {
                if (count == 1) ranges.add(String.valueOf(nums[start]));
                else ranges.add(String.valueOf(nums[start]) + "->" + String.valueOf(nums[start] + count - 1));
                count = 1;
                start = i;
            } else count++;
        }
        if (count == 1) ranges.add(String.valueOf(nums[start]));
        else ranges.add(String.valueOf(nums[start]) + "->" + String.valueOf(nums[start] + count - 1));
        return ranges;
    }
}
