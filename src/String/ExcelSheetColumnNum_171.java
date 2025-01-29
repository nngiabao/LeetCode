package String;

public class ExcelSheetColumnNum_171 {
    public static void main(String[] args) {
        System.out.println(titleToNumber("AB"));;
    }

    public static int titleToNumber(String columnTitle) {
        int i=columnTitle.length()-1,result=0,count=0;
        while(i>-1){
            result+= power(count)*(columnTitle.charAt(i)-'A'+1);
            System.out.println(count);

            System.out.println(power(count));
            count++;
            i--;
        }
        return result;
    }

    //method count power of 26
    public static int power(int n) {
        if(n==0) return 1;
        return 26*power(n-1);
    }

    ///Solution 2 - best
    public int titleToNumber2(String columnTitle) {
        int res = 0;

        for(int i=0; i<columnTitle.length(); i++){
            int value = columnTitle.charAt(i) - 'A' + 1;
            res = res * 26 + value;
        }
        return res;
    }
}
