package Two_pointer;

public class MinSwap_1963 {
    public int minSwaps(String s) {
        //
        int count = 0;
        //
        int balance = 0, swaps = 0;
        for (char c : s.toCharArray()) {
            balance += (c == '[') ? 1 : -1;
            if (balance < 0) {   // need to bring a future '[' here
                swaps++;
                balance = 1;     // after swap, prefix has one more '[' than ']'
            }
        }
        return swaps;
        //
        //
    }
}
