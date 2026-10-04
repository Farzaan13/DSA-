
class Solution {
    public void inorder(TreeNode root, ArrayList<TreeNode> arr){
        if(root == null) return;

        inorder(root.left,arr);
        arr.add(root);
        inorder(root.right,arr);
    }
    public TreeNode convertBST(TreeNode root) {
        ArrayList<TreeNode> arr = new ArrayList<>();
        inorder(root,arr);
        Collections.reverse(arr);
        int sum = 0;

        for(int i = 0; i< arr.size(); i++){
            int val = arr.get(i).val;
            arr.get(i).val = sum + val;
            sum += val;
        }
        return root;
    }

}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna