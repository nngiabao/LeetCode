public class Merge2SortedList_22 {
    public static void main(String[] args) {

    }
    //Solution 1 - w/o recursion
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        //case that 1 list is null => return other list
        if(list1 == null) return list2;
        else if(list2 == null) return list1;

        ListNode result = new ListNode(-1);
        ListNode current = result;
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }

            //attach remain node in list1 or list 2
            if(list1 != null){
                current.next = list1;
            }else{
                current.next = list2;
            }
        return result.next;//return merged linked list
    }

    //Solution 2-recursion

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
