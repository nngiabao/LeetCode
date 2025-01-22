import java.util.PriorityQueue;

public class MinNumberGame_2974 {
    public static void main(String[] args) {
        int []a = {5,4,2,3};

        for(int b :  numberGame(a)){
            System.out.println(a);
        }
    }

    public static int[] numberGame(int[] nums) {
        int[] result = new int[nums.length];
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int i = 0; i < nums.length; i++){
            minHeap.add(nums[i]);
        }
        int index=1;
        while(!minHeap.isEmpty()){
            result[index] = minHeap.poll();
            result[index-1] = minHeap.poll();
            index+=2;
        }
        return result;
    }

    //Solution 2 - fastest - other's
    public int[] numberGame2(int[] nums) {
        int n = nums.length;

        int[] arr = new int [n];

        int index = 0;

        for(int i = 0; i < n - 1; i++){

            int minIndex = i;

            for(int j = i + 1; j < n; j++){

                if(nums[j] < nums[minIndex]){

                    minIndex = j;
                }
            }
            int temp = nums[minIndex];
            nums[minIndex] = nums[i];
            nums[i] = temp;

        }
        for(int i = 0; i < n - 1; i += 2){

            int temp = nums[i];
            nums[i] = nums[i + 1];
            nums[i + 1] = temp;

            arr[index++] = nums[i];
            arr[index++] = nums[i + 1];
        }

        return arr;
    }

}
