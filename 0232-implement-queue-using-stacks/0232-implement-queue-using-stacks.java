class MyQueue { 
    Stack<Integer> st = new Stack<>();
    Stack<Integer> helper = new Stack<>();


    public MyQueue() {
        
    }
    
    public void push(int x) {
        st.push(x);
    }
    
    public int pop() {
        while(st.size()>1){
            helper.push(st.pop());
        }
        int top = st.pop();
        while(helper.size()>0){
            st.push(helper.pop());
        }
        return top;
    }
    
    public int peek() {
        while(st.size()>1){
            helper.push(st.pop());
        }
        int top = st.peek();
        while(helper.size()>0){
            st.push(helper.pop());
        }
        return top;
        
    }
    
    public boolean empty() {
        if(st.size() ==0) return true;
        return false;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna