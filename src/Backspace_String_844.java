import java.util.Stack;

public class Backspace_String_844 {
    public static void main(String[] args) {
        String s = "bbbextm";
        String t = "bbb#extm";
        //System.out.println(backspaceCompare(s, t));
        System.out.println(backspaceCompare2(s, t));
    }

    //solution 1
    public static boolean backspaceCompare(String s, String t) {
        int i = 0;
        Stack<Character> res1 = new Stack();
        Stack<Character> res2 = new Stack();
        while(i<s.length()){
            if(s.charAt(i) == '#'){
                res1.pop();
            }else{
                res1.push(s.charAt(i));
            }
            i++;
        }
        i=0;
        while(i<t.length()){
            if(s.charAt(i) == '#' ){
                res2.pop();
            }else{
                res2.push(s.charAt(i));
            }
            i++;
        }
        System.out.println(res1);
        System.out.println(res2);
        if(res1.equals(res2)) return true;
        return false;
    }

    //solution 2
    public static boolean backspaceCompare2(String s, String t) {
        //
        int i=s.length()-1,j=t.length()-1;
        while(i > -1 || j > -1){
            //check string
            i=processString(s,i);
            j=processString(t,j);
            //compare s[i] and s[j] if |/ => return false
            if( (i>-1) && (j>-1) && s.charAt(i) != t.charAt(j))
                return false;
            //when 1 is done but other not => false
            if((i>-1) != (j>-1)){
                return false;
            }
            //this one start the next char after compare ( if not => inf loop)
            i--;
            j--;
        }
        return true;
    }

    public static int processString(String s,int i){
        int skip=0;
        while(i>-1){
            if(s.charAt(i) == '#'){
                skip++;
                i--;
            }else if(skip>0){
                skip--;
                i--;
            }else{
                break;
            }
        }
        return i;
    }
}
