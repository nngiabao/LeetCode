package String;

public class ExcelSheetColumnTitle_168 {
    public static void main(String[] args) {
        System.out.println(convertToTitle(52));
    }

    public static String convertToTitle(int columnNumber) {
        StringBuilder title = new StringBuilder();
        while (columnNumber > 0) {
            columnNumber -=1;// because 0 is A but in this is 1 so like 171 every loop we +1 so this one is go bardward
            title.append ((char)(columnNumber % 26 + 'A'));
            columnNumber /= 26;
        }
        return title.reverse().toString();
    }
}
