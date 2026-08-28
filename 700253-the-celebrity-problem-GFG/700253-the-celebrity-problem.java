class Solution {
    public int celebrity(int mat[][]) {
        Stack<Integer> st = new Stack<>();
        int n = mat.length;
        for(int i = 0;i<n;i++){
            st.push(i);
        }
        
        while(st.size()>1){
            int a = st.pop();
            int b = st.pop();
            
            boolean aflag = true, bflag = true;
            if(mat[a][b] == 1 || mat[b][a]==0) aflag = false;
            else if(mat[a][b] == 0 || mat[b][a]==1) bflag = false;
            
            if(aflag) st.push(a);
            if(bflag) st.push(b);
            
            
        }
        
        if(st.size()==0) return -1;
        int celeb = st.pop();
        for(int i = 0;i<n;i++){
            if(i==celeb) continue;
            if(mat[celeb][i]==1) return -1;
            
        }
        for(int i = 0;i<n;i++){
            if(i==celeb) continue;
            if(mat[i][celeb]==0) return -1;
            
        }
        return celeb;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna