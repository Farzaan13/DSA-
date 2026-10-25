
class Solution {
    static int idx;
    public static void convertToMaxHeap(Node root) {
        idx = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        inorderTraversal(root,ans);
        postOrderTraversal(root,ans);
        
    }
    public static void inorderTraversal(Node root, ArrayList<Integer> ans){
        if(root == null) return;
        inorderTraversal(root.left,ans);
        ans.add(root.data);
        inorderTraversal(root.right,ans);
    }
    public static void postOrderTraversal(Node root,ArrayList<Integer> ans){
        if(root == null) return;
        postOrderTraversal(root.left,ans);
        postOrderTraversal(root.right,ans);
        root.data  = ans.get(idx++);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna