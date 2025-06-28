# LeetCode Notes & Java Reference Guide

This is a comprehensive personal reference for solving LeetCode problems, covering essential concepts, algorithms, and Java techniques. Topics include bitwise operations, dynamic programming, string processing, tree/graph traversal, and more.

---

## 🧠 Topics Covered

### 🔢 Bitwise Operations

- `~`: Bitwise NOT (complement)
- `&`: Bitwise AND
- `^`: XOR – often used to detect duplicates  
  - Example:  
    - `0 ^ 1 = 1`,  
    - `0 ^ 1 ^ 1 = 0`,  
    - `0 ^ 1 ^ 0 ^ 2 ^ 1 = 2`

### 🔢 Integer Overflow in Java

Java `int` cannot exceed `Integer.MAX_VALUE`. Always check for overflow **before** risky operations:

```java
if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE/10 && pop > 7)) return 0;
if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE/10 && pop < -8)) return 0;
```

### 🔍 Finding Odd or Even

Use bitwise `&` instead of `%` for performance:
```java
if ((num & 1) == 0) // even
```

---

## 🗳️ Boyer-Moore Voting Algorithm

- Works when element appears more than `⌊n / 2⌋`
- Use `candidate` and `count` tracking
- Time: `O(n)`, Space: `O(1)`

---

## 🔁 Circular Structures

For circular arrays or strings, simulate looping using:
- Modulo indexing  
- Doubling the array

---

## 📊 Prefix Sum

Used for range sum queries and interval problems.

---

## 📐 Monotonic Stack

Used for problems involving "next greater" or "previous smaller" elements.

---

## 👯 Two-Pointers

Used for:
- Sorting
- Finding pairs/triplets
- Linked list manipulation

---

## 🔤 String Handling in Java

### Regular Expressions (Regex)
- Only alphabets: `[^a-zA-Z]+`
- Only digits: `\d+`
- Java regex resources:
  - Word-only
  - Digit-only
  - Token splitting

### KMP Algorithm
Used for substring search with prefix table (LPS array).

### Sorting Characters
1. Convert to array, use `Arrays.sort()`
2. Java 8+ Streams:
   ```java
   String sorted = str.chars()
                      .sorted()
                      .mapToObj(c -> String.valueOf((char)c))
                      .collect(Collectors.joining());
   ```

---

## 🔗 Linked List

### Find Middle Node
Use two pointers:  
- `slow` moves by 1  
- `fast` moves by 2

When `fast` reaches end, `slow` is at middle.

---

## 🌳 Binary Search Tree (BST)

### 1D <=> 2D Conversion

- 1D to 2D:
  ```java
  int row = i / columns;
  int col = i % columns;
  matrix[row][col] = arr[i];
  ```
- 2D to 1D:
  ```java
  int index = row * columns + col;
  ```

---

## 🧮 Dynamic Programming

1. Bottom-up (Tabulation)
2. Top-down (Memoization)

---

## 🧠 Bit Masking

- Use bits of an integer to represent subsets
- Useful for `n <= 20`

---

## 🌲 Binary Tree

Traversal techniques:
- BFS (Queue)
- DFS (Recursion/Stack)

---

## 🔍 Sliding Window

Ideal for problems involving:
- Subarrays
- Contiguous sequences

---

## 🐢 Tortoise and Hare Algorithm

Used to detect cycles in linked lists or arrays.

---

## 🛷 Heap (Priority Queue)

### Min Heap:
```java
PriorityQueue<Integer> pq = new PriorityQueue<>();
```

### Max Heap:
```java
// Method 1
PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
// Method 2
PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);
```

---

## 🔺 PriorityQueue with Custom Class

If using a class like `Pair`, define a comparator:
```java
PriorityQueue<Pair> pq = new PriorityQueue<>(
  (a, b) -> a.value == b.value
            ? Integer.compare(a.index, b.index)
            : Integer.compare(a.value, b.value)
);
```

---

## 🔢 DFS (Depth-First Search)

1. Recursion
2. Explicit Stack

---

## 🧮 Math

### 1. Inclusion-Exclusion Principle
Used in combinatorics for counting overlapping sets.

### 2. Catalan Numbers
Used in counting:
- Valid parentheses
- Unique BSTs
- Polygon triangulations

---

## 📌 Extra Notes

- HashMap/HashSet for duplicates
- Streams for converting data types (`Integer` to `int`, etc.)

---

## 📸 Screenshots & Diagrams

(Include your uploaded diagrams locally or via GitHub Issues/Assets if publishing.)

---

## 🛠 Tech Stack

- Java 8+
- LeetCode practice

---

## 📚 License

This is a personal study reference. Free for educational use.
