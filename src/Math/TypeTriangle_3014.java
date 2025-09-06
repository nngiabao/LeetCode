package Math;

public class TypeTriangle_3014 {
    public String triangleType(int[] nums) {
        // nums has size 3
        int a = nums[0], b = nums[1], c = nums[2];

        // Check if it can form a triangle
        if (a + b <= c || a + c <= b || b + c <= a) {
            return "none";
        }

        // Equilateral: all sides equal
        if (a == b && b == c) {
            return "equilateral";
        }

        // Isosceles: exactly two sides equal
        if (a == b || b == c || a == c) {
            return "isosceles";
        }

        // Scalene: all sides different
        return "scalene";
    }
}
