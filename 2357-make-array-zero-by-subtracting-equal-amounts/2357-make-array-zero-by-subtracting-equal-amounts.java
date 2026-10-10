class Solution {
    public int minimumOperations(int[] arr){
    //    int min=Integer.MAX_VALUE;
    //     int count=0;
    //     for(int i=0;i<arr.length;i++){ 
            
    //         if(arr[i]<min && arr[i]!=0){
    //             min=arr[i];  
    //       }
    //     }

    //     for(int i=0;i<arr.length;i++){
    //         arr[i]=arr[i]-min;
        
    //     }
    //    for(int i=0;i<arr.length;i++){
    //     if(arr[i]!=0){
              
    //         count++;
    //         break;
    //     }
        
    //    }
    //     return count;
     HashSet<Integer> set=new HashSet<>();
      for(int i=0;i<arr.length;i++){
        if(arr[i]!=0){
            set.add(arr[i]);
        }
      }
      return set.size();
        
    }     
    }
