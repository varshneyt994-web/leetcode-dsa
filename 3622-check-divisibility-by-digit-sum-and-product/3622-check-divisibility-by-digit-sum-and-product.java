class Solution {
    public boolean checkDivisibility(int n) {
         int sum=0;
         int pro=1;
         for(int i=n;i>0;i=i/10){
            int rem=i%10;
            sum+=rem;
            pro*=rem;
         }
          if(n%(sum+pro)==0){
             return true;
          }
           else {
             return false;
           }



    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna