package String;

public class SumDigitsAfterConvert_1945 {
    //Solution 1:Simulate
    public int getLucky(String s, int k) {
        //convert
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            sb.append(s.charAt(i)-'a'+1);
        }
        //the k operator
        for(int i=0;i<k;i++){
            int sum=0;
            for(int j=0;j<sb.length();j++){
                sum += sb.charAt(j)-'0';
            }
            sb = new StringBuilder(Integer.toString(sum));
        }
        return Integer.parseInt(sb.toString());
    }
    //Solution 2:Best
    public int sum(int a){
        int s=0;
        while(a>0){
            s+=a%10;
            a=a/10;
        }
        return s;
    }
    public int transform(int a,int k){
        int temp=a;
        while(k>0){
            temp=sum(temp);
            k--;
        }
        return temp;
    }
    public int getLucky2(String s, int k) {
        int ans=0;
        for(char ch:s.toCharArray()){
            int a=ch-'a'+1;
            ans+=sum(a);
        }
        return transform(ans,k-1);
    }
}
