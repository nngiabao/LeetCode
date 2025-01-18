import java.util.ArrayList;

public class KeyboardRow_500 {
    public static void main(String[] args) {
        String [] a = {"Aasdfghjkl","Qwertyuiop","zZxcvbnm"};
        for(String b : findWords(a)) System.out.println(b);
    }

    //Solution 1
    public static String[] findWords(String[] words) {
        //String [] result = new String[0];
        ArrayList<String> result = new ArrayList<>();
        for(int i=0;i<words.length;i++) {
            if(check(words[i])) {
                result.add(words[i]);
            }
        }

        return  result.toArray(new String[0]); // Convert the ArrayList back to an array if needed
    }

    public static boolean check(String w){
        String r1 = "qwertyuiop";
        String r2 = "asdfghjkl";
        String r3 = "zxcvbnm";
        String row;char ch = w.toLowerCase().charAt(0);
        if(r1.contains(Character.toString(ch))){
            row=r1 ;
        }else if (r2.contains(Character.toString(ch))){
            row=r2;
        }else{
            row=r3;
        }
        for(int i=1;i<w.length();i++){
            if(!row.contains(Character.toString(w.toLowerCase().charAt(i)))) return false;
        }
        return true;
    }
}
