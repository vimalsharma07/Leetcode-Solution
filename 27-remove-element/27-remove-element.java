class Solution {
    public int removeElement(int[] nums, int val) {
       int count=0;
        
        int n= nums.length;
        for(int i=0; i<n; i++){
            if(nums[i]==val)count++;
        }
        
        
        int i=0; int j=n-1;
        while(j>i){
            if(nums[j]==val){
                j--;
                continue;
            }
            
            if(nums[i]!=val){
                i++;
                continue;
            }
            if(nums[i]==val){
                nums[i++]=nums[j--];
            }
        }
        for(int k : nums){
            System.out.print(k+" ");
        }
        return n-count;
        
        
    }
}