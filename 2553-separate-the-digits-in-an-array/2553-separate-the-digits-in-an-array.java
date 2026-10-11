class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=nums.length-1;i>=0;i--){
            int num=nums[i];
            while(num>0){
            int digit=num%10;
            list.add(digit);
            num=num/10;
            
        } 
        }
        Collections.reverse(list);
         int[] ans=new int[list.size()];
         for(int i=0;i<list.size();i++){
            ans[i]=list.get(i);
         }
         return ans;
        
    }
}