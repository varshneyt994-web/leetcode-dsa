class Solution {
    public boolean backspaceCompare(String s, String t) {
        int len = 0;
        int len2=0;
         String a="";
         String b="";

        for(int i=0;i<s.length();i++){
            if(s.charAt(i) != '#'){
                a+=s.charAt(i);
                len++;
            }else if(len > 0){
               a = a.substring(0, a.length() - 1);
                len--;
            }
        }
         for(int i=0;i<t.length();i++){
            if(t.charAt(i) != '#'){
                b+=t.charAt(i);
                len2++;
            }else if(len2 > 0){
             b= b.substring(0, b.length() - 1);
                len2--;
            }
        }
        return a.equals(b);

        }
        
    }
