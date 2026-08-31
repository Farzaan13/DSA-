// USING 1 STACK AND A VARIABLE MIN FOR GETMIN FUNCTION

class MinStack {
    Stack<Long> st;
    long min;
    public MinStack() {
        st = new Stack<>();
        min = Long.MAX_VALUE;
    }
    
    public void push(int val) {
        long value = (long)val;
        if(st.size()==0) min = value;

        if(value >= min) st.push(value);
        else{ 
            st.push(value + (value-min));
            min = value;
        }
    }
    
    public void pop() {
        if(st.peek() < min){ 
            min = min + (min - st.peek());
        }
        st.pop();
    }
    
    public int top() { 
        long peek = st.peek();
        if(peek < min){ 
            return (int)min;
        }
        else return (int)peek;
    }
    
    public int getMin() {
        return (int)min;
    }
}


//  USING TWO STACKS


// class MinStack {
//     Stack<Integer> st;
//     Stack<Integer> minst;

//     public MinStack() {
//         st = new Stack<>();
//         minst = new Stack<>();
        
//     }
    
//     public void push(int value) {
//         st.push(value);
//         if(minst.size()==0 || st.peek() < minst.peek()) minst.push(st.peek());
//         else minst.push(minst.peek());
        
//     }
    
//     public void pop() {
//         st.pop();
//         minst.pop();
//     }
    
//     public int top() {
//         return st.peek();
//     }
    
//     public int getMin() {
//         return minst.peek();
//     }
// }


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna