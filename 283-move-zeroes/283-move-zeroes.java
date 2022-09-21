class Solution {
    public static void Swap(int[]arr, int i, int j){
        int temp= arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public void moveZeroes(int[] nums) {
        int n= nums.length;
        int i=-1; int j=0;
        while(j<n){
            if(nums[j]!=0){
                Swap(nums,++i,j++);
            }else{
                j++;
            }
        }
    }
}