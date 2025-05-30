package LinkedList;

public class MidLinkedList_876 {
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

    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        //this method to find midle node
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        //
        ListNode curr = slow;
        while(slow != null){
            slow = new ListNode(curr.val);
            slow = slow.next;
            //slow.next = new ListNode(slow.val);
        }
        return slow;
    }
}
