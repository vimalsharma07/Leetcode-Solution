class Solution {
    public static int Check(int target, int[]arr){
        int idx=-1;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==target){
                idx=i;
                break;
            }
            
        }
        
        for(int i=idx; i<arr.length; i++){
                if(arr[i]>target){
                    return arr[i];
                }
            }
        return -1;
    }
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
      int m= nums1.length;        
      int n= nums2.length;
       
     
    
        int[]ans = new int[m];
        
        int idx=0;
        for(int i=0; i<m; i++){
     ans[idx++]=Check(nums1[i],nums2);
        }
       
        
        return ans;
    }
}