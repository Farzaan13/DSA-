
class Solution {
    public void view(TreeNode root,int level,List<Integer> ans){
        if(root == null) return;
        if(level >= ans.size()) ans.add(root.val);
        else ans.set(level,root.val);
        view(root.left,level+1,ans);
        view(root.right,level+1,ans);        
    }
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        view(root,0,ans);
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna