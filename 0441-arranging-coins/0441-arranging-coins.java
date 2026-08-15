class Solution {
    public int arrangeCoins(int n) {
        long low = 0, high = n, ans = 0;

        while(low<=high){
            long k = low + (high - low)/2;
            long m = k*(k+1)/2;

            if(m == n) return (int)k;
            else if(m > n) high = k-1;
            else{
                ans = k;
                low = k+1;
            }
        }
        return (int)ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna