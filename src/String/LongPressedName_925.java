package String;

public class LongPressedName_925 {
    public static void main(String[] args) {
        LongPressedName_925 a = new LongPressedName_925();
        String name = "vtkgn";
        String str = "vttkgnn";
        System.out.println(a.isLongPressedName(name,str));;
    }

    public boolean isLongPressedName(String name, String typed) {
        int name_len = name.length();
        int type_len = typed.length();
        if (name_len > type_len) return false;
        if(name.charAt(0) != typed.charAt(0)) return false;
        int i=1,j=1;
        while(i<name_len && j<type_len) {
            char c_name = name.charAt(i);
            char c_typed = typed.charAt(j);
            if(c_name!=c_typed){
                if(c_typed == typed.charAt(j-1)) j++;
                else return false;
                //if(c_name!=typed.charAt(j)) return false;
            }else{
                i++;
                j++;
            }
        }
        //check the rest of typed
        while(j<type_len) {
            if(typed.charAt(j) != typed.charAt(j-1)) return false;
            j++;
        }
        return true;
    }
}
