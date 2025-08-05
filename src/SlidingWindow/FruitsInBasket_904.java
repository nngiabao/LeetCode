package SlidingWindow;

import java.util.*;

public class FruitsInBasket_904 {
    public int totalFruit(int[] fruits) {
        Map<Integer, Integer> basket = new HashMap<>();
        int left = 0, maxFruits = 0;

        for (int right = 0; right < fruits.length; right++) {
            // Add current fruit to basket
            basket.put(fruits[right], basket.getOrDefault(fruits[right], 0) + 1);

            // If more than 2 types, shrink from left
            while (basket.size() > 2) {
                basket.put(fruits[left], basket.get(fruits[left]) - 1);
                if (basket.get(fruits[left]) == 0) {
                    basket.remove(fruits[left]);
                }
                left++;
            }
            // Update max length of valid window
            maxFruits = Math.max(maxFruits, right - left + 1);
        }
        return maxFruits;
    }
}
