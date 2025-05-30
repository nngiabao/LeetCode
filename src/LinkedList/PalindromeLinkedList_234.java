package LinkedList;

public class PalindromeLinkedList_234 {

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

    //Solution 1:bad
    public boolean isPalindrome(ListNode head) {
        ListNode p_head = head;
        ListNode curr = head;
        //find temp array
        StringBuilder sb = new StringBuilder();
        while(head != null){
            sb.append(head.val);
            head = head.next;
        }
        //
        int i = sb.length() - 1;
        while(curr != null){
            if(sb.charAt(i)-'0' != curr.val) return false;
            curr = curr.next;
            i--;
        }
        return true;
    }
    //SOlution 2:
}
