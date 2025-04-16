package BST;

import java.util.Stack;

public class RangeSumBST_938 {
    public static void main(String[] args) {

    }

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

    public int rangeSumBST(TreeNode root, int low, int high) {
        int sum=0;
        if(root==null) return sum;
        TreeNode cur = root;
        Stack<TreeNode> stack = new Stack<>();
        while(cur != null || !stack.isEmpty()){
            //in-order BST
            //move the most far left
            while (cur != null){
                stack.push(cur);
                cur = cur.left;
            }
            cur = stack.pop();
            //check if pre != null => the last node
            Integer val = cur.val;
            if(val > high) return sum;
            else if(val >= low && val  <= high) sum+=val;

            cur = cur.right;//move to the right
        }
        return sum;
    }
}
