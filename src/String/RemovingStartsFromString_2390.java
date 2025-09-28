package String;

public class RemovingStartsFromString_2390 {
    public String removeStars(String s) {
        //
        int start =0;
        StringBuilder res = new StringBuilder();

        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i);
            if(ch == '*'){
                res.deleteCharAt(res.length()-1);
            }else{
                res.append(ch);
            }
        }
        //

        return res.toString();
    }
}
