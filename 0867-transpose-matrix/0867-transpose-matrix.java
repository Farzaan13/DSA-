class Solution {
    public int[][] transpose(int[][] a) {
        int row = a.length , col = a[0].length;
        int[][] b = new int[col][row];
        for(int i =0 ;i<b.length;i++){
            for(int j =0 ;j<b[0].length;j++){
                b[i][j] = a[j][i];
            }
        }
        return b;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna