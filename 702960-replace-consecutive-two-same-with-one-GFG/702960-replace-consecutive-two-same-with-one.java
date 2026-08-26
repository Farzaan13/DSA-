class Solution {
    public String removeDuplicates(String s) {
        // code here
        if(s.length()==1) return s;
        Stack<Character> st = new Stack<>();
        
        int n = s.length();
        for(int i = 0 ; i<n ; i++){
            char ch = s.charAt(i);
            if(st.size()==0) st.push(ch);
            else if(ch == st.peek());
            else{
                st.push(ch);
            }
        }
        Stack<Character> temp = new Stack<>();
        
        while(!st.isEmpty()){
            temp.push(st.pop());
        }
        String t = "";
        while(!temp.isEmpty()){
            t += temp.pop();
        }
        return t;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna