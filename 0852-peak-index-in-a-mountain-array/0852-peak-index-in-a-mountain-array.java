class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int low =1;
        int high = arr.length - 2;
        

        while(low<=high){
            int mid = (low + high)/2;

            if(arr[mid]>arr[mid+1] && arr[mid]> arr[mid-1]) return mid;
            else if(arr[mid]>arr[mid+1] && arr[mid]< arr[mid-1]) high = mid-1;
            else low = mid +1;

            
        }
        return 10;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna