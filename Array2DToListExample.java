import java.util.*;

public class Array2DToListExample {
    public static void main(String[] args) {
        // Sample 2D array
        int[][] array2D = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        System.out.println("Original 2D Array:");
        for (int[] row : array2D) {
            System.out.println(Arrays.toString(row));
        }
        
        // Method 1: Flatten all elements into a single list (most common)
        System.out.println("\n=== Method 1: Flatten to single list ===");
        List<Integer> flattenedList = new ArrayList<>();
        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[i].length; j++) {
                flattenedList.add(array2D[i][j]);
            }
        }
        System.out.println("Flattened List: " + flattenedList);
        
        // Method 2: Enhanced for loop (cleaner syntax)
        System.out.println("\n=== Method 2: Enhanced for loop ===");
        List<Integer> flattenedList2 = new ArrayList<>();
        for (int[] row : array2D) {
            for (int element : row) {
                flattenedList2.add(element);
            }
        }
        System.out.println("Flattened List 2: " + flattenedList2);
        
        // Method 3: Using Java 8 Streams (modern approach)
        System.out.println("\n=== Method 3: Using Streams ===");
        List<Integer> flattenedList3 = Arrays.stream(array2D)
            .flatMapToInt(Arrays::stream)
            .boxed()
            .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
        System.out.println("Flattened List 3: " + flattenedList3);
        
        // Method 4: Row by row (if you want to process each row separately)
        System.out.println("\n=== Method 4: Row by row processing ===");
        for (int i = 0; i < array2D.length; i++) {
            List<Integer> rowList = new ArrayList<>();
            for (int j = 0; j < array2D[i].length; j++) {
                rowList.add(array2D[i][j]);
            }
            System.out.println("Row " + i + ": " + rowList);
        }
        
        // Method 5: Convert each row to List using Arrays.stream
        System.out.println("\n=== Method 5: Convert each row using streams ===");
        for (int i = 0; i < array2D.length; i++) {
            List<Integer> rowList = Arrays.stream(array2D[i])
                .boxed()
                .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
            System.out.println("Row " + i + ": " + rowList);
        }
        
        // Method 6: Specific elements based on condition
        System.out.println("\n=== Method 6: Filter specific elements ===");
        List<Integer> evenNumbers = new ArrayList<>();
        for (int[] row : array2D) {
            for (int element : row) {
                if (element % 2 == 0) {
                    evenNumbers.add(element);
                }
            }
        }
        System.out.println("Even numbers only: " + evenNumbers);
    }
} 