class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[n];

        for(int i = n-1;i>=0;i--){
            st.push(nums[i]);
        }
        
        for(int i = n-1;i>=0;i--){
            while(st.size()!= 0 && nums[i]>=st.peek()) st.pop();
            if(st.size() == 0) ans[i] = -1;
            else{
                ans[i] = st.peek();
            }
            st.push(nums[i]);
        }

        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna