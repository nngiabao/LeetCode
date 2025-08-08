package BinaryTree;

public class CapacityShipPackages_1011 {
    public int shipWithinDays(int[] weights, int days) {
        int left = 0, right = 0;
        // Initial capacity bounds
        for (int w : weights) {
            left = Math.max(left, w);   // max single weight (min capacity)
            right += w;                 // total weight (max capacity)
        }
        // Binary Search to find the minimum possible capacity
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (canShip(weights, days, mid)) {
                right = mid; // try smaller capacity
            } else {
                left = mid + 1; // need more capacity
            }
        }
        return left;
    }
    // Helper function to check if we can ship with given capacity
    private boolean canShip(int[] weights, int days, int capacity) {
        int currentLoad = 0;
        int requiredDays = 1;
        for (int w : weights) {
            if (currentLoad + w > capacity) {
                requiredDays++;
                currentLoad = 0;
            }
            currentLoad += w;
        }
        return requiredDays <= days;
    }
}
