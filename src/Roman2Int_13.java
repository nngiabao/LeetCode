import java.util.HashMap; // import the HashMap class
public class Roman2Int_13 {
    public static void main(String[] args) {
        System.out.println(romanToInt("VI"));
    }

    //Solution 1
    //Using hash map
    public static int romanToInt(String s) {
        //put into map
        HashMap<Character, Integer> map = new HashMap<>();
            map.put('I', 1);
            map.put('V', 5);
            map.put('X', 10);
            map.put('L', 50);
            map.put('C', 100);
            map.put('D', 500);
            map.put('M', 1000);
        int count=s.length()-1;
        for(int i = s.length()-2; i >= 0; i--) {
            if(map.get(s.charAt(i)) < map.get(s.charAt(i + 1))) {
                count-= map.get(s.charAt(i));
            }else{
                count+= map.get(s.charAt(i));
            }
        }
        return count;
    }

    //Solution 2 - better
    public static int intToRoman2(String s){
        int answer = 0, number = 0, prev = 0;
        for (int j = s.length() - 1; j > -1; j--) {
            number = switch (s.charAt(j)) {
                case 'M' -> 1000;
                case 'D' -> 500;
                case 'C' -> 100;
                case 'L' -> 50;
                case 'X' -> 10;
                case 'V' -> 5;
                case 'I' -> 1;
                default -> 0;
            };
            answer += number;
            if (number < prev) answer -= 2 * number;
            prev = number;
        }
        return answer;
    }
}
