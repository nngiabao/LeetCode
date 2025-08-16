package BinaryTree;

import java.util.*;

public class AllElements_1305 {
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

        public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
            //edge case
            List<Integer> res = new ArrayList<>();
            //iterate tree 1
            //tree 1
            if (root1 != null) {
                Stack<TreeNode> stack_1 = new Stack<>();
                stack_1.push(root1);
                while (!stack_1.isEmpty()) {
                    TreeNode node = stack_1.pop();
                    res.add(node.val);
                    if (node.left != null) {
                        stack_1.push(node.left);
                    }
                    if (node.right != null) {
                        stack_1.push(node.right);
                    }
                }
            }
            //iterate tree 2
            if (root2 != null) {
                Stack<TreeNode> stack_2 = new Stack<>();
                stack_2.push(root2);
                while (!stack_2.isEmpty()) {
                    TreeNode node = stack_2.pop();
                    res.add(node.val);
                    if (node.left != null) {
                        stack_2.push(node.left);
                    }
                    if (node.right != null) {
                        stack_2.push(node.right);
                    }
                }
            }
            //
            Collections.sort(res);// => boolean
            return res;
        }
    }

    //Solution 2:Using in-order
    public List<Integer> getAllElements2(TreeNode root1, TreeNode root2) {
        List<Integer> res = new ArrayList<>();
        //tree 1
        if (root1 != null) {
            Stack<TreeNode> stack_1 = new Stack<>();
        }
        //tree 2
        if (root2 != null) {
            Stack<TreeNode> stack_2 = new Stack<>();
        }
        return res;
    }
}
