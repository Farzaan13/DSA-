class Solution {
    public int largestRectangleArea(int[] arr) {
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        int[] nse = new int[n];
        nse[n-1] = n;
        st.push(n-1);
        for(int i = n-2; i >= 0; i--){
            while(st.size() > 0 && arr[st.peek()] >= arr[i]) st.pop();
            if(st.size() == 0) nse[i] = n;
            else {
                nse[i] = st.peek();
            }
            st.push(i);
        }
        while(st.size() != 0) st.pop();

        int[] pse = new int[n];
        pse[0] = -1;
        st.push(0);
        for(int i = 1; i < n; i++){
            while(st.size() > 0 && arr[st.peek()] >= arr[i]) st.pop();
            if(st.size() == 0) pse[i] = -1;
            else pse[i] = st.peek();
            st.push(i);
        }

        int maxarea = 0;
        for(int i = 0; i < n; i++){
            int area = arr[i] * (nse[i] - pse[i] - 1);
            maxarea = Math.max(maxarea, area);
        }

        return maxarea;
    } // <--- Added missing closing brace here

    public int maximalRectangle(char[][] mat) {
        int row = mat.length;
        int col = mat[0].length;

        int[][] intmat = new int[row][col];

        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                intmat[i][j] = Character.getNumericValue(mat[i][j]);
            }
        }

        // Fix: Start accumulation from row 1, since row 0 has no row above it
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(intmat[i][j] == 1 && i > 0) {
                    intmat[i][j] += intmat[i-1][j];
                }
            }
        }

        int maxarea = 0;
        for(int[] r: intmat){
            int area = largestRectangleArea(r);
            maxarea = Math.max(maxarea, area);
        }
        return maxarea;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna