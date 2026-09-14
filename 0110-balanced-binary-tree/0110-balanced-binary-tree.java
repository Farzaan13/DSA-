/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    // METHOD 1
    static boolean flag;
    public boolean isBalanced(TreeNode root) {
        if(root==null) return true;
        flag = true;
        levels(root);
        return flag;
    }
    private int levels(TreeNode root){
        if(root == null) return 1;
        int left = levels(root.left);
        int right = levels(root.right);
        if(Math.abs(left-right)>1){
            flag = false;
        }
        return 1+ Math.max(left,right);

    }

//  METHOD 2

    // public boolean isBalanced(TreeNode root) {
    //     if(root==null) return true;
    //     int left = levels(root.left);
    //     int right = levels(root.right);

    //     if(Math.abs(left-right)>1) return false;
    //     return isBalanced(root.left) && isBalanced(root.right);
    // }

    // private int levels(TreeNode root){
    //     if(root== null) return 1;
    //     return 1+ Math.max(levels(root.left),levels(root.right));
    
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna