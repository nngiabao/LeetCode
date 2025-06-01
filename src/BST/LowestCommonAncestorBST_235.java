package BST;

import java.util.Stack;

public class LowestCommonAncestorBST_235 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null) return null;
        int p_val = p.val;
        int q_val = q.val;
        //
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        //
        while(!stack.isEmpty()){
            TreeNode curr = stack.pop();
            int node_val = curr.val;
            if(node_val == p_val || node_val == q_val){
                if(curr.left != null){
                    if(curr.left.val == p_val || curr.left.val == q_val) return curr;
                    stack.push(curr.left);
                }
                if(curr.right != null){
                    if(curr.right.val == p_val || curr.right.val == q_val) return curr;
                    stack.push(curr.right);
                }
            }else{
                int right_val=0,left_val;
                if(curr.left != null && curr.right != null)
                    right_val = curr.right.val;
                    left_val = curr.left.val;
                    if((left_val == q_val && right_val ==p_val)
                            || (left_val == p_val && right_val==q_val))
                        return curr;
                if(curr.left != null) stack.push(curr.left);
                if(curr.right != null) stack.push(curr.right);
            }
        }
        return null;
    }
}
