class Solution {
    public int[] canSeePersonsCount(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        ans[n-1] = 0;
        st.push(arr[n-1]);

        for(int i = n-2;i>= 0;i--){
            int count = 0;
            while(st.size()>0 && arr[i]>=st.peek()){
                count++;
                st.pop();
            }
            if(st.size()>0) count++;

            ans[i] = count;
            st.push(arr[i]);
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna