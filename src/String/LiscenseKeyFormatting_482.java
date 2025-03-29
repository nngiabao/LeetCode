package String;

public class LiscenseKeyFormatting_482 {
    public static void main(String[] args) {
        String a = "5F3Z-2e-9-w";
        System.out.println(licenseKeyFormatting(a,4));

    }
    //Solution 1:Using brute force
    public static String licenseKeyFormatting(String s, int k) {
        //replace original key to non-dash string
        String temp = s.replace("-","");
        //count to know when we put flag
        int count = 0;
        StringBuilder sb = new StringBuilder();
        for(int i=temp.length()-1;i>-1;i--){
            if(count == k){
                sb.append("-");
                count=0;
            }
            sb.append(temp.charAt(i));
            count++;
        }
        return sb.reverse().toString().toUpperCase();
    }
}
