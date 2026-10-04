
class Solution {
    public void attach(TreeNode root, int val){
        
        if(root.val == val) return;
        if(root.val > val){
            if(root.left == null) root.left = new TreeNode(val);
            else attach(root.left,val) ;
        }
        else if(root.val < val ){
            if(root.right == null) root.right = new TreeNode(val);
            else attach(root.right,val);
        }
    }
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root == null){
            root = new TreeNode(val);
            return root;

        }
        attach(root,val);
        return root;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna