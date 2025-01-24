import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PreorderTraversal_144 {
    public static void main(String[] args) {

    }


    //order
    public List<Integer> preorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> result = new ArrayList<>();

        if(root == null) return result;// this one when tree is null

        stack.add(root);

        while (!stack.isEmpty()) {
            TreeNode cur = stack.pop();
            result.add(cur.val);
            if(cur.right != null) stack.push(cur.right);
            if(cur.left != null) stack.push(cur.left);
        }
        return result;
    }

    static TreeNode preOrder(TreeNode node) {
        if (node == null) return null;
        if(node.left!=null) preOrder(node.left);
        if(node.right!=null) preOrder(node.right);
        return node;
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
}
