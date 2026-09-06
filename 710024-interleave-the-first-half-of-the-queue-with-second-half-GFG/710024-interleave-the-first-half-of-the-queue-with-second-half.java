class Solution {
    public void rearrangeQueue(Queue<Integer> q) {
        // SOLUTION USING A STACK
        Stack<Integer> st = new Stack<>();
        int n = q.size();
        
        for(int i = 1;i<=n/2;i++){
            st.push(q.remove());
        }
        
        while(st.size()!=0){
            q.add(st.pop());
        }
        
        for(int i = 1;i<=n/2;i++){
            st.push(q.remove());
        }
        
        while(st.size()!=0){
            q.add(st.pop());
            q.add(q.remove());
        }
        
        while(q.size()!=0){
            st.push(q.remove());
        }
        while(st.size()!=0){
            q.add(st.pop());
        }
        
        // SOLUTION USING AN EXTRA QUEUE
        
        Queue<Integer> q2 = new LinkedList<>();
        int n = q.size();
        
        for(int i =1 ;i<=n/2;i++){
            q2.add(q.remove());
        }
        
        while(q2.size()!=0){
            q.add(q2.remove());
            q.add(q.remove());
        }
        
        
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna