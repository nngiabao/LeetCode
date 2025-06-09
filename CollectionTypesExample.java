import java.util.*;

public class CollectionTypesExample {
    public static void main(String[] args) {
        // List Examples
        System.out.println("=== List Examples ===");
        List<String> arrayList = new ArrayList<>();
        arrayList.add("First");
        arrayList.add("Second");
        arrayList.add("First"); // Allows duplicates
        System.out.println("ArrayList: " + arrayList);

        List<String> linkedList = new LinkedList<>();
        linkedList.add("First");
        linkedList.add("Second");
        System.out.println("LinkedList: " + linkedList);

        // Set Examples
        System.out.println("\n=== Set Examples ===");
        Set<String> hashSet = new HashSet<>();
        hashSet.add("First");
        hashSet.add("Second");
        hashSet.add("First"); // Duplicate ignored
        System.out.println("HashSet: " + hashSet);

        Set<String> treeSet = new TreeSet<>();
        treeSet.add("Banana");
        treeSet.add("Apple");
        treeSet.add("Cherry");
        System.out.println("TreeSet (sorted): " + treeSet);

        // Queue Examples
        System.out.println("\n=== Queue Examples ===");
        Queue<String> priorityQueue = new PriorityQueue<>();
        priorityQueue.add("Banana");
        priorityQueue.add("Apple");
        priorityQueue.add("Cherry");
        System.out.println("PriorityQueue: " + priorityQueue);
        System.out.println("Polled element: " + priorityQueue.poll());

        // Map Examples
        System.out.println("\n=== Map Examples ===");
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("One", 1);
        hashMap.put("Two", 2);
        hashMap.put("Three", 3);
        System.out.println("HashMap: " + hashMap);

        Map<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Three", 3);
        treeMap.put("One", 1);
        treeMap.put("Two", 2);
        System.out.println("TreeMap (sorted by keys): " + treeMap);

        // Deque Example
        System.out.println("\n=== Deque Example ===");
        Deque<String> arrayDeque = new ArrayDeque<>();
        arrayDeque.addFirst("First");
        arrayDeque.addLast("Last");
        arrayDeque.addLast("End");
        System.out.println("ArrayDeque: " + arrayDeque);
        System.out.println("First element: " + arrayDeque.getFirst());
        System.out.println("Last element: " + arrayDeque.getLast());
    }
} 