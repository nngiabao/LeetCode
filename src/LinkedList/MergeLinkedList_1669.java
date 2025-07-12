package LinkedList;

public class MergeLinkedList_1669 {
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

    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        //pointer to point list 1
        ListNode prevA = list1;
        ListNode afterB = list1;
        ListNode prevB = list2;
        //pointer to point list 2
        //move the pointer to the node a
        for(int i=0;i<a-1;i++){
            prevA = prevA.next;
        }
        for(int i= 0;i<=b;i++){
            afterB = afterB.next;
        }
        //
        //move the pointer afterB to b
        while(prevB.next != null){
            prevB = prevB.next;
        }

        prevA.next = list2;
        prevB.next = afterB;
        //concat it
        return list1;
    }
}
