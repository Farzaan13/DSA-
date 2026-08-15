class Solution {
    public int mySqrt(int n) {
        if(n ==0) return 0;
        int low = 1;
        int high = n;
        
        int root = 0;
        
        while(low <= high){
            int mid = low + (high-low)/2;
            
            if(mid == n/mid) return mid;
            else if(mid >n/mid) high = mid-1;
            else{
                root = mid;
                low = mid+1;
            }
        }
        return root; 
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna