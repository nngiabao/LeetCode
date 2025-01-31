package LinkedList;

public class AddTwoNumbers_2 {
    public static void main(String[] args) {

    }

    //Solution 1
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(-1);
        ListNode curr = result;
        //browse 2 list
        while(l1 != null && l2 != null) {
            curr.next.val = l1.val+l2.val;
            l1 = l1.next;
            l2 = l2.next;
        }
        curr = curr.next ;
        //sum remain node
        if(l1 == null) {
            curr.next = l2;
        }else{
            curr.next = l1;
        }
        return result.next;
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
}
