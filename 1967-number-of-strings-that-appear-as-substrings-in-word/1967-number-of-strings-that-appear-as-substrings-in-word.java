class Solution {
    public int numOfStrings(String[] str, String word) {
         int count=0;
         for(int i=0;i<str.length;i++){
            String s=str[i];
            if(word.contains(s)){
                count++;
            }
         }
         return count;
        
    }
}