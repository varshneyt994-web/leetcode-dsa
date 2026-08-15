class Solution {
    public String getEncryptedString(String s, int k) {
          int n=s.length();
         k%=n;
         
         String t="";
         t+=s.substring(k,n);
         t+=s.substring(0,k);
        
        return t;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna