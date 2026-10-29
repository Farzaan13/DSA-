class Solution {
    public int countDistinct(int arr[]) {
        HashSet<Integer> s = new HashSet<>();
        for(int ele : arr) s.add(ele);
        return (s.size());
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna