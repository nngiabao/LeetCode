package String;

public class NumsOfSenior_2678 {
    public static void main(String[] args) {
        String s = "7868190130M7522";
        System.out.println(s.substring(11,13));
    }
    public int countSeniors(String[] details) {
        int count = 0;
        for(String s : details){
            if(Integer.parseInt(s.substring(11,13)) > 60) count++;
        }
        return count;
    }
}
