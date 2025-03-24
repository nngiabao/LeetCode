package String;

public class NumOfSegments_434 {
    public static void main(String[] args) {
        String s = "        ";
        System.out.println(s.trim());
        String [] temp = s.split(" ");
        for(String a : temp){
            System.out.println(a);
        }
        System.out.println(countSegments(s));
    }
    //Solution 1: Using method
    public static int countSegments(String s) {
        if(s.length() == 0 || s.trim().isEmpty()) return 0;
       return s.trim().split("\\s+").length;
    }

    //Solution 2: better
    //whenever
}
