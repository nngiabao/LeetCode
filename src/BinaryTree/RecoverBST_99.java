package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class RecoverBST_99 {
    //public
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public void recoverTree(TreeNode root) {
        //this one has to be travel left first
        if(root == null) return;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        TreeNode prev = null;
        TreeNode first = null,second = null;
        while(cur != null || !stack.isEmpty()) {
            //travel to the left far most
            while(cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
            //check
            cur = stack.pop();
            if(prev != null && cur.val <= prev.val) {
                //detect 2 wrong nodes
                if(first == null){
                    first = prev;
                    second = cur;
                }else{
                    second = cur;
                }
            }
            //update prev node
            prev = cur;
            //move to right node
            cur = cur.right;
        }
        //found 2 mistake nodes then we have to swap
        if(first != null && second != null){
            int temp = first.val;
            first.val = second.val;
            second.val = temp;
        }
    }
    //SOlution 2
    public void recoverTree2(TreeNode root) {
        if(root == null) return;
        if(root.left != null){
            if(root.left.val > root.val){
                int temp = root.left.val;
                root.left.val = root.val;
                root.val = temp;
            }
            recoverTree2(root.left);
        }
        //swap
        if(root.right != null){
            if(root.right.val < root.val){
                int temp = root.left.val;
                root.left.val = root.val;
                root.val = temp;
            }
            recoverTree2(root.right);
        }
    }


}
