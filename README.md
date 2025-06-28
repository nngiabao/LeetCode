# LeetCode

# **Bitwise**

**~ : Bitwise NOT (complement)**

**&: Bitwise AND**

XOR operation (Usually using for check duplicate element)

![image.png](image.png)

For example:

- 0^1 = 0^1 but 0^1^1 = 0
- 0^1^0^2^1 = 2

## Integer in java

- Java int variables can never be greater than Integer.MAX_VALUE by definition.
- Overflow happens silently, so you must check for it **before** the risky operation.

if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE/10 && pop > 7)) return 0;
if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE/10 && pop < -8)) return 0;

## **Finding odd or even**

Using bitwise & (AND) instead of operation % to identify even or odd will be faster

![image.png](image%1.png)

![image.png](image%202.png)

## **Boyer-Moore Voting Algorithm**

Use a counting mechanism to identify a "candidate" that is likely the majority element. 

**Notice: this algorithm works only if the element that appears more than `⌊n / 2⌋` times**

**Steps:**

- We have 2 variable “candidate” and “count” to store value.
- Initialize “candidate” = first element and count = 1;
- Start to browse the array from element 2 to last element
- if array[i] ≠ candidate where i is index start from 1 ⇒ count-=1 ( if count = 0 ⇒ candidate will be array[i] and count = 1) - This step help us find new candidate.
- if count > n/2 ⇒ return this candidate

**Complexity**

- Time: O(n)
- Space: O(1)

# Circular in Array, Linked-list, etc

We can you modulo or create new array with double size(if only repeat 1 time)

⇒ to make it circular

# **Prefix Sum**

# **Monotonic Stack**

![image.png](image%203.png)

# **Two-Pointers**

Using for sorting decreasing order

# String

## **Regex**

**Java regex cheat sheet**

Some common regex

Regex contains only word (a-z and A-Z):  `String regex = "[^a-zA-Z]+";`

Regex contains only digit: 

![image.png](image%204.png)

![image.png](image%205.png)

![image.png](image%206.png)

## **KMP Algorithm**

Join

Using to convert

## **Sorting character in a string**

1. **Sort method for array**
    
    Convert to array then use sort method for array
    
    ![image.png](image%207.png)
    
2. **Using stream(java 8+)**
    
    This one build for java 8+: Stream
    
    ![image.png](image%208.png)
    
    In  descending order 
    
    ![image.png](image%209.png)
    

Some other technique

Find duplicate

Using hash set/hash table

## **Linked-List**

1. To find middle node
    
    We use 2 pointer **slow** and **fast**
    
    When **fast** pointer jumps 2 nodes, the **slow** one jump into 1
    
    ⇒ When **fast** pointer point to null ( which is end of the linked list) , the **slow** one will be at the middle
    

## **BST(Binary Search Tree)**

### **Convert 1D to 2D array and vice versa**

We have general formula:

1. Formula to find index of original row and column 
2. This is 1D to 2D array

row = i / c
col = i % c
matrix[row][col] = arr[i]

1. This is 2D to 1D array

## **Dynamic Programming**

![image.png](image%2010.png)

1. Bottom-up (Tabulation)
2. Top-down (Memorize)

## **Bit masking**

Bitmasking is a technique where we use **bits** of an integer to represent subsets.

For an array of length `n`, every integer from `1` to `2^n - 2` (excluding `0` and `2^n - 1` to avoid empty or full sets) can represent a unique subset.

⇒ **Only for small n (usually ≤ 20 )**

## **Binary Tree**

Some technique to do with Binary Tree

BFS ( Using queue to implement ) 

## **Sliding window**

**useful when dealing with subarrays** and **contiguous sequences**

## **Tortoise and Hare Algorithm**

Usage: when detect cycle

### **Heap**

Using priority queue data structure to implement

Min heap = `PriorityQueue<Integer> pq = new PriorityQueue<Integer>();`

2 ways to reverse priority queue ⇒ to make Max heap

1. Using collections

Max heap = `PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());`

1. Using lambda

Max heap = `PriorityQueue<Integer> pq = new PriorityQueue<Integer>((a, b) -> b - a);`

# **Priority Queue**

**When passing custom parameter - like class Pair in example we have to custom comparator or we have to implement Comparator interface.**

We have class Pair

Example of custom comparator using lambda

![image.png](image%2011.png)

(a, b) ->a.value == b.value ? Integer.compare(a.index, b.index) : Integer.compare(a.value, b.value)

Explain:  

### **Parsing data type Integer to int**

Using stream

### **DFS 
Solution:**

1. Recursion
2. Stack

# **Math**

### **1. Inclusion-Exclusion Principle**

![image.png](image%2012.png)

### **2. Catalan Number**

The **Catalan numbers** are a [sequence](https://en.wikipedia.org/wiki/Sequence) of [natural numbers](https://en.wikipedia.org/wiki/Natural_number) that occur in various [counting problems](https://en.wikipedia.org/wiki/Enumeration), often involving [recursively](https://en.wikipedia.org/wiki/Recursion) defined objects. 

  
