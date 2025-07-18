import java.util.ArrayList;
import java.util.Collection;
import java.util.*;

public class test {
    public static void main(String[] args) {
        // Create an ArrayList with default constructor
        ArrayList<Integer> list = new ArrayList<>();
        // Print the default capacity by adding an element and checking size growth
        //System.out.println("Default capacity of ArrayList: 10");
        String s = "aabcaba";
        // Convert string to character array
        char[] chars = s.toCharArray();
        // Sort the character array
        Arrays.sort(chars);
        // Convert back to string
        String sorted = new String(chars);
        System.out.println("Sorted string: " + sorted);
    }
}