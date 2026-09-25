
class Solution {
    public ArrayList<Integer> boundaryTraversal(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(root.data);
        if(root.right == null && root.left == null) return ans;
        leftBoundary(root.left, ans);
        leafNodes(root, ans);
        rightBoundary(root.right, ans);
        return ans;
    }
    public void leftBoundary(Node root, ArrayList<Integer> ans){
        if(root == null) return;
        if(root.left == null && root.right == null) return;
        ans.add(root.data);
        if(root.left!= null) leftBoundary(root.left,ans);
        else leftBoundary(root.right, ans);
    }
    public void leafNodes(Node root, ArrayList<Integer> ans){
        if(root == null) return;
        if(root.left == null && root.right == null) ans.add(root.data);
        leafNodes(root.left,ans);
        leafNodes(root.right,ans);
    }
    public void rightBoundary(Node root, ArrayList<Integer> ans){
        if(root == null) return;
        if(root.left == null && root.right==null) return;
        if(root.right!= null) rightBoundary(root.right,ans);
        else rightBoundary(root.left, ans);
        ans.add(root.data);
    }
    
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna