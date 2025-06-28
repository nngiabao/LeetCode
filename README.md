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

![image.png](image%201.png)

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

# **Exercise Note**

1. **2 Sum**
    
    **Description**:
    
    **Solution**:
    
    1. Using brute-force
    2. Using BST to find complement ⇒ O(nlogn)
    
2. **Add 2 Nums (linked list)**
    
    **Description**:
    
    You are given two **non-empty** linked lists representing two non-negative integers. The digits are stored in **reverse order**, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
    
    You may assume the two numbers do not contain any leading zero, except the number 0 itself.
    
    **Solution**:
    
    - We keep going until list 1 and list 2 are both null and carry ≠ 0
    - if list 1 ≠ null ⇒ val_list1 = list1.val , if not, val_list1= 0
    - if list 2 ≠ null ⇒ val_list2 = list2.val , if not, val_list2= 0
    - sum = val_list1 + val_list2 + carry ;
    - create new node which value = sum %10
    - carry = sum/10
    - return **the head of new list .next**
3. **Longest Substring Without Repeating Characters**
    
    **Description**:
    
    Given a string `s`, find the length of the **longest** **substring** without duplicate characters.
    
    **Solution**:
    
    - Using List
    - Keep checking sub string whenever encounter duplicate

1. **Longest Palindromic Substring (DP, 2 pointers) - not done**
    
    **Description**: 
    
    Given a string `s`, return *the longest* *palindromic* *substring* in `s`.
    
    **Solution**:
    
    1. Using 2 pointers
    
    6 
    
2. empty
3. **Reverse Integer**
    
    **Description**:
    
    Given a signed 32-bit integer `x`, return `x` *with its digits reversed*. If reversing `x` causes the value to go outside the signed 32-bit integer range `[-231, 231 - 1]`, then return `0`.
    
    **Assume the environment does not allow you to store 64-bit integers (signed or unsigned).**
    
    **Solution**:
    
    1. Using String to reverse (only if test case input is small)
    2. Using math
        
        We 
        
4. empty
5. empty
6. empty
7. **Container With Most Water**
    
    **Description**:
    
    You are given an integer array `height` of length `n`. There are `n` vertical lines drawn such that the two endpoints of the `ith` line are `(i, 0)` and `(i, height[i])`.
    
    Find two lines that together with the x-axis form a container, such that the container contains the most water.
    
    Return *the maximum amount of water a container can store*.
    
    **Notice** that you may not slant the container.
    
    **Solution**:
    
    1. We using 2 pointers and Greedy algo
        
        We use 2 pointer **left** and **right from 2 bounds**
        
        we move the pointer whose value less than another
        
        while moving pointers we count area assign to **max**
        
        when pointer left across right ⇒ return **max**   
        
         
        
8. **Integer to Roman**
    
    **Description:** convert from Integer to Roman
    
    Solution:
    
    1. Using Hashmap
        1. We keep iterating the map which stores value of Roman character
    2. Using 2D array to store
9. **Roman to Integer**
    
    **Description**: convert from Roman to Integer ( reverse version of 12)
    
    **Solution**: 
    
    Scan from the right to left
    
    If the previous larger than the current ⇒ we add it
    
    if the previous is smaller or equal to the current ⇒ we subtract it
    
10. 
11. 3 Sum
    
    Description: 
    
    Given an integer array nums, return all the triplets `[nums[i], nums[j], nums[k]]` such that `i != j`, `i != k`, and `j != k`, and `nums[i] + nums[j] + nums[k] == 0`.
    
    Notice that the solution set must not contain duplicate triplets.
    
    Solution:
    We have to have 2 loop
    
    and list of hash set to
    
    1. Using 2 pointers
        
        This is pseudocode
        
        ![image.png](image%2013.png)
        

1. empty
2. empty
3. **4 Sum**
    
    **Description**:
    
    Given an array `nums` of `n` integers, return *an array of all the **unique** quadruplets* `[nums[a], nums[b], nums[c], nums[d]]` such that:
    
    - `0 <= a, b, c, d < n`
    - `a`, `b`, `c`, and `d` are **distinct**.
    - `nums[a] + nums[b] + nums[c] + nums[d] == target`
    
    You may return the answer in **any order**.
    
    **Solution:**
    
    1. Using brute-force (only for small data set)
    2. 
4. **Remove Nth Node From End of List (linked list)**
    
    **Description:**
    
    Given the `head` of a linked list, remove the `nth` node from the end of the list and return its head.
    
    **Solution**:
    
    1. We using 2 pointers
        
        We use **fast** and **slow** pointers
        
        First, we move **fast** pointer until we hit the node we need to remove
        
        Second, start to move **slow** and **fast** pointer at the same time
        
        Until, **fast** pointer = null ⇒ **slow** pointer will hit the node before the removed node
        
        ⇒ Return the [**slow.next.next**](http://slow.next.next) ( because **slow.next** is the removed node )
        
    

21.  **Merge Two Sorted Lists**

1. **Generate Parentheses(not done)**
    
    **Description**:
    
    Given `n` pairs of parentheses, write a function to *generate all combinations of well-formed parentheses*.
    
    **Solution**:
    
    ![image.png](image%2014.png)
    
    From diagram above, we can see left path represent possible one parentheses and right represent possible of right parentheses.
    
    1. Using backtracking
        
        
2. empty
3. **Swap Nodes in Pairs**
    
    **Description**:
    
    Given a linked list, swap every two adjacent nodes and return its head. You must solve the problem without modifying the values in the list's nodes (i.e., only nodes themselves may be changed.)
    
    **Solution**:
    
    1. We use 2 pointers:
        1. dummy pointer (this for wrap error )
        2. prev pointer to point which nodes we are working on it
        
        We keep checking prev[.next](http://pointer.next) and [prev.next.next](http://prev.next.next) (which is 2 adjecent nodes) 
        
4. **Plus One**
    
    Description: Given a large integer represented as integer array The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.
    
    For example: 
    
    - 9 ⇒ [1.0]
    - 123 ⇒ [1,2,4]
    
    Solution:
    
    1. Using ArrayList 
        
        Put into 
        
    2. Create new array if array[0]+1 ==10

26. emp

1. empty
2. empty
3. 4

45. e

1. e
2. P**ermutations II**
    
    **Description**:
    
    Given a collection of numbers, `nums`, that might contain duplicates, return *all possible unique permutations **in any order**.*
    
    **Solution**:
    
    1. Using backtracking
        
        We have to sort array first ⇒ avoid duplicate element
        
        We create boolean[] **isUsed** to track used element ⇒ avoid duplicate
        
        Then we do like normal backtracking but when we remove element ( from going backward) we have to reset **isUsed** array
        
3. e
4. e
5. e
6. e
7. e
8. e
9. e
10. **Jump Game**
    
    **Description**:
    
    You are given an integer array `nums`. You are initially positioned at the array's **first index**, and each element in the array represents your maximum jump length at that position.
    
    Return `true` *if you can reach the last index, or* `false` *otherwise*.
    
    **Solution**:
    
    1. Using greedy
        
        we create maxReach varible to see how far we can jump;
        
        We keep jumping maxReach ⇒ if i+maxReach ≥ n ⇒ return true 
        
        keep 
        
    2. Using DP (not done)
        
        We create dp array with boolean type ( in java,when create boolean variable, default value is **false**)
        
        dp[0] = true; ( always reachable)
        
        So when we jump into **dp[i+j] = true** we skip dp[i] = false ( it means unreachable)
        

61. **Rotate List**

**Description**:

Given the `head` of a linked list, rotate the list to the right by `k` places.
**Solution**:

With this problem we have to find the node of new tail and new head after k rotation

New tail = **(length - k % length-1)**th node

New head = **(length - k % length)**th node 

k = k % length (because it circular

So we follow these steps:

1. Find length of the linked list
2. Make it to be circular linked list
3. Find new tail pointer and make it not to be circular
4. Return to new head.next
1. 
2. empty
3. empty
4. **Reverse Linked List II**
    
    **Description**:
    
    Given the `head` of a singly linked list and two integers `left` and `right` where `left <= right`, reverse the nodes of the list from position `left` to position `right`, and return *the reversed list*.
    
    **Solution**:
    
    We have to follow these steps
    
    1. We create 2 pointers **prev** and **dummy** 
        1. **prev** pointer to points the node that we are working on 
        2. **dummy** pointer always points to head of the list 
    2. We move **prev pointer** to the node left before the **left** indices 
    3. We using Stack to reverse the linked list 
    4. When we pop node from stack we connect to prev pointer
    5. And tail of new linked list to tail pointer
    6. Then we keep moving tail pointer until its null ( because it will be the last node )
    7. Return the [dummny.next](http://dummny.next) ( because dummy pointer points to the head of the linked list)
    
5. **Binary Tree Level Order Traversal**
    
    **Description**:  
    
    Given the `root` of a binary tree, return *the level order traversal of its nodes' values*. (i.e., from left to right, level by level).
    
    **Solution**: 
    
    1. BFS (queue)

94. empty

1. empty

96. **Unique Binary Search Trees(not done)**

**Description**:

Given an integer `n`, return *the number of structurally unique **BST'**s (binary search trees) which has exactly* `n` *nodes of unique values from* `1` *to* `n`.

**Solution**:

1. Catalan Number
2. DP

1. **Validate Binary Search Tree**

**Description**:

Given the `root` of a binary tree, *determine if it is a valid binary search tree (BST)*.

A **valid BST** is defined as follows:

- The left  of a node contains only nodes with keys **less than** the node's key.
    
    subtree
    
- The right subtree of a node contains only nodes with keys **greater than** the node's key.
- Both the left and right subtrees must also be binary search trees.

**Solution**:

1. Using stack
    
    We create 2 pointer **curr which starts from root** and **prev is null**
    
    We keep going to the last left node 
    
    We compare the **curr.val** to **prev.val**
    
    ⇒ if curr.val ≤ prev.val ⇒ return false 
    
    because prev node is the node we travel before which has to be less than the current
    
    We update the prev node to curr node
    
    and the curr node to the curr.right (because we travel left → node → right 
    
    **We keep going until stack is null and curr is null** 
    

99. **Recover Binary Search Tree**

**Description**:

You are given the `root` of a binary search tree (BST), where the values of **exactly** two nodes of the tree were swapped by mistake. *Recover the tree without changing its structure*.

**Solution**:

1. Using DFS ( in-order traversal)
1. empty
2. emptu
3.  **Binary Tree Level Order Traversal**
    
    **Description**:
    
    **Solution**:
    
4. **Binary Tree Zigzag Level Order Traversal**
    
    **Description**:
    
    Given the `root` of a binary tree, return *the zigzag level order traversal of its nodes' values*. (i.e., from left to right, then right to left for the next level and alternate between)
    
    **Solution**: 
    
    1. Using BFS 
    2. Using recursion (not done)
5. emptu
6. empty
7. empty
8. empty
9. **Convert Sorted Array to Binary Search Tree (not done)**
    
    **Description**:
    
    **Solution**:
    

 109. empty

1. empty
2. empty
3. **Path Sum**
    
    **Description**:
    
    **Solution**:
    

112. **Path Sum**

Description: 

Solution 1: DFS

Solution 2: BFS

1. **Populating Next Right Pointers in Each Node**
    
    **Description**:
    
    **Solution**:
    
    1. Using BFS
        
        We create **prev** pointer to point very single line and a **queue** for every level
        
        We check if prev ≠ null ⇒ [prev.next](http://prev.next) = the node which is poped from the queue
        
        If not, prev is **null ⇒ prev points to current node**
        
        Return **root which is the beginning of the tree**
        
    2. Recursion
    
2. **Populating Next Right Pointers in Each Node ( same as 116)**
    
    **Description**:
    
    Populate each next pointer to point to its next right node. If there is no next right node, the next pointer should be set to `NULL`.
    
    Initially, all next pointers are set to `NULL`.
    
    **Solution**:
    
    1. Using BFS 
    2. Recursion
3. empty
4. **Binary Tree Right Side View**
    
    **Description**:
    
    **Solution**:
    
    1. Using BFS
    2. Recursion

134. **Gas Station**

**Description**:

There are `n` gas stations along a circular route, where the amount of gas at the `ith` station is `gas[i]`.

You have a car with an unlimited gas tank and it costs `cost[i]` of gas to travel from the `ith` station to its next `(i + 1)th` station. You begin the journey with an empty tank at one of the gas stations.

Given two integer arrays `gas` and `cost`, return *the starting gas station's index if you can travel around the circuit once in the clockwise direction, otherwise return* `-1`. If there exists a solution, it is **guaranteed** to be **unique**.

**Solution**:

1. Using greedy Algo
    
    We keep going from 0 to n.
    
    If we see negative - which is **gas < cost**  ⇒ start is the next new index
    
    If we cant find any start ⇒ return -1 
    
    Otherwise ⇒ return start
    

136. **Single Number**

**Description**: 

Given a non-empty array of integers, every element appears twice except for one. Find that single one.
**Solution**: Using XOR operation 

1. **Single Number II**
    
    **Description:**
    
    **Solution:**
    
    1. Using 2 pointers
        
        We sort arrays and create **start** pointer
        
        Keep scanning from 0 to n-1
        
        Whenever we scan different num from start ⇒ check the distance 
        
        If distance = 1 ⇒ return this **num[start]**
        
    2. Using bitwise XOR
        
        
2. empty
3. empty
4. **Valid Anagram
Description: Compare 2 string if they are contains same character ⇒ anagram**
    
    **3 Solutions:**
    
    1. **Hash map:**
        
        If 2 string length are not equal ⇒ false ,otherwise, go next step
        
        Put 1 string into hash map then compare to hash map after put another into it ( decrease the frequency of character)
        
    2. **Pointer:**
    Sorting 2 string then using 2 pointer to compare ⇒ if not same, not anagram and vice versa
    3. **Array:**
    - Similar to Hash map but using an array to in put alphabet from ‘a’ to ‘z’ to arrayC
    - To find index of character in the array using  ASCII
    - Put 1 string to array then compare to array after put another into it ( decrease the frequency of character)
    1. **Binary Tree Preorder Traversal**
        
        Description: Given the `root` of a binary tree, return *the preorder traversal of its nodes' values*.
        Solution: stack implement
        
    2. empty
    3. e
    4. e
    5. e
    6. e
    7. e
    8. e
    9. **Maximum Product Subarray ( not done)**
        
        **Description**:
        
        Given an integer array `nums`, find a subarray that has the largest product, and return *the product*.
        
        The test cases are generated so that the answer will fit in a **32-bit** integer.
        
        **Solution**:
        
        1. Using Kadane’s Algorithm
            
            
    10. **Find Minimum in Rotated Sorted Array**
        
        **Description**:
        
        **Solution:**
        
        1. Using BST
            
            We create left and right pointers
            
            if nums[mid] > nums[right] ⇒ the small will be right side
            
            ⇒ Otherwise, the min element will be in the left side
            
    11. **Find Minimum in Rotated Sorted Array**
        
        Description:
        
        Solution:
        
        1. Using BST
            
            Similar to 153 but here we have many duplicates numbers
            
            ⇒ we have to compare nums[mid] to nums[—right] 
            
            ⇒ why ? because when we shrink right pointer until we find non-duplicate number
            
    12. e
    13. e
    14. e
    15. e
    16. e
    17. e
    18. e
    19. e
    20. e
    21. **Maximum Gap**
        
        **Description**:
        
        **Solution**: We sort arrays then compare gap between 2 different numbers 
        
        1. Using built-in sort
        2. Using radix sort(not done)
        
    
    1. **Majority Element**
    Description: Count the major element of array ( if element count > n/2 ⇒ return this element )
    Solutions:
        1. Boyer-Moore Voting Algorithm(best)
        2. Hash Map
        3. Sort array(using stream java 8) then return array[n/2] element because this will be the majority in an array.
        
    
    190. Reverse Bit
    
    Description: 2’s complement to reverse bit
    
    Solution: 
    
    Initialize result variable = 0 ( Bin: 0000 0000)
    
    We extract last bit ( using n & 1 ) 
    
    Add to 
    
    191. **Number of 1 Bits**
    
    Description: Given n ,count number 1-bit 
    Solution: recursion
    
    1. **House Robber**
        
        **Description**:
        
        You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed, the only constraint stopping you from robbing each of them is that adjacent houses have security systems connected and **it will automatically contact the police if two adjacent houses were broken into on the same night**.
        
        Given an integer array `nums` representing the amount of money of each house, return *the maximum amount of money you can rob tonight **without alerting the police***.
        
        **Solution**:
        
        1. Using Bottom-up (Tabulation) 
            
            We create dp array
            
            dp[0] = nums[0] ⇒ first house
            
            dp[1] = max(nums[0],nums[1]) ⇒ we have to choose which house we should start
            
            dp[i] ( where i starts from 2) = max(nums[i]+dp[i-2],dp[i-1])
            
            ⇒ because we cant choose adjacent house so we have to choose to rob the next 2 houses or keep the house next to it
            
            ⇒ return dp[n] where n is total number of houses
            
    
    201. **Bitwise AND of Numbers Range**
    
    1. Happy Number
        
        Description: starting with positive number then replace it as sum of the squares of its digits. Repeating the process until 1
        
        Solution: Using set to check if it is cycle ⇒ return false
        
        if not ⇒ return true
        
    
    205. **Isomorphic Strings**
    
    Description: Given 2 strings ( same length) .Two strings s and t are isomorphic if the characters in s can be replaced to get t.
    
    Solution:
    
    1. Hash Table
    2. 2 arrays for ASCII table
        1. Create 2 arrays with length is 256 (int[] chars_s and int[] chars_t)
        2. if chars_s[c1] ≠ -1 or chars_t[c2] ≠ -1 (c1 and c2 is character from 2 strings) ⇒ check if 2 characters ⇒ if they are mismatched ⇒ return false 
        3. if not ⇒ add characters into arrays
    1. **Minimum Size Subarray Sum**
        
        **Description**:
        
        Given an array of positive integers `nums` and a positive integer `target`, return *the **minimal length** of a subarray whose sum is greater than or equal to* `target`. If there is no such subarray, return `0` instead.
        
        **Solution:**
        
        1. Prefix sum + BST
            
            We find prefix sum array 
            
            Using BST to find **start** indices
            
            (first edge case) if start is the last num and presum[start] < target ⇒ return 0
            
            We keep scanning prefix sum array 
            
            If min length sub array = 1 ⇒ return 1 (edge case)
            
            ⇒ return **min**
            
        2. Using sliding window
    2. e
    
    1. **Kth Largest Element in an Array**
        
        **Description**:
        
        Given an integer array `nums` and an integer `k`, return *the* `kth` *largest element in the array*.
        
        Note that it is the `kth` largest element in the sorted order, not the `kth` distinct element.
        
        **Solution**:
        
        1. Because without sorting ⇒ we have to use priority queue
    2. empty
    3. **Contains Duplicate** 
        
        Description: 
        
        Solution:
        
        1. Hash set 
            
            We browse the loop if element in a set ⇒ return true
            
            If not ⇒ put into a set
            
        2. Insertion Sort 
            
            (This one has O(n^2) but faster than first solution )
            
            While sort the array we can find duplicate 
            
    4. **Contains Duplicate II**
        
        Description:
        
        Solution:
        
        1. **Hash map** (this one slower than using hash set)
            - We create hash map to store last index of that number
            - if index of the duplicated number  - index of the stored one in hash map ≤ k ⇒ true
            
            .if not ⇒ false
            
        2. **Hash set**( best i guess)
            
            We use hash set here because time complexity of retrieve element in hash set is O(1) which is really fast.
            
            we check if size of hash set > k ⇒ remove element at i-k where i is index of that number (why we remove this number ? ⇒ because it is out of the range (i-j > k where j is the previous index of that number ) 
            
            if we find that number in a set ⇒ return true. If not  return false after a loop
            
    
    222. **Count Complete Tree Nodes**
    
    1. e
    2. e
    3. e
    4. **Kth Smallest Element in a BST**
        
        **Description**:
        
        Given the `root` of a binary search tree, and an integer `k`, return *the* `kth` *smallest value (**1-indexed**) of all the values of the nodes in the tree*.
        
        **Solution**:
        
        1. Using stack
            
            We using in-order traversal BST
            
            Whenever we travel we increase **count by 1 until count == k**
            
            ⇒ Return that node ‘s value
            
    5. **Palindrome Linked List (linked list)**
        
        **Description**:
        
        Given the `head` of a singly linked list, return `true` *if it is a palindrome or* `false` *otherwise*.
        
        **Solution**:
        
        1. Store into something a check like sb ( slower)
        2. Reverse second half and check with first half
        
    
    238. **Product of Array Except Self**
    
    Description: Given an integer array number, return an array answer such that answer[i] is equal to the product of all the elements of number except number[i].(that number)
    For example:  
    
    - Input: number= [1,2,3,4]
    - Output: [24,12,8,6]
    
    Solution:
    
    We use 2 loop
    
    1 go from left to right to count prefix store in result array 
    
    1 go from right to left to count the final result by multiply suffix to prefix ( which is stored in result array )
    
    1. **Single Number III (not done)**
        
        **Description**:
        
        Given an integer array `nums`, in which exactly two elements appear only once and all the other elements appear exactly twice. Find the two elements that appear only once. You can return the answer in **any order**.
        
        You must write an algorithm that runs in linear runtime complexity and uses only constant extra space.
        
        **Solution**:
        
        1. Using HashSet
            
            We use **a set to store unique num**
            
            ⇒ return this **set after scanning all nums**
            
        2. Using bitwise (not done)
    
    268. **Missing Number ( Similar to 169)**
    
    Description: Given an array containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.
    
    For example array = [3,0,1]⇒ 2 is missing
    
    Solution: 
    
    1. **HashMap(**not recommend**)**
    2. **Using XOR** (bit manipulation)
    We XOR the given array to array ( from 0 to n  where n is the biggest value)
    
    ⇒ it will return missing number 
    
    1. **Perfect Squares**
        
        **Description**:
        
        Given an integer `n`, return *the least number of perfect square numbers that sum to* `n`.
        
        A **perfect square** is an integer that is the square of an integer; in other words, it is the product of some integer with itself. For example, `1`, `4`, `9`, and `16` are perfect squares while `3` and `11` are not.
        
        **Solution**:
        
        1. Using DP
            
            We start from 1 to n ⇒ find any possible perfect square
            
            Then we how m
            
    2. **Word Pattern**
        
        Description: Given a `pattern` and a string `s`, find if `s` follows the same pattern.
        
        - Each letter in `pattern` maps to **exactly** one unique word in `s`.
        - Each unique word in `s` maps to **exactly** one letter in `pattern`.
        - No two letters map to the same word, and no two words map to the same letter.
        
        Solution :
        
        1. Hash map
        2. Using 2 arrays to store
            1. pattern only contains lower-case English letters ⇒ array length is 26
    3. e
    4. e
    5. e
    6. e
    7. e
    8. e
    9. e
    10. e
    11. e
    
    300. **Longest Increasing Subsequence**
    
    **Description**:
    
    Given an integer array `nums`, return *the length of the longest **strictly increasing subsequence***.
    
    **Solution**:
    
    1. Using DP - Bottom-Up (tabulation)
        
        We create **dp** array which store numbers that nums[i] greater than
        
        We use 2 loops
        
        First loop(loop i), we can from 1 to n-1
        
        Second loop(loop j), we scan from 0 to i
        
        ⇒ if **nums[i] > nums[j]** ⇒ we update how many element greater before this **nums[i]**
        
        ⇒ return the max in dp array
        
    2. Using BST to find ( here constraint is small) 
        
        We create **list to store our longest subsequence ( result) - called result**
        
        We scanning the loop from 0 to n-1
        
        Every time we check result ⇒ update the tail
        
        **key point:**
        
        keep the **smallest tail** of an increasing subsequence of length `i+1`.
        
        - If `x` is **greater** than all elements in `tails`, **append** it (you extended the LIS).
        - Else, **replace the first number in tails ≥ x** with x (using binary search).
        
    1.  **Power of Three**
        
        Description: Given an integer n, return true if it is a power of three. Otherwise, return false.
        
    2. **Valid Perfect Square**
        
        **Description**: Given n ⇒ return true if it is perfect square and false if it is not
        
        Solution: using BST
        
    
    334. **Increasing Triplet Subsequence**
    
    **Description**:
    **Solution**:
    
    1. Using DP - Bottom-up
        
        Using this is correct but for small input because time complexity = O(n^2)
        
    2. Using 2 variables(Greedy algo) - O(n)
        
        We create first and second to store first num and second num
        
        We keep scanning from 0 to n-1
        
        If first ≥ nums[i] ⇒ first = nums[i]=first
        
        else if second ≥ nums[i] ⇒ second = nums[i]= second
        
        else (this case when nums[i] > second > first
        
        ⇒ return true
        
        after scanning cannot find ⇒ return false
        
    1. e
    
    345. **Reverse Vowels of a String**
    
    Description: 
    
    Given a string `s`, reverse only all the vowels in the string and return it.
    
    The vowels are `'a'`, `'e'`, `'i'`, `'o'`, and `'u'`, and they can appear in both lower and upper cases, more than once.
    
    Solution:
    
    1. Using stack
    2. Using 2 pointers
    1. empty
    2. **Top K Frequent Elements(Quick select)**
        
        **Description**:
        
        **Solution**:
        
        1. Using hash table
            
            Put all element into hash table and find those who have freq greater or equal k
            
        2. Using priority queue
        
    
    349**. Intersection of Two Arrays** 
    
    1.  **Intersection of Two Arrays II**
    2. **Guess Number Higher or Lower
    Description**: given n and picked number. We will search from 1 to n if:
    n > picked number ⇒ return 
        
        n < picked number ⇒ return 1 
        
        n = picked number ⇒ return 0
        
        ⇒ we return picked number 
        
        Solution: BST (is the best here because it is sorted array)
        
    
    387. **First Unique Character in a String**
    
    Solution 1: using hashmap
    
    Solution 2: check first index and last index. if same ⇒ return this index
    
    1. **Is Subsequence**
        
        Description: Given two strings `s` and `t`, return `true` *if* `s` *is a **subsequence** of* `t`*, or* `false` *otherwise*.
        
        Solution: Using 2 pointers
        
    
    402. **Remove K Digits**
    
    **Description**:
    
    Given string num representing a non-negative integer `num`, and an integer `k`, return *the smallest possible integer after removing* `k` *digits from* `num`.
    
    **Solution**:
    
    1. This is classic monotonic stack + greedy algo
        
        
    
    1.  **Fizz Buzz**
        
        Description: 
        
        - `answer[i] == "FizzBuzz"` if `i` is divisible by `3` and `5`.
        - `answer[i] == "Fizz"` if `i` is divisible by `3`.
        - `answer[i] == "Buzz"` if `i` is divisible by `5`.
        - `answer[i] == i` (as a string) if none of the above conditions are true.
        
        Solution: 
        
        Instead of using ArrayList we should use String[] ⇒ faster 
        
        avoid using operator % , we use counter to check every 3 or 5 times  and 15 times ⇒ faster
        
    2. **Add Strings**
    3. 
    
    404. **Sum of Left Leaves**
    
    Description: Given the `root` of a binary tree, return *the sum of all left leaves.*
    
    Solution:
    
    1. Using stack to implement DFS
        
        -We can use Pair(custom class) to store 2 value: isLeft and TreeNode ⇒ to check is it left leaf or not
        
        -We can also use Stack<Map.Entry<isLeft,TreeNode>> to implement same as custom class.
        
        ![image.png](image%2015.png)
        
    2. Using recursion
    
    1. **Number of Segments in a String**
        
        Description: A **segment** is defined to be a contiguous sequence of **non-space characters**.
        Return number of segments.
        
        Solution: 
        
        1. Using split() method to split String 
            
            Using trim() to cut the whitespace
            
            Using regex “\\s+” to split the string s. “+” means one or more than 1 whitespace
            
    2. **Assign Cookies**
        
        Description:
        
        Solution: 
        1. Using 2 pointers
        
        Sort 2 array then use 2 pointers to check how many children satisfied .
        
    
    441. **Arranging Coins**
    
    **Description**:
    
    **Solution**:
    
    ![image.png](image%2016.png)
    
    1. Using Brute-force
    2. Using BS
        
        We create left = 0 and right = n
        
        we have to find left pointer where mid = k(k+1)/2 ≤ n
        
    
    459. 
    
    Description:
    
    Solution
    
    1. Brute-force (this one some test case cause time limit exceed because of brute force )
    
    substring from 0 to i ( where i is increase until length of string /2 because this is the worst case that we have 2 substring)
    
    using split method if we got nothing ⇒ true (because we remove substring from original one)
    
    1. Using a trick 
    2. Using regex
    1. **Number Complement**
        
        **Description**:
        
        The **complement** of an integer is the integer you get when you flip all the `0`'s to `1`'s and all the `1`'s to `0`'s in its binary representation.
        
        - For example, The integer `5` is `"101"` in binary and its **complement** is `"010"` which is the integer `2`.
        
        Given an integer `num`, return *its complement*.
        
        **Solution**:
        
        1. Using bitwise NOT
    2. Teemo Attacking
        
        Solution: (key points)
        
    - If `timeSeries[i] + duration - 1 < timeSeries[i+1]`, there is **no overlap**, and Ashe remains poisoned for the full `duration`.
    - If `timeSeries[i] + duration - 1 >= timeSeries[i+1]`, the poison effect is **reset**, and we should only count `timeSeries[i+1] - timeSeries[i]` as the additional poisoned time.
    1. M
        
        Description:
        
        The **next greater element** of some element `x` in an array is the **first greater** element that is **to the right** of `x` in the same array.
        
        You are given two **distinct 0-indexed** integer arrays `nums1` and `nums2`, where `nums1` is a subset of `nums2`.
        
        For each `0 <= i < nums1.length`, find the index `j` such that `nums1[i] == nums2[j]` and determine the **next greater element** of `nums2[j]` in `nums2`. If there is no next greater element, then the answer for this query is `-1`.
        
        Return *an array* `ans` *of length* `nums1.length` *such that* `ans[i]` *is the **next greater element** as described above.*
        
        Solution:
        
        1. Using decreasing monotonic stack
            
            We create stack to find next greater element ⇒ we push into map to save it
            
            We using map to has fastest lookup method
            
    2. e
    3. e
    4. e
    5. **Keyboard Row**
        
        **Description**: Return words in given words array if all of letters in that word from same row of American keyboard
        
        Solutions:
        create check method:
        
        1. check first letter of that word 
    
    1. **Find Mode in Binary Search Tree**
        
        **Description**: 
        
        Given the `root` of a binary search tree (BST) with duplicates, return *all the [mode(s)](https://en.wikipedia.org/wiki/Mode_(statistics)) (i.e., the most frequently occurred element) in it*.
        
        If the tree has more than one mode, return them in **any order**.
        
        Assume a BST is defined as follows:
        
        - The left subtree of a node contains only nodes with keys **less than or equal to** the node's key.
        - The right subtree of a node contains only nodes with keys **greater than or equal to** the node's key.
        - Both the left and right subtrees must also be binary search trees.
        
        **Solution**: 
        
        1. Using stack + hashmap ( large space )
        2. Using recursion to search (DFS)
    
    503. **Next Greater Element II**
    
    **Description**:
    
    Given a circular integer array `nums` (i.e., the next element of `nums[nums.length - 1]` is `nums[0]`), return *the **next greater number** for every element in* `nums`.
    
    The **next greater number** of a number `x` is the first greater number to its traversing-order next in the array, which means you could search circularly to find its next greater number. If it doesn't exist, return `-1` for this number.
    
    **Solution**:
    
    509. **Fibonacci Number**
    
    **Description**:
    
    count Fibonacci number
    
    **Solution**: 
    
    1. using recursion
    1. **Find Bottom Left Tree Value**
        
        **Description**:
        
        Given the `root` of a binary tree, return the leftmost value in the last row of the tree.
        
        **Solution**:
        
        1. Using BFS
            
            We keep scanning every level
            
            If we find firstLeft ⇒ move to next one
            
    2. **Longest Uncommon Subsequence I**
        
        **Description**:
        
        Given two strings `a` and `b`, return *the length of the **longest uncommon subsequence** between* `a` *and* `b`. *If no such uncommon subsequence exists, return* `-1`*.*
        
        An **uncommon subsequence** between two strings is a string that is a **subsequence of exactly one of them**.
        
        **Solution**:
        
        - if (a ≠ b) ⇒ return the longest string
        - if( a = b) ⇒ return **-1**
    3. **Find Largest Value in Each Tree Row**
        
        **Description**:
        
        Given the `root` of a binary tree, return *an array of the largest value in each row* of the tree **(0-indexed)**.
        
        **Solution**: 
        
        1. Using BFS
    4. e
    5. e
    6. e
    7. e
    8. e
    9. e
    10. ee
    11. **Continuous Subarray Sum**
        
        Description:
        
        Solution:
        
        1. Using prefix sum(cannot solve for large data set)
            
            Big O is n^2
            
        2. Using modulo
        3. 
    12. e
    13. **Contiguous Array**
    
    560. 
    
    1. Array Partition
        
        Description: Given an integer array `nums` of `2n` integers, group these integers into `n` pairs `(a1, b1), (a2, b2), ..., (an, bn)` such that the sum of `min(ai, bi)` for all `i` is **maximized**. Return *the maximized sum*.
        
        Solution: 
        
        1. Sort array then sum element in even position because its min value in pair (Greedy algorithm)
    
    530. **Minimum Absolute Difference in BST**
    
    **Description**:
    
    Given the `root` of a Binary Search Tree (BST), return *the minimum absolute difference between the values of any two different nodes in the tree*.
    
    **Solution**:
    
    1. Using stack
        
        Keep going as left as possible
        
    
    541. **Reverse String II**
    
    Description: 
    
    Solution:
    
    1. Using built-in function
    2. Using “in-place” method
    
    1.  **Student Attendance Record I**
        
        Description: You are given a string `s` representing an attendance record for a student where each character signifies whether the student was absent, late, or present on that day. The record only contains the following three characters:
        Solution: Using 2 flag to check
        
    
    1. **Reverse Words in a String III**
        
        Description: Given a string `s`, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.
        
        Solution:
        
        1. Using built-in function
            
            We use String Builder to build every word after we split from original string.
            
            We use trim() to remove whitespace
            
        2. Using “Swap in-place” method
            
            We use char array 
            
            When words[i] == s.length() or words[i] == ‘ ‘ we reverse(it means its one word)
            
    
    594. **Longest Harmonious Subsequence**
    
    Description: 
    
    Solution: 
    
    1. Using sliding window
        1. Sorted array first
        2. Using 2 pointers to slide 
        3. if ( num[j] - num[i] > 1) ⇒ move i
        4. if ( num[j] - num[i] == 1) ⇒ update max and move j too
        5. if( num[j] - num[i] == 0 ) just move j
    2. Using hashmap
    1. **Maximum Product of Three Numbers**
        
        **Description**: 
        
        **Solution**:
        
    
    648. **Replace Words**
    
    **Description**:
    
    In English, we have a concept called **root**, which can be followed by some other word to form another longer word - let's call this word **derivative**. For example, when the **root** `"help"` is followed by the word `"ful"`, we can form a derivative `"helpful"`.
    
    Given a `dictionary` consisting of many **roots** and a `sentence` consisting of words separated by spaces, replace all the derivatives in the sentence with the **root** forming it. If a derivative can be replaced by more than one **root**, replace it with the **root** that has **the shortest length**.
    
    Return *the `sentence`* after the replacement.
    
    **Solution**:
    
    1. Using brute-force
    2. Using Trie DSA (not done) - best
        
        
    
    657. **Robot Return to Origin**
    
    **Description**: There is a robot starting at the position `(0, 0)`, the origin, on a 2D plane. Given a sequence of its moves, judge if this robot **ends up at** `(0, 0)` after it completes its moves.
    **Solution**: Brute-force 
    
    We counting move of the robot
    
    if Right move = Left move && Up move = Down move ⇒ return true
    
    if not ⇒ return false;
    
    1. **Maximum Width of Binary Tree**
        
        **Description**:
        
        Given the `root` of a binary tree, return *the **maximum width** of the given tree*.
        
        The **maximum width** of a tree is the maximum **width** among all levels.
        
        The **width** of one level is defined as the length between the end-nodes (the leftmost and rightmost non-null nodes), where the null nodes between the end-nodes that would be present in a complete binary tree extending down to that level are also counted into the length calculation.
        
        It is **guaranteed** that the answer will in the range of a **32-bit** signed integer.
        
        **Solution**:
        
        1. Using BFS
            
            Creating a class Pair which has 2 attr: index and TreeNode
            
            We keep BFS until we scan last level
            
            ⇒ return max width
            
    
    674. **Longest Continuous Increasing Subsequence**
    
    Description: 
    
    1. **Valid Palindrome II
    Description:** Given a string `s`, return `true` *if the* `s` *can be palindrome after deleting **at most one** character from it*.
    
    Solution:
        1. Using recursion
        2. Using 2 pointers:
            
            When we see a[i] ≠ a[j], we skip 1 letter either left or right side.
            
            We keep scanning from that, if we see any a[i] ≠ a[j] ⇒ return false because we can only delete 1 time.
            
    
    696. **Count Binary Substrings ( take a look again**)**
    
    **Description**:
    
    Given a binary string `s`, return the number of non-empty substrings that have the same number of `0`'s and `1`'s, and all the `0`'s and all the `1`'s in these substrings are grouped consecutively.
    
    Substrings that occur multiple times are counted the number of times they occur.
    
    **Solution**:
    
    Count consecutive 0’s or 1’s
    
    Then sum the min of number 0’s and 1’s next to each other
    
    1. **Search in a Binary Search Tree**
        
        **Description**:
        
        You are given the `root` of a binary search tree (BST) and an integer `val`.
        
        Find the node in the BST that the node's value equals `val` and return the subtree rooted with that node. If such a node does not exist, return `null`.
        
        **Solution**:
        
        1. Using stack
        2. Using recursion to find tree(DFS)
        
    
    704. **Binary Search**
    
    **Description**: Given sorted array, finding target number if not ⇒ return -1
    
    **Solution**: using BST
    
    1. **To lower case**
        
        Description: Given a string `s`, return *the string after replacing every uppercase letter with the same lowercase letter*.
        Solution:
        
        1. Using built-in function
        2. Using ASCII table
    
    717. **1-bit and 2-bit Characters**
    
    **Description**:
    
    We have two special characters:
    
    - The first character can be represented by one bit `0`.
    - The second character can be represented by two bits (`10` or `11`).
    
    Given a binary array `bits` that ends with `0`, return `true` if the last character must be a one-bit character.
    
    **Solution**:
    Check last bit: if ≠ 0 ⇒ return false
    
    Check where the last character start:
    
    - if the last character start ≠ last index of array ⇒ return false
    - if not ⇒ return true
    1. **Find Pivot Index**
        
        Description:
        
        Solution: 
        
        1. Prefix sum
            
            We have to create presum array 
            
            We have left sum + right sum = total sum 
            
            ⇒ if ( left sum == right sum ) return i where is the pivot
            
            if not, return **-1;**
            
            Where:
            
            Left sum = presum[i-1]
            
            Right sum = total - presum[i]
            
        2. 
    
    728. **Self Dividing Numbers**
    
    **Description**:
    
    A **self-dividing number** is a number that is divisible by every digit it contains.
    
    - For example, `128` is **a self-dividing number** because `128 % 1 == 0`, `128 % 2 == 0`, and `128 % 8 == 0`.
    
    A **self-dividing number** is not allowed to contain the digit zero.
    
    Given two integers `left` and `right`, return *a list of all the **self-dividing numbers** in the range* `[left, right]` (both **inclusive**).
    
    **Solution**: 
    
    1. Using normal approach(brute-forte)
        
        We go from left ⇒ right
        
        We need method to check if number % all digit == 0
        
        ⇒ add to result
        
    1. **Daily Temperatures
    Description:**
        
        Given an array of integers `temperatures` represents the daily temperatures, return *an array* `answer` *such that* `answer[i]` *is the number of days you have to wait after the* `ith` *day to get a warmer temperature*. If there is no future day for which this is possible, keep `answer[i] == 0` instead.
        
        **Solution**:
        
        1. Using decreasing monotonic stack ⇒ find next greater element
        2. We use Pair(custom class) to store index of the next greater temperature day
        
    2. e
    3. 
    4. e
    5. e
    6. e
    7. e
    8. e
    9. e
    10. **Min Cost Climbing Stairs**
        
        **Description**:
        
        You are given an integer array `cost` where `cost[i]` is the cost of `ith` step on a staircase. Once you pay the cost, you can either climb one or two steps.
        
        You can either start from the step with index `0`, or the step with index `1`.
        
        Return *the minimum cost to reach the top of the floor*.
        
        **Solution**:
        
        1. Using DP (Tabulation)
            
            (This is reverse tabulation)
            
            We create **dp array length = cost+1** 
            
            dp[first step] = cost[cost.length-1] ⇒ because this one is the first step
            
            We start to go from n-2 to 0
            
            dp[i] = cost[i] + min(dp[i+1] and dp[i+2])
            
            ⇒ return min(dp[0],dp[1]) 
            
            (This is tabulation - fastest)
            
            We create **dp array length = cost+1** 
            
            We start with **dp[0] = 0 and dp[1] = 0 (because we can step 1 or 2)**
            
            **This formula:** dp[i] = min(dp[i-1] + cost[i-1], dp[i-2] + cost[i-2])
            
            ⇒ To find the min cost when we step 
            
            ⇒ Return last element of dp ( because this is the last step)
            
    11. **Jewels and Stones**
        
        **Description**:
        
        You're given strings `jewels` representing the types of stones that are jewels, and `stones` representing the stones you have. Each character in `stones` is a type of stone you have. You want to know how many of the stones you have are also jewels.
        
        Letters are case sensitive, so `"a"` is considered a different type of stone from `"A"`.
        
        **Solution**:
        
        1. Using char[] array to retrieve
    
    783. **Minimum Distance Between BST Nodes**
    
    **Description**:
    
    Given the `root` of a Binary Search Tree (BST), return *the minimum difference between the values of any two different nodes in the tree*.
    
    **Solution**:
    
    1. Using stack to implement in-order traversal BST tree
        - Move as far left as possible
        - Put those nodes into the stack
        - Then pop it out
        - Use **prev** variable to store value of the previous node then count the min diff by in-order traversal
    2. Using recursion
    
    796. **Rotate String**
    
    **Description**:
    
    Given two strings `s` and `goal`, return `true` *if and only if* `s` *can become* `goal` *after some number of **shifts** on* `s`.
    
    A **shift** on `s` consists of moving the leftmost character of `s` to the rightmost position.
    
    - For example, if `s = "abcde"`, then it will be `"bcdea"` after one shift.
    
    **Solution**: 
    
    1. Using built-in function(O(n^2) ⇒ bad
        
        Slice the string and shift to the right most until we match **goal** string
        
        if not found ⇒ return false
        
    2. Add String in Java
        
        We can use advantage of String in java that we can add string
        
        For example: 
        
        we have s = “abcde” and goal = “cdeab”
        
        if you add string: s+s = “ab**cdeab**cde” ⇒ you will receive string shift right most 
        
        if new string contains goal ⇒ return true;
        
        if not ⇒ return false;
        
    
    804. **Unique Morse Code Words**
    
    Description:
    
    International Morse Code defines a standard encoding where each letter is mapped to a series of dots and dashes, as follows:
    
    - `'a'` maps to `".-"`,
    - `'b'` maps to `"-..."`,
    - `'c'` maps to `"-.-."`, and so on.
    
    Solution: 
    
    1. Hash map
        
        Using Hash map to store value
        
        Using hash set to find unique string
        
    1. **Largest Sum of Averages ( not done)**
        
        **Description**:
        
        You are given an integer array `nums` and an integer `k`. You can partition the array into **at most** `k` non-empty adjacent subarrays. The **score** of a partition is the sum of the averages of each subarray.
        
        Note that the partition must use every integer in `nums`, and that the score is not necessarily an integer.
        
        Return *the maximum **score** you can achieve of all the possible partitions*. Answers within `10-6` of the actual answer will be accepted.
        
        **Solution**:
        
        1. Using DP + prefix sum (DP 2D array)
    2. **Shortest Distance to a Character** 
        
        Description: 
        
        Given a string `s` and a character `c` that occurs in `s`, return *an array of integers* `answer` *where* `answer.length == s.length` *and* `answer[i]` *is the **distance** from index* `i` *to the **closest** occurrence of character* `c` *in* `s`.
        
        The **distance** between two indices `i` and `j` is `abs(i - j)`, where `abs` is the absolute value function.
        
        Solution:
        
        1. Using 2 pointers, 2 passes
        
    
    830. **Positions of Large Groups**
    
    Description:
    
    In a string `s` of lowercase letters, these letters form consecutive groups of the same character.
    
    A group is considered **large** if it has 3 or more characters.
    
    Return *the intervals of every **large** group sorted in **increasing order by start index***.
    
    Solution: Constant-time char comparison
    
    1. **Buddy Strings**
        
        **Description**:
        
        Given two strings `s` and `goal`, return `true` *if you can swap two letters in* `s` *so the result is equal to* `goal`*, otherwise, return* `false`*.*
        
        Swapping letters is defined as taking two indices `i` and `j` (0-indexed) such that `i != j` and swapping the characters at `s[i]` and `s[j]`.
        
        - For example, swapping at indices `0` and `2` in `"abcd"` results in `"cbad"`.
        
        **Solution**: (This question we can only swap 1 time ⇒ if there are more than 2 mismatched words ⇒ return false)
        
        1. Using Hash map ⇒ too long
        2. Using char [] array to retrieve it 
    2. **Monotonic Array**
        
        Description: 
        
        An array is **monotonic** if it is either monotone increasing or monotone decreasing.
        
        An array `nums` is monotone increasing if for all `i <= j`, `nums[i] <= nums[j]`. An array `nums` is monotone decreasing if for all `i <= j`, `nums[i] >= nums[j]`.
        
        Given an integer array `nums`, return `true` *if the given array is monotonic, or* `false` *otherwise*.
        
        Solution: 
        
        Using 2 flag **isDecreasing** and **isIncreasing** to check what kind of this array.
        
        keep scanning the array. If it is neither **isDecreasing**  nor **isIncreasing**  ⇒ return false
        
        If it is one of them ⇒ return true
        
    
    1. **Smallest Subtree with all the Deepest Nodes ( not done)**
        
        **Description**:
        
        **Solution**:
        
        1. using BFS 
    
    872. **Leaf-Similar Trees**
    
    **Description**:
    
    A **sentence** is a string of single-space separated words where each word consists only of lowercase letters.
    
    A word is **uncommon** if it appears exactly once in one of the sentences, and **does not appear** in the other sentence.
    
    Given two **sentences** `s1` and `s2`, return *a list of all the **uncommon words***. You may return the answer in **any order**.
    
    **Solution**:
    
    1. Using stack
        
        We keep going down when we hit leaf
        
        ⇒ compare 2 leaf 
        
        ⇒ return false if any mismatched
        
    1. **Smallest Subtree with all the Deepest Nodes**
        
        **Description**:
        
        Given the `root` of a binary tree, the depth of each node is **the shortest distance to the root**.
        
        Return *the smallest subtree* such that it contains **all the deepest nodes** in the original tree.
        
        A node is called **the deepest** if it has the largest depth possible among any node in the entire tree.
        
        The **subtree** of a node is a tree consisting of that node, plus the set of all descendants of that node.
        
        **Solution**:
        
        1. Using DFS
        
    2. **Middle of the Linked List** 
        
        **Description**:
        
        Given the `head` of a singly linked list, return *the middle node of the linked list*.
        
        If there are two middle nodes, return **the second middle** node.
        
        **Solution**:
        
        1. Using **fast** and **slow** pointers
    
    1. **Uncommon Words from Two Sentences**
        
        **Description**:
        
        **Solution**:
        
        1. **Using hash map**
            
            We build dictionary for 1st string and 2nd string
            
            We put all unique elements from both dictionary to res array
            
            ⇒ return **res**
            
    2.  **Most Common Word**
    3. fAW
    4. fwa
    5. fwa
    6. fwa
    7. fa
    8. fwa
    9. fwa
    10. fwa
    11. fwa
    12. fwa
    13. fwa
    14. fwa
    15. fwa
    16. faw
    17. **X of a Kind in a Deck of Cards**
        
        Description:
        
        You are given an integer array `deck` where `deck[i]` represents the number written on the `ith` card.
        
        Partition the cards into **one or more groups** such that:
        
        - Each group has **exactly** `x` cards where `x > 1`, and
        - All the cards in one group have the same integer written on them.
        
        Return `true` *if such partition is possible, or* `false` *otherwise*.
        
        Solution:
        
    
    917. 
    
    917. **Reverse Only Letters**
    
    Description: 
    
    Given a string `s`, reverse the string according to the following rules:
    
    - All the characters that are not English letters remain in the same position.
    - All the English letters (lowercase or uppercase) should be reversed.
    
    Return `s` *after reversing it*.
    
    Solution:
    
    1. Using stack
    2. Using 2 pointers
        
        We can use char array or swap in-place
        
        Example of swap letters in-place
        
        **// Swap letters
        char temp = sb.charAt(left);
        sb.setCharAt(left, sb.charAt(right));
        sb.setCharAt(right, temp);**
        
    1. **Sort Array By Parity II**
        
        Description:
        
        Given an array of integers `nums`, half of the integers in `nums` are **odd**, and the other half are **even**.
        
        Sort the array so that whenever `nums[i]` is odd, `i` is **odd**, and whenever `nums[i]` is even, `i` is **even**.
        
        Return *any answer array that satisfies this condition*.
        
        Solution: 
        
    
    1. **Range Sum of BST**
        
        **Description:**
        
        Given the `root` node of a binary search tree and two integers `low` and `high`, return *the sum of values of all nodes with a value in the **inclusive** range* `[low, high]`.
        
        **Solution**: 
        
        1. Using stack to implement in-order traversal BST ( because of increasing order)
    2. **Unique Email Addresses**
        
        **Description**:
        
        Every **valid email** consists of a **local name** and a **domain name**, separated by the `'@'` sign. Besides lowercase letters, the email may contain one or more `'.'` or `'+'`.
        
        - For example, in `"alice@leetcode.com"`, `"alice"` is the **local name**, and `"leetcode.com"` is the **domain name**.
        
        If you add periods `'.'` between some characters in the **local name** part of an email address, mail sent there will be forwarded to the same address without dots in the local name. Note that this rule **does not apply** to **domain names**.
        
        - For example, `"alice.z@leetcode.com"` and `"alicez@leetcode.com"` forward to the same email address.
        
        If you add a plus `'+'` in the **local name**, everything after the first plus sign **will be ignored**. This allows certain emails to be filtered. Note that this rule **does not apply** to **domain names**.
        
        - For example, `"m.y+name@email.com"` will be forwarded to `"my@email.com"`.
        
        It is possible to use both of these rules at the same time.
        
        Given an array of strings `emails` where we send one email to each `emails[i]`, return *the number of different addresses that actually receive mails*.
        
        **Solution**:
        
        1. Using **regex**
        
    
    941. **Valid Mountain Array**
    
    **Description**:
    
    Given an array of integers `arr`, return `*true` if and only if it is a valid mountain array*.
    
    Recall that arr is a mountain array if and only if:
    
    - `arr.length >= 3`
    - There exists some `i` with `0 < i < arr.length - 1` such that:
        - `arr[0] < arr[1] < ... < arr[i - 1] < arr[i]`
        - `arr[i] > arr[i + 1] > ... > arr[arr.length - 1]`
    
    **Solution**:
    
    1. Using Brute-force
        
        We have check if if increase strictly or not ( which means no equal element)
        
    1. **DI String Match**
        
        **Description**:
        
        A permutation `perm` of `n + 1` integers of all the integers in the range `[0, n]` can be represented as a string `s` of length `n` where:
        
        - `s[i] == 'I'` if `perm[i] < perm[i + 1]`, and
        - `s[i] == 'D'` if `perm[i] > perm[i + 1]`.
        
        Given a string `s`, reconstruct the permutation `perm` and return it. If there are multiple valid permutations perm, return **any of them**.
        
        **Solution**: 
        
        1. Using brute-force
            
            We scan from left to right 
            
            We create 2 variables: the **low** and **high**
            
            ⇒ store lowest and highest value left to construct the array
            
            ⇒ the last value of constructed array always **low**
            
    
    944. **Delete Columns to Make Sorted**
    
    **Description**:
    
    You are given an array of `n` strings `strs`, all of the same length.
    
    The strings can be arranged such that there is one on each line, making a grid.
    
    - For example, `strs = ["abc", "bce", "cae"]` can be arranged as follows:
    
    ```
    abc
    bce
    cae
    
    ```
    
    You want to **delete** the columns that are **not sorted lexicographically**. In the above example (**0-indexed**), columns 0 (`'a'`, `'b'`, `'c'`) and 2 (`'c'`, `'e'`, `'e'`) are sorted, while column 1 (`'b'`, `'c'`, `'a'`) is not, so you would delete column 1.
    
    Return *the number of columns that you will delete*.
    
    **Solution**:
    
    1. Using **Brute-force**
        
        We can see this one like **matrix** where **length** str[i] is **n** and n strings is **m**
        
        We check by column 
        
        if `(strs[j].charAt(i) -'a') < (strs[j-1].charAt(i) -'a')` ⇒ **count**++;
        
        return **count**;
        
    2. (better)
    1. **Verifying an Alien Dictionary**
        
        **Description**:
        
        In an alien language, surprisingly, they also use English lowercase letters, but possibly in a different `order`. The `order` of the alphabet is some permutation of lowercase letters.
        
        Given a sequence of `words` written in the alien language, and the `order` of the alphabet, return `true` if and only if the given `words` are sorted lexicographically in this alien language.
        
        **Solution**:
        
        1. Using **Brute-force**
            
            First check the first letter order in alien language or not
            
            ⇒ if not return false
            
            If in same order ⇒ check the length
            
    
    **965. Uni-valued Binary Tree**
    
    Description:
    
    A binary tree is **uni-valued** if every node in the tree has the same value.
    
    Given the `root` of a binary tree, return `true` *if the given tree is **uni-valued**, or* `false` *otherwise.*
    
    Solution:
    
    1. Using stack
    2. Recursion
    1. **Add to Array-Form of Integer**
        
        **Description**:
        
        The **array-form** of an integer `num` is an array representing its digits in left to right order.
        
        - For example, for `num = 1321`, the array form is `[1,3,2,1]`.
        
        Given `num`, the **array-form** of an integer, and an integer `k`, return *the **array-form** of the integer* `num + k`.
        
        **Solution**:
        
        1. Using brute-force
    2. e
    3. e
    4. e
    5. **Cousins in Binary Tree**
        
        **Description**:
        
        Given the `root` of a binary tree with unique values and the values of two different nodes of the tree `x` and `y`, return `true` *if the nodes corresponding to the values* `x` *and* `y` *in the tree are **cousins**, or* `false` *otherwise.*
        
        Two nodes of a binary tree are **cousins** if they have the same depth with different parents.
        
        Note that in a binary tree, the root node is at the depth `0`, and children of each depth `k` node are at the depth `k + 1`.
        
        **Solution**:
        
        1. Using queue(BFS)
            
            Because every node is unique ⇒ if we found x,y has same parrent ⇒ **false**
            
            If we found **x or y** in that level 
            
            If we find both ⇒ return **true**
            
            If not ⇒ return **false**