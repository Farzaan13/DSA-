
class Solution {
    public void inorder(TreeNode root,ArrayList<Integer> arr){
        if(root == null) return;

        inorder(root.left,arr);
        arr.add(root.val);
        inorder(root.right,arr);

    }
    public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> arr = new ArrayList<>();
        inorder(root,arr);
        return arr.get(k-1);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna