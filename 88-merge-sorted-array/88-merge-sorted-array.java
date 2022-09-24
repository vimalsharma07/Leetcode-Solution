class Solution {
    public static void Merge(int[]arr,int m,int i, int[]ans ,int idx){
        while(i<m){
            ans[idx++]=arr[i++];
        }
    }
    public void merge(int[] nums1, int m, int[] nums2, int n) {
      int []ans= new int[m+n]  ;// make a answer array to put answer
        
        int idx=0; int i=0; int j=0;
        
        while(i<m && j<n){
            if(nums1[i]>=nums2[j]){
                ans[idx++]=nums2[j++];
            }else{
               ans[idx++]=nums1[i++]; 
            }
        }
        if(m>i){
            Merge(nums1, m, i,ans,idx);
        }else{
            Merge(nums2, n, j,ans,idx); 
        }
         int k=0;
       for(int p:ans) {
           nums1[k++]=p;
       }
    }
}