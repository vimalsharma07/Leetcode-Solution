class Solution {
    public static void Swap(int[]arr, int i, int j){
        int temp= arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public int[] findErrorNums(int[] nums) {
        int n= nums.length;
        int[]ans= new int[2];
        int i=0;
        while(i<n){
            int idx=nums[i]-1;
            if(nums[i]!=nums[idx]){
                Swap(nums, i,idx);
            }else{
                i++;
            }
        }
        
        for(int j=0; j<n; j++){
            if(nums[j]!=j+1){
                ans[0]= nums[j];
                ans[1]=j+1;
            }
        }
        return ans;
    }
}