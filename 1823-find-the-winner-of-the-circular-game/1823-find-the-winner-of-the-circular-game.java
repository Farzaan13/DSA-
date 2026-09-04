class Solution {
    public int findTheWinner(int n, int k) {
        Queue<Integer> q = new LinkedList<>();
        for(int i = 1;i<=n;i++){
            q.add(i);
        }
        while(q.size()>1){
            for(int i = 1;i<=k-1;i++){
                q.add(q.remove());
            }
            q.remove();
        }
        return q.peek();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna