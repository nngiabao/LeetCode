package Bit;

public class AddBin_67 {
    public static void main(String[] args) {
        System.out.println(addBinary("11","1"));
    }

    public static String addBinary(String a, String b) {
        if (a == null) return b;
        if (b == null) return a;
        int temp = 0;
        StringBuilder result = new StringBuilder();
        int i = a.length() - 1, j = b.length() - 1;
        while (i >= 0 || j >= 0 || temp != 0) {
            //get bit from string a
            //and get bit from string b
            //we have to have condition here when search all string but still have 1 temp
            //=> add that temp at first of the string builder
            int val_a = (i >= 0) ? a.charAt(i) - '0' : 0;
            int val_b = (j >= 0) ? b.charAt(j) - '0' : 0;

            int sum = val_a + val_b + temp;
            result.append(sum%2);
            temp = (sum/2);
            j--;i--;
        }

        return result.reverse().toString();
    }
}
