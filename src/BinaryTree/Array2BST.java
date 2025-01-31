package BinaryTree;

public class Array2BST {
    public static void main(String[] args) {

    }
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public TreeNode sortedArrayToBST(int[] nums){
        if(nums == null) return null;
        return buildTree (nums, 0, nums.length - 1);
    }

    public TreeNode buildTree(int[] nums,int left,int right) {
        if (left > right ) return null;
        int mid = left + (right-left)/2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = buildTree (nums, left, mid-1);
        node.right = buildTree (nums, mid+1, right);
        return node;
    }
}
