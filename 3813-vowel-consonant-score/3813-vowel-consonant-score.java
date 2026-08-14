class Solution {
    public int vowelConsonantScore(String s) {
         int vowel=0;
         int constt=0;
         for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch >='a' && ch<='z'){
                if(ch=='a'|| ch=='e' ||ch=='i'||ch=='o'||ch=='u'){
                    vowel++;
                }
                 else {
                      constt++;
                 }
            }
         }
         if(constt==0) return 0;
          return vowel/constt;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna