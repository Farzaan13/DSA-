
class Solution {
    public void dfs(TreeNode root, ArrayList<TreeNode> arr){
        if(root == null) return;
        arr.add(root);
        dfs(root.left,arr);
        dfs(root.right,arr);
    }
    public void flatten(TreeNode root) {

        ArrayList<TreeNode> arr = new ArrayList<>();
        dfs(root,arr);
        if(arr.size()==0) return;
        for(int i = 0;i<arr.size()-1;i++){
            TreeNode a = arr.get(i);
            TreeNode b = arr.get(i+1);
            a.right = b;
            a.left = null;
        }
        TreeNode last = arr.get(arr.size()-1);
        last.left = null;
        last.right = null;

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna