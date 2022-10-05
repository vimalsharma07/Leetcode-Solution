class Solution {
   public int threeSumClosest(int[] nums, int target) {
       int n= nums.length;
       
       int res= nums[0]+nums[1]+nums[2];
       Arrays.sort(nums);
       System.out.print(n);
       
       for(int i=0; i<n-2; i++){
         int s= i+1 ;
          int e= n-1;
           
           while(e>s){
               
               int current_sum= (nums[i]+nums[s]+nums[e]);
               
               if( current_sum==target){
                   return current_sum;
               }else if(current_sum>target){
                   e--;
               }else{
                   s++;
               }
              
                if(Math.abs(target-current_sum) < Math.abs(target-res)){
                 res=  current_sum;
               }
           }
          
           
       }
       return res;
    }
}