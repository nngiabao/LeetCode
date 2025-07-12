package LinkedList;

public class PartitionList_86 {
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

    public ListNode partition(ListNode head, int x) {
        //2 pointers
        //1 for element less than x
        //1 for elements greater or equal
        //we create a new list
        if (head == null || head.next == null) return head;
        //pointer to point the original list
        ListNode dummy = head;
         //
        ListNode listSmall = new ListNode(0);
        ListNode less = listSmall;
        //new biger list to store the same value
        ListNode listBig = new ListNode(0);
        ListNode greater = listBig;
        //find the first emelent less
       while(dummy != null) {
           int dummyVal = dummy.val;
           if(dummyVal >= x) {
               greater.next = new ListNode(dummyVal);
               greater = greater.next;
           }else{
               less.next = new ListNode(dummyVal);
               less = less.next;
           };
           //move
           dummy = dummy.next;
       }
        //concat 2 list
        greater.next = null; //avoid cycle
        less.next = listBig.next;
        return listSmall.next;
    }
}
