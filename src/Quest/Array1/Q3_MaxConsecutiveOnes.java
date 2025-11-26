package Quest.Array1;

import static java.lang.Math.max;

public class Q3_MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0;
        int current = 0;

        for (int num : nums) {
            if (num == 1) {
                current++;
                maxCount = Math.max(maxCount, current);
            } else {
                current = 0;
            }
        }

        return maxCount;
    }
}
