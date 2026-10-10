class Solution {
    public boolean judgeCircle(String str) {
         int x=0;
         int y=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='U'){
                y++;
            }
                if(str.charAt(i)=='D'){
                y--;
            }
            if(str.charAt(i)=='R'){
                x++;
            }
            if(str.charAt(i)=='L'){
                x--;
            }
            }
            if(x==0 && y==0) return true;
            return false;
        
        
    }
}