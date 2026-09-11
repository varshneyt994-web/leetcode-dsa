class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
         HashSet<Character> set=new HashSet<>();
         for(int i=0;i<allowed.length();i++){
            set.add(allowed.charAt(i));
         }
         int count=0;
         for(int i=0;i<words.length;i++){
             String temp=words[i];
             for(int j=0;j<temp.length();j++){
            if(!set.contains(temp.charAt(j))){
                count++;
                break;
            }
         }
         }
         return words.length-count;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna