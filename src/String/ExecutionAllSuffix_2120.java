package String;

public class ExecutionAllSuffix_2120 {
    public int[] executeInstructions(int n, int[] startPos, String s) {
        //n = 3 => the grind 3x3
        int len = s.length();
        int[] res = new int[len];
        for (int i = 0; i < len; i++) {
            int count = 0;
            //check vertical and hortizontal pos
            //v
            int v = startPos[0];
            //h
            int h = startPos[1];
            for (int j = i; j < len; j++) {
                char c = s.charAt(j);
                if (c == 'R' && h + 1 < n) {
                    count++;
                    h++;
                } else if (c == 'L' && h- 1 >= 0) {
                    count++;
                    h--;
                } else if (c == 'D' && v + 1 < n) {
                    count++;
                    v++;
                } else if (c == 'U' && v - 1 >= 0) {
                    count++;
                    v--;
                } else break;
            }
            //put into res
            res[i] = count;
        }
        //
        return res;
    }
}
