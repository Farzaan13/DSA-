

class Solution {
    public void helper(Node root, ArrayList<Integer> ans){
        if(root == null) return;
        ans.add(root.data);
        helper(root.left,ans);
        helper(root.right,ans);
    }
    public ArrayList<Integer> preOrder(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        helper(root,ans);
        return ans;
         
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna