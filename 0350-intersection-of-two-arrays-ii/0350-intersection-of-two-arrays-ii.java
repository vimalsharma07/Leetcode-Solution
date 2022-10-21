class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
       Arrays.sort(nums1);
       Arrays.sort(nums2);
        int m= nums1.length;
        int n= nums2.length;
        List<Integer> ans= new ArrayList<>();
        int i=0;  int j=0;
        while(i<m && j<n){
            if(nums1[i]==nums2[j]){
                ans.add(nums1[i]);
                i++;
                j++;
            }else if(nums1[i]>nums2[j]){
                j++;
            }else{
                i++;
            }
        }
        int idx=0;
        int[]out= new int[ans.size()];
        for(int l=0; l<ans.size(); l++){
            int a= ans.get(l);
            out[idx++]=a;
        }
        
  return out;
        
    }
}