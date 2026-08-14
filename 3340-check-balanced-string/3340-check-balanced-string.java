class Solution {
    public boolean isBalanced(String s) {
         int even=0;
         int odd=0;
         for(int i=0;i<s.length();i++){
             int as=s.charAt(i);
            if(i%2==0){
               
                even+=(as-48);
            }
            else{
                odd+=(as-48);
            }
         }
            if(even!=odd){
                return false;
            
         }
        return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna