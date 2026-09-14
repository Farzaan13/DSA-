
class Solution {
    public boolean isBalanced(TreeNode root) {
        if(root==null) return true;
        int left = levels(root.left);
        int right = levels(root.right);

        if(Math.abs(left-right)>1) return false;
        return isBalanced(root.left) && isBalanced(root.right);
    }

    private int levels(TreeNode root){
        if(root== null) return 1;
        return 1+ Math.max(levels(root.left),levels(root.right));
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna