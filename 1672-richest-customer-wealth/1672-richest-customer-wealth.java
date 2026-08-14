class Solution {
    public int maximumWealth(int[][] arr) {
    
        int ans=0;;
         for(int i=0;i<arr.length;i++){
            int sum=0;
          
            for(int j=0;j<arr[i].length;j++){
                sum += arr[i][j];
            }
                 ans=Math.max(sum,ans);
            
         }
         return ans;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna