package LinkedList;

public class RemoveLinkedListElement_203 {
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

    public ListNode removeElements(ListNode head, int val) {
        if(head == null) return head;
        //create 1 new list and 2 pointers
        //1 pointer for cur
        ListNode result = new ListNode(); // new list
        result.next = head;
        ListNode cur = head,prev = result; // pointer in list 1

        while(cur != null) {
            if(cur.val == val) {
                prev.next = cur.next; // skip
            }else{
                prev = cur; // move only if element not deleted
            }
            cur = cur.next;
        }
        return result.next;
    }
}
