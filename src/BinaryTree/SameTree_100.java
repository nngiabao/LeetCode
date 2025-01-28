package BinaryTree;

import java.util.Stack;

public class SameTree_100 {
    //Solution 1
    //using queue or stack - BFS
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if(p == null || q == null) return false;
        Stack<TreeNode> stack1 = new Stack<>(); // stack for tree 1
        Stack<TreeNode> stack2 = new Stack<>(); // stack for tree 2
        stack1.push(p);
        stack2.push(q);

        while(!stack1.isEmpty()){
            TreeNode cur = stack1.pop();
            TreeNode cur2 = stack2.pop();
            if(cur.val != cur2.val) return false;
            //check left
            //if we do like this
            //if both null => no check
            //if 1 null => false
            //if we do in normal way even 2 trees have same null node will be null
            if(cur.left != null || cur2.left != null) {
                if(cur.left == null || cur2.left == null) stack1.push(cur.left);
                stack1.push(cur.left);
                stack2.push(cur2.left);
            }
            //check right
            if(cur.right != null || cur2.right != null) {
                if(cur.right == null || cur2.right == null) return false;
                stack1.push(cur.right);
                stack2.push(cur2.right);
            }
        }
        //check if 2 tree visted every node
        return stack1.isEmpty() && stack2.isEmpty();
    }

    //Solution 2
    // DFS - recursion
    public boolean isSameTree2(TreeNode p, TreeNode q) {
        if(p == null && q == null) return true;
        if(p == null || q == null) return false;
        if(p.val != q.val) return false;
        return isSameTree2(p.left,q.left) && isSameTree2(p.right,q.right);
    }

    public class TreeNode {
        int val;
        public TreeNode left;
        public TreeNode right;

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
}
