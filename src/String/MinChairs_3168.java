package String;

public class MinChairs_3168 {
    public int minimumChairs(String s) {
        int maxChairs = 0;
        int avaiableChairs = 0;
        for (char c : s.toCharArray()) {
            if (c == 'E') {
                if (avaiableChairs == 0) {
                    maxChairs++;
                } else avaiableChairs--;
            } else {
                avaiableChairs++;
            }
        }
        return maxChairs;
    }
}
