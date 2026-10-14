class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> arr) {
         ArrayList<Integer> list=new ArrayList<>();
         int[] freq=new int[101];
         for(int i=0;i<arr.size();i++){
            freq[arr.get(i)]++;
         }
          for(int i=0;i<freq.length;i++){
            if(freq[i]%2==1){
                list.add(i);
             }
          }
        return list;
    }
}