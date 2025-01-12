import java.util.Hashtable;

public class lambda {
    static int count = 0;
    public static void main(String[] args) {
        int[]nums = {2,2,1,3,1,4,5,2};
        Hashtable<Integer , Integer> m = new Hashtable<>();
        //m.put(1, 1);
        System.out.println(m.get(1));
        int count=0;
        for(int i=0;i<nums.length;i++) {
            //if find -> process
            //int finalI = i;
            m.compute(nums[i], (k, v) -> {
                //int value = m.get(k);
                if (v != null) {
                    return v+1;
                } else {
                    return 1;
                }
            });
             int value = m.get(nums[i]);
           System.out.println("key"+nums[i]+": "+value);
            if (value > nums.length/2){
                System.out.println(nums[i]);
                break;
            }
        }
        //while(count)
        System.out.println(m);
    }
}
