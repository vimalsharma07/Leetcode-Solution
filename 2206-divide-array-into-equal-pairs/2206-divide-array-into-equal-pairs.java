class Solution {
    public boolean divideArray(int[] nums) {
       int n= nums.length;
      
        if(n%2!=0)return false;
        int pair = n/2;
        Arrays.sort(nums);
        int i=1; 
        int compare =0;
        while(i<n){
          if(nums[i]==nums[i-1])compare++;
            i+=2;
        }
        
        return compare==pair;
    }
}