package String;

public class AddStrings_415 {
    public static void main(String[] args) {
        System.out.println(addStrings("9","1"));
    }

    //Solution 1
    public static String addStrings(String num1,String num2){
        //
        if(num1.length() == 0) return num2;
        if(num2.length() == 0) return num1;
        //
        StringBuilder result=new StringBuilder();
        int i=num1.length()-1,j=num2.length()-1,temp=0;
        while(i>-1 && j>-1) {
            int a = num1.charAt(i) - '0',b = num2.charAt(j) - '0';
            int sum = a+b;
            result.append((char)(sum+temp)%10);
            temp=(sum+temp)/10;
            i--;j--;
        }
         //
       if(i>-1) {
            for(int k=i;k>-1;k--) {
                int a = num1.charAt(k) - '0';
                int sum = a+temp;
                result.append((char)sum%10);
                temp=sum/10;
            }
       }
       if(j>-1) {
           for(int k=j;k>-1;k--) {
               int a = num2.charAt(k) - '0';
               int sum = a+temp;
               result.append((char)sum%10);
               temp=sum/10;
           }
       }
       //convert int to char
       if(temp>0) result.append((char) (temp+'0'));
        return result.reverse().toString();
    }
}
