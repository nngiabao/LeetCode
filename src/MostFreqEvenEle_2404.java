import java.util.HashMap;

public class MostFreqEvenEle_2404 {
    public static void main(String[] args) {
        int[] test ={8154,9139,8194,3346,5450,9190,133,8239,4606,8671,8412,6290};
        //3346
        System.out.println(mostFrequentEven(test));
    }

    public static int mostFrequentEven(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int candidate = -1, count = 0;
        for (int num : nums) {
            if (num % 2 == 0) {
                map.put(num, map.getOrDefault(num, 0) + 1);
                int freq = map.get(num);
                if (freq > count || (count == freq && num < candidate)) {
                    count = map.get(num);
                    candidate = num;
                }
                if (map.get(num) > nums.length / 2) return num;
            }
        }
        return candidate;
    }
        //fastest way
        public static int mostFrequentEven2(int[] nums) {
            int n = nums.length;
            int[] evenNumFre = new int[50001];
            int ele = -1;
            int freq = -1;
            for (int i = 0; i < n; i++) {
                int num = nums[i];
                if ((num & 1) == 0) {
                    int revisedNum = num / 2;
                    evenNumFre[revisedNum]++;
                    if (evenNumFre[revisedNum] == freq) {
                        ele = Math.min(num, ele);
                    } else if (evenNumFre[revisedNum] > freq) {
                        ele = num;
                        freq = evenNumFre[revisedNum];
                    }

                }
            }
            return ele;
        }
    }
