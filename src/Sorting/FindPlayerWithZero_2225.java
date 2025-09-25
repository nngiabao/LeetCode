package Sorting;

import java.util.*;

public class FindPlayerWithZero_2225 {
    public List<List<Integer>> findWinners(int[][] matches) {
        Map<Integer, Integer> losses = new HashMap<>();

        for (int[] match : matches) {
            int winner = match[0], loser = match[1];
            losses.putIfAbsent(winner, 0);
            losses.put(loser, losses.getOrDefault(loser, 0) + 1);
        }

        List<Integer> zeroLoss = new ArrayList<>();
        List<Integer> oneLoss = new ArrayList<>();

        for (Map.Entry<Integer, Integer> entry : losses.entrySet()) {
            if (entry.getValue() == 0) zeroLoss.add(entry.getKey());
            else if (entry.getValue() == 1) oneLoss.add(entry.getKey());
        }

        Collections.sort(zeroLoss);
        Collections.sort(oneLoss);

        return Arrays.asList(zeroLoss, oneLoss);
    }
}
