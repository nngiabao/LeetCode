package String;

public class CheckNumberIncrease_2042 {

    //
    public boolean areNumbersAscending(String s) {
        int max = -1;
        int temp = 0;
        for(char c : s.toCharArray()) {
            if(Character.isDigit(c)) {
                temp = temp * 10 + c - '0';
            }else if(max != -1 && temp <= max) return false;
            //else if()
        }
        return false;
    }
}
