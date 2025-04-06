
import java.util.*;

public class Int2Roman_12 {
    public static void main(String[] args) {
        System.out.println(intToRoman(14));

    }

    //Solution 1: Using hashmap
    public static String intToRoman(int num) {
        StringBuilder res = new StringBuilder();
        HashMap<String, Integer> map = new LinkedHashMap<>();
        map.put("M", 1000);
        map.put("CM", 900);
        map.put("D", 500);
        map.put("CD", 400);
        map.put("C", 100);
        map.put("XC", 90);
        map.put("L", 50);
        map.put("XL", 40);
        map.put("X", 10);
        map.put("IX", 9);
        map.put("V", 5);
        map.put("IV", 4);
        map.put("I", 1);
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            while (num >= entry.getValue()) {
                num -= entry.getValue();
                res.append(entry.getKey());
            }
        }
        return res.toString();
    }

    //Solution 2: Using 2D array to store instead of map
    public static String intToRoman2(int num) {
        StringBuilder res = new StringBuilder();
        //build map by using 2D
        Object[][] a = {{"M", 1000},
                {"CM", 900},
                {"D", 500},
                {"CD", 400},
                {"C", 100},
                {"XC", 90},
                {"L", 50},
                {"XL", 40},
                {"X", 10},
                {"IX", 9},
                {"V", 5},
                {"IV", 4},
                {"I", 1}};
        for (Object[] row : a) {
            int value = (Integer) row[1];
            while(num >= value) {
                res.append(row[0]);
                num -= value;
            }
        }
        return res.toString();
    }
}
