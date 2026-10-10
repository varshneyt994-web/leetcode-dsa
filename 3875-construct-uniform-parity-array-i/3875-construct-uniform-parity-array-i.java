class Solution {
    public boolean uniformArray(int[] arr) {
       boolean even=false;
       boolean odd=false;
       for(int i=0;i<arr.length;i++){
        if(arr[i]%2==0){
            even=true;
        }
         else {
            odd=true;
         }
       }
       return odd && even|| even || odd;

    }
}