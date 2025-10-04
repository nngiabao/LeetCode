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
        List<Integer> list = new ArrayList<>();
        while(!stack_1.isEmpty() || !stack_2.isEmpty()){
            int val_1 = stack_1.isEmpty() ? 0 : stack_1.pop();
            int val_2 = stack_2.isEmpty() ? 0 : stack_2.pop();
            int sum = val_1 + val_2;
            int carry = sum/10;

        }
        //build the linked list
        return newList.next;
    }
}
