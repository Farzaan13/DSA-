
class Solution {
    static int max;
    public int diameterOfBinaryTree(TreeNode root) {
        max = 0;
        levels(root);
        return max;
    }
    private int levels(TreeNode root){
        if(root==null) return 0;
        int left = levels(root.left);
        int right = levels(root.right);

        max = Math.max(max,left+right);
        return 1+Math.max(left,right);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna