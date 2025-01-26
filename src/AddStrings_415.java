public class AddStrings_415 {

    public String addStrings(String num1, String num2) {
        String result ="";int temp=0;
        if(num1.length() == 0) return num2;
        if(num2.length() == 0) return num1;
        int i=num1.length(),j=num2.length();

        while(i>0 && j>0) {
            int a = num1.charAt(i-1),b = num2.charAt(j-1);

            if(a+b>10){
                result = (char)((a+b)%10+temp)+result;
                temp=1;
            }else{
                result = (char)(a+b+temp)+result;
                temp=0;
            }
            i--;j--;
        }

        if(num1.length()-i!=0) {
            result=num1.substring(0,i)+result;
        }else if(i< num2.length()) {
            result=num2.substring(0,i)+result;
        }
        return result;
    }
}
