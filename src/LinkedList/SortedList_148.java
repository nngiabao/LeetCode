package LinkedList;

import java.util.*;

public class SortedList_148 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) return head;

        // 1. Copy values into a list
        List<Integer> values = new ArrayList<>();
        ListNode curr = head;
        while (curr != null) {
            values.add(curr.val);
            curr = curr.next;
        }

        // 2. Sort
        Collections.sort(values);

        // 3. Copy values back into linked list
        curr = head;
        int i = 0;
        while (curr != null) {
            curr.val = values.get(i++);
            curr = curr.next;
        }

        return head;
    }

    //Solution 2:quick sort
    public ListNode sortList2(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode listNode = new ListNode(-1);
        //put it into arrays
        ListNode dummy = listNode;
        ListNode current = head;
        List<Integer> list = new ArrayList<>();
        while (current != null) {
            list.add(current.val);
            current = current.next;
        }
        //
        Collections.sort(list);
        for (int num : list) {
            dummy.next = new ListNode(num);
            dummy = listNode.next;
        }
        return listNode.next;
    }

    //Solution 3:(best) Using merge-sort for link list
    public ListNode sortList3(ListNode head) {
        if (head == null || head.next == null) return head;

        // Step 1: Split the list into halves using slow and fast pointers
        ListNode mid = getMid(head);
        ListNode left = sortList(head);
        ListNode right = sortList(mid);

        // Step 2: Merge the sorted halves
        return merge(left, right);
    }

    // Helper to split the list and return the start of the second half
    private ListNode getMid(ListNode head) {
        ListNode slow = head, fast = head, prev = null;
        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        if (prev != null) prev.next = null; // Cut the list in half
        return slow;
    }

    // Helper to merge two sorted linked lists
    private ListNode merge(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;

        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                tail.next = l1;
                l1 = l1.next;
            } else {
                tail.next = l2;
                l2 = l2.next;
            }
            tail = tail.next;
        }

        tail.next = (l1 != null) ? l1 : l2;
        return dummy.next;
    }

}
