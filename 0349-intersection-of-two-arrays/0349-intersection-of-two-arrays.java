class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> list=new  ArrayList<>();
        HashSet<Integer> set1=new HashSet<>();  
          HashSet<Integer> set2=new HashSet<>();    
          for(int i=0;i<nums1.length;i++){
            set1.add(nums1[i]);
          }
          for(int i=0;i<nums2.length;i++){
            set2.add(nums2[i]);
          }
          for(int ele:set1)
           if(set2.contains(ele)) list.add(ele);
            int[] arr=new int[list.size()];
           for(int i=0;i<list.size();i++){
            arr[i]=list.get(i);

           }
            return arr;

    }
}