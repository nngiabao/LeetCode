package LinkedList;

import java.util.*;

public class RemoveNodesFromLinkedList_2487 {
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
    //Solution 1: Using stack to build
    public ListNode removeNodes(ListNode head) {
        if (head == null || head.next == null) return null;
        //pointer and new linked list
        Stack<ListNode> stack = new Stack<ListNode>();
        ListNode pointer = head.next;

        //Using monotonic stack
        while (pointer != null) {
            while(!stack.isEmpty()  && pointer.val >= stack.peek().val) {
                stack.pop();
            }
            stack.push(pointer);
            //move the pointer
            pointer = pointer.next;
        }
        //we have the list that we need to delete
        ListNode newList = null;
        while (!stack.isEmpty()) {
            ListNode node = stack.pop();
            node.next = newList;
            newList = node;
        }
        return newList;
    }
    //Solution 2:
}