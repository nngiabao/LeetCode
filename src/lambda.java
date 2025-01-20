import java.util.Hashtable;

public class lambda {
    static int count = 0;
    public static void main(String[] args) {
        int [] a = {1,2};
        int [] b = new int[3];
        b = a;
        for(int c : b) System.out.println(c);
    }
}
