class Solution {
    public boolean valid(char a,char b){
        if(a == '(' && b == ')') return true;
        if(a == '{' && b == '}') return true;
        if(a == '[' && b == ']') return true;
        return false;
    }
    public boolean isValid(String s) {
        int n = s.length();
        if(n%2==1)return false;
        Stack<Character> st = new Stack<>();
        for(int i = 0; i<n;i++){
            char ch = s.charAt(i);
            if(ch == '(' || ch == '{' || ch == '[') st.push(ch);
            else{
                if(st.size()==0) return false;
                char top = st.peek();
                if(valid(top,ch)) st.pop();
                else return false;
            }
            
        }
        return (st.size()==0);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna