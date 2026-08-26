class Solution {
    public int calPoints(String[] srr) {
        Stack<Integer> st = new Stack<>();
        int n = srr.length;
        for(int i = 0; i<n;i++){
            String s = srr[i];
            if(s.equals("+")){
                
                int a = st.pop();
                int b = st.pop();
                int c = a+b;
                st.push(b);
                st.push(a);
                st.push(c);
            }
            else if(s.equals("D")){
                int a = st.peek();
                int b = a + a;
                st.push(b);
            }
            else if(s.equals("C")){
                st.pop();
            }
            else{
                st.push(Integer.parseInt(s));
            }
        }
        int sum = 0;
        while(!st.isEmpty()){
            sum += st.pop();
        }
        return sum;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna