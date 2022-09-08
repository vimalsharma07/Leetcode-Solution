class Solution {
    public int searchInsert(int[] arr, int target) {
        int n= arr.length;
        int m=0;
        for(int i=0; i<n; i++){
            if(arr[i]==target){
                return i;
            }else if(arr[i]>target){
                return i;
            }else if (i==n-1 && target>arr[i]){
                m=n;
            }
        }
        return m;
        
    }
}