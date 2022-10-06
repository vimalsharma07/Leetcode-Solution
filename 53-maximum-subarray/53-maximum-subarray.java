class Solution {
    public int maxSubArray(int[] nums) {
        int n= nums.length;
       
        int i=0; 
        int ans=-10000; int max=-10000;
        while(i<n){
           if(nums[i]>0){
               max= Math.max(ans,max);
               if(ans<0){
                   ans=nums[i];
               }else{
                   ans+=nums[i];
               }
           }else{
               max= Math.max(max,ans);
               if(ans<=nums[i]){
                   ans=nums[i];
               }else{
                   ans+=nums[i];
               }
           }
            i++;
        }
        return Math.max(ans,max);
    }
}