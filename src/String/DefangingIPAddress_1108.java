package String;

public class DefangingIPAddress_1108 {
    //Solution 1:Using replaceAll() and regex
    public String defangIPaddr(String address) {
        //using replace method

        return address.replaceAll("\\.","[.]");
    }
    //Solution 2:Brute-force
    public String defangIPaddr2(String address) {
        StringBuilder res = new StringBuilder();
        for (char ch : address.toCharArray()) {
            if (ch == '.') {
                res.append("[.]");
            } else{
                res.append(ch);
            }
        }
        return res.toString();
    }
}
