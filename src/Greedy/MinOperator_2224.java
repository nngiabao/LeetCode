package Greedy;

public class MinOperator_2224 {
    public static void main(String[] args) {
String a = "02:30";
String b = "04:30";
        MinOperator_2224 m = new MinOperator_2224();
        m.convertTime(a,b);
    }
    public int convertTime(String current, String correct) {
        //convert all to min
        //current
        String[] c_current = current.split(":");
        String[] c_correct = correct.split(":");
        int i_current = Integer.parseInt(c_current[0]) * 60+Integer.parseInt(c_current[1]);
        int i_correct = Integer.parseInt(c_correct[0]) * 60+Integer.parseInt(c_correct[1]);
        //
        int count = 0;
        //
        while (i_current < i_correct) {
            //60s
            while (i_correct - 60 >= i_current) {
                i_correct -= 60;
                count++;
            }
            //
            while (i_correct - 15 >= i_current) {
                i_correct -= 15;
                count++;
            }
            //
            while (i_correct - 5 >= i_current) {
                i_correct -= 5;
                count++;
            }
            //
            while (i_correct - 1 >= i_current) {
                i_correct -= 1;
                count++;
            }
        }
        return count;
    }
}
