package LinkedList;

public class SplitLinkedListInPart_725 {
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

    //
    public ListNode[] splitListToParts(ListNode head, int k) {
        //find the length
        ListNode curr = head;
        int count = 0;
        while (curr != null) {
            //
            count++;
            curr = curr.next;
        }
        //find the lenght for first and the lenght for the rest
        int len = count/k == 0 ? 1 : count/k;
        int f_len = len+count%k;
        curr = head;
        ListNode[] res = new ListNode[k];
        //fill the first then
        ListNode newList = new ListNode(-1);
        ListNode new_pointer = newList;
        for(int i=0;i<f_len;i++){
            new_pointer = curr.next;
            new_pointer = new_pointer.next;
        }
        res[0] = newList;
        while(curr != null) {
            //
            curr = curr.next;
        }

        return res;
    }
}
