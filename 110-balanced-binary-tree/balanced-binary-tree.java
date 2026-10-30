class Solution {
    public boolean isBalanced(TreeNode root) {
        return validate(root) != -1;
    }

    private int validate(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = validate(root.left);
        if (leftHeight == -1) {
            return -1; 
        }
        int rightHeight = validate(root.right);
        if (rightHeight == -1) {
            return -1; 
        }
        if (Math.abs(leftHeight - rightHeight) > 1) {
            return -1;
        }
        return 1 + Math.max(leftHeight, rightHeight);
    }
}
