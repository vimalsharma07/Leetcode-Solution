class Solution {
    List<List<Integer>> res= new ArrayList<>();
    public List<List<Integer>> threeSum(int[] nums) {
        
        int n= nums.length;
        Arrays.sort(nums);
        
        for(int i=0; i<n; i++){
            if(i==0 ||  nums[i]!=nums[i-1]){
                twoSum(nums,i+1, n-1, 0-nums[i]);
            }
            
        }
        
        return res;
        
        
        
    }
    public  void twoSum(int[]arr, int s, int e, int target){
        int n= arr.length;
        int a= arr[s-1];
        while(e>s){
            if(arr[s]+arr[e]>target){
                e--;
           }else if(arr[s]+arr[e]<target){
                s++;
            }else{
              List<Integer> temp= new ArrayList<>() ;
                temp.add(a); temp.add(arr[s]); temp.add(arr[e]);
                res.add(temp);
                
                while(e>s && arr[s]==arr[s+1]){
                    s++;
                }
                 while(e>s && arr[e]==arr[e-1]){
                    e--;
                }
                
                s++;
                e--;
                
            }
        }
    }
}