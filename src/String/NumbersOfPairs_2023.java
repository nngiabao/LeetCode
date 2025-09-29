package String;

public class NumbersOfPairs_2023 {
    //Solution 1:Using 2 loops => Brute-force
    public int numOfPairs(String[] nums, String target) {
        //
        int count = 0;
        int n = nums.length;
        int t_len = target.length();
        for (int i = 0; i < n - 1; i++) {
            int len = nums[i].length();
            for (int j = i + 1; j < n; j++) {
                if(t_len-len != nums[j].length()) continue;
                if((nums[i]+nums[j]).equals(target)) count++;
                if((nums[j]+nums[i]).equals(target)) count++;
            }
        }
        //
        return count;
    }
}
