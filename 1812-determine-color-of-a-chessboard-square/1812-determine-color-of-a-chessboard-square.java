class Solution {
    public boolean squareIsWhite(String str) {
          int x=(int)str.charAt(0)-96;
          int y=(int)str.charAt(1)-48;
          int c=x+y;
          if(c%2!=0){
            return true;
          }
           return false ;
        
    }
}