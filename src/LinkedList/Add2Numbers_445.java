package LinkedList;

import java.util.*;

public class Add2Numbers_445 {
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

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //put into stack
        ListNode pointer_1 = l1;
        ListNode pointer_2 = l2;
        Stack<Integer> stack_1 = new Stack<>();
        Stack<Integer> stack_2 = new Stack<>();
        //
        while(pointer_1 != null){
            stack_1.push(pointer_1.val);
            //MOVE TO NEXT
            pointer_1 = pointer_1.next;
        }
        //
        while(pointer_2 != null){
            stack_2.push(pointer_2.val);
            pointer_2 = pointer_2.next;
        }
        ListNode newList = new ListNode(0);
        ListNode pointer_new = newList;
        List<Integer> list = new ArrayList<>();
        int carry =0;
        while(!stack_1.isEmpty() || !stack_2.isEmpty() || carry != 0){
            int val_1 = stack_1.isEmpty() ? 0 : stack_1.pop();
            int val_2 = stack_2.isEmpty() ? 0 : stack_2.pop();
            int sum = val_1 + val_2+carry;
            carry = sum/10;
            list.add(sum%10);
        }
        //build the linked list
        for (int i=list.size()-1;i>=0;i--) {
            pointer_new.next = new ListNode(list.get(i));
            pointer_new = pointer_new.next;
        }
        return newList.next;
    }
    //Solution 2:
    public ListNode addTwoNumbers2(ListNode l1, ListNode l2) {
        ListNode l1_rev = rev(l1);
        ListNode l2_rev = rev(l2);
        int carry = 0;
        ListNode newList = null;
        while(l1_rev != null || l2_rev != null || carry > 0){
            //
            if(l1_rev != null){
                carry += l1_rev.val;
                l1_rev = l1_rev.next;
            }
            //
            if(l2_rev != null){
                carry += l2_rev.val;
                l2_rev = l2_rev.next;
            }
            ListNode n = new ListNode(carry % 10);
            carry /= 10;
            n.next = newList;
            newList = n;
        }

        return newList;
    }

    private ListNode rev(ListNode l){
        ListNode prev = null;
        while(l != null){
            ListNode t = l.next;
            l.next = prev;
            prev = l;
            l = t;
        }
        return prev;
    }
}
