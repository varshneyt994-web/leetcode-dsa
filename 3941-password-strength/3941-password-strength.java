class Solution {
    public int passwordStrength(String s) {
        HashSet<Character> set=new HashSet<>();
         for(int i=0;i<s.length();i++){
            set.add(s.charAt(i));
         }
          int ans=0;
           for(char i: set){
          if(i>='a' && i<='z'){
            ans+=1;
          }
           else if(i>='A' && i<='Z'){
            ans+=2;
           }
            else if(i>='0' && i<='9'){
                ans+=3;
            }
             else{
                ans+=5;
             }
           }
         return ans;
        
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna