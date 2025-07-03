package String;

public class GoalParserInterpretation_1678 {
    public String interpret(String command) {
        //
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < command.length()) {
        }
        char c = command.charAt(i);
        if (c == 'G') {
            sb.append('G');
            i++;
        } else if (c == '(' && command.charAt(i + 1) == 'a') {
            sb.append("al");
            i+=4;
        } else {
            sb.append('o');
            i+=2;
        }
        return sb.toString();
    }
}
