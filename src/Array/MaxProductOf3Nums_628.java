package Array;
import java.util.Arrays;
import static java.util.Arrays.sort;

public class MaxProductOf3Nums_628 {
    public static void main(String[] args) {
        int [] a = {-710,-107,-851,657,-14,-859,278,-182,-749,718,-640,127,-930,-462,694,969,143,309,904,-651,160,451,-159,-316,844,-60,611,-169,-73,721,-902,338,-20,-890,-819,-644,107,404,150,-219,459,-324,-385,-118,-307,993,202,-147,62,-94,-976,-329,689,870,532,-686,371,-850,-186,87,878,989,-822,-350,-948,-412,161,-88,-509,836,-207,-60,771,516,-287,-366,-512,509,904,-459,683,-563,-766,-837,-333,93,893,303,908,532,-206,990,280,826,-13,115,-732,525,-939,-787};
        Arrays.sort(a);
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
        System.out.println(a[a.length-1]);
        System.out.println(a[a.length-2]);
        System.out.println(maximumProduct(a));
    }

    //Solution 1
    //sort
    public static int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        //we have many cases after sort
        //case 1: product of rtf2 first number neg and last non-neg
        //=> nums[n.length-1]*nums[n.length-3]*nums[n.lenght-2]
        //case 2: product of 2 first numsber is non-neg and last non-neg
        //=> nums[0]*nums[1]*nums[n.lenght-1]
        //then we return the higher one;
        int case1 = nums[nums.length-1]*nums[nums.length-3]*nums[nums.length-2];
        int case2 = nums[0]*nums[1]*nums[nums.length-1];
        return Math.max(case1, case2);
    }
}
