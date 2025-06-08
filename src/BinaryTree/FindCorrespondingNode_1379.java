package BinaryTree;

import java.util.*;

public class FindCorrespondingNode_1379 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    //Solution 1:Using stack
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        if (cloned == null) return null;
        //
        Stack<TreeNode> stack = new Stack<>();
        stack.push(cloned);
        //
        while (!stack.isEmpty()) {
            TreeNode curr = stack.pop();
            if (curr.val == target.val) return curr;
            //
            if (curr.left != null) stack.push(curr.left);
            if (curr.right != null) stack.push(curr.right);
        }
        return null;
    }

    //Solution 2:Using recursion
    public final TreeNode getTargetCopy2(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        return null;
    }
}
