class Solution {
     List<List<Integer>>list= new ArrayList<>();
    public  void twoSum(int target, int start, int end ,  int[]arr ){
        int n= arr.length;
       int ans= arr[start-1];
        while(end>start){
           if(arr[start]+arr[end]>target){
               end--;
           }else if(arr[start]+arr[end]<target){
               start++;
           }else{
               List<Integer> temp= new ArrayList<>();
               temp.add(ans);
               temp.add(arr[start]);
               temp.add(arr[end]);
               list.add(temp);
               
               while(end>start && arr[start]==arr[start+1]){
                   start++;
               }
               while(end>start && arr[end]==arr[end-1]){
                   end--;
               }
               start++;
               end--;
           }
        
       
    }
    }
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n= nums.length;
        int i=0;
        while(i<n){
               if(i==0 || nums[i]!=nums[i-1]){
                  twoSum(0-nums[i] , i+1, n-1,  nums); 
               }
                  
                
              
            i++;
            
        
            
        }
        return list;
    }
}