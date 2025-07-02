# 👨‍💻 LeetCode Practice Notes

🔗 **My LeetCode Profile**: [nngiabao1904](https://leetcode.com/u/nngiabao1904/)

---

## 📘 About This Repo

This repository contains my notes, visual explanations, and learnings from solving over **600+ LeetCode problems** ranging from fundamental concepts to advanced algorithms.

Working on LeetCode daily has helped me:
- Sharpen problem-solving skills
- Master core data structures and algorithms
- Improve Java proficiency for backend roles
- Build confidence for technical interviews

---

## 📊 Progress Overview
    **Here is some notes that i have made from practicing**
- 🔄 **LeetCode 1–1000**: (https://www.notion.so/LeetCode-1-1000-221e4689b24a80dabf99eee90ec1adfe?source=copy_link)
- 🔄 **LeetCode 1001–2000**: (https://www.notion.so/LeetCode-1001-2000-21ce4689b24a80d1bf9be444aafe0346?source=copy_link)
- 🔄 **LeetCode 2001–3000+**: (https://www.notion.so/LeetCode-2001-3000-21ce4689b24a80bb848fcb889e89c882?source=copy_link)

---

## 🚀 Algorithm Concepts

### 🔧 Bitwise Operations
- `~` → Bitwise NOT (complement)
- `&` → Bitwise AND
- `^` → Bitwise XOR (used to detect duplicates)

![Bitwise XOR](images/image.png)

Examples:
- `0^1 = 1` but `0^1^1 = 0`
- `0^1^0^2^1 = 2`

---

### 🔢 Integer Handling in Java
- Be careful of overflow/underflow:
```java
if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE/10 && pop > 7)) return 0;
```

---

### 🧮 Odd/Even Check via Bitwise
Use `num & 1` instead of `num % 2`

![Check Even or Odd](image%1.png)
![More Examples](image%202.png)

---

### 🗳️ Boyer-Moore Voting Algorithm
Efficient method to find the majority element in O(n) time and O(1) space.

Steps:
- Track `candidate` and `count`
- Switch candidate when count = 0

---

### 🔁 Circular Array / Modulo Technique
Use modulo or double-size arrays to simulate circular behavior.

---

### ➕ Prefix Sum

---

### 🧱 Monotonic Stack
Used for problems with “next greater” or “previous smaller” patterns.

![Monotonic Stack](image%203.png)

---

### 👫 Two Pointers
Efficient for sorted arrays or to find subarrays with specific properties.

---

## 🔤 String Techniques

### ✅ Regex in Java

- Match words only: `[^a-zA-Z]+`
- Match digits:  
  ![Digits Only](image%204.png)

![Regex Sample](image%205.png)  
![More Regex](image%206.png)

---

### 💥 KMP Algorithm
String pattern search using prefix table.

---

### 🔡 Sorting Characters in a String

1. **Using `Arrays.sort()`**
    ![Sort](image%207.png)
2. **Using Stream (Java 8+)**
    ![Stream Sort](image%208.png)
    Descending:  
    ![Descending](image%209.png)

---

## 🧵 Linked List Techniques

### 🧭 Find Middle of Linked List
Use fast and slow pointers — when `fast == null`, `slow` is at the middle.

---

## 🌳 Binary Search Tree (BST)

---

## 🧮 Array Transformations

### Convert 1D ↔ 2D:
```java
// 1D to 2D
row = i / cols;
col = i % cols;

// 2D to 1D
index = row * cols + col;
```

---

## 💡 Dynamic Programming

![DP Types](image%2010.png)

- Top-down (memoization)
- Bottom-up (tabulation)

---

## 🧠 Bit Masking
Use bits to represent subsets. Useful when n ≤ 20.

---

## 🌲 Binary Tree
Use BFS with queue, or DFS with recursion/stack.

---

## 🪟 Sliding Window
Great for contiguous subarrays.

---

## 🐢 Tortoise and Hare (Floyd's Cycle Detection)

---

## ⛰️ Heap / Priority Queue

```java
// Min Heap
PriorityQueue<Integer> pq = new PriorityQueue<>();

// Max Heap (2 ways)
PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
```

---

## 🔁 Priority Queue with Custom Comparator

Example using class `Pair`:
![Comparator Example](image%2011.png)

---

## 🔁 DFS

- Recursive
- Stack-based

---

## 📐 Math

### 1. Inclusion-Exclusion Principle
![Inclusion-Exclusion](image%2012.png)

### 2. Catalan Numbers
Useful in counting valid parenthesis strings, binary trees, etc.

---

## 🙌 Final Note

Solving 600+ problems across all difficulty levels has made me confident in algorithmic thinking, which I apply daily in Java-based backend development.  
I'm open to backend internships and entry-level roles. Let’s connect!

---
