package LinkedList;

public class LinkedListCycle2_142 {
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode detectCycle(ListNode head) {
        //
        ListNode slow = head;
        ListNode fast = head;
        int index =0;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            //if detect cycle we have to find the start
            if(slow == fast){
                ListNode ptr = head;
                while(ptr != slow) {
                    ptr = ptr.next;
                    slow = slow.next;
                }
                return ptr;
            }
        }
        return null;
    }
}
