package LinkedList;

public class AddTwoNumbers_2 {
    public static void main(String[] args) {

    }

    // Definition for singly-linked list.
    public static class ListNode {
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

    //Solution 1
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(-1);
        ListNode curr = result;
        //browse 2 list
        int carry = 0;
        while(l1 != null || l2 != null || carry != 0) {
            int l1_val = l1 == null ? 0 : l1.val;
            int l2_val = l2 == null ? 0 : l2.val;
            int sum = l1_val+l2_val+carry;
            carry = sum/10;
            curr.next = new ListNode(sum%10);
            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;
            curr = curr.next;
        }
        return result.next;
    }

}
