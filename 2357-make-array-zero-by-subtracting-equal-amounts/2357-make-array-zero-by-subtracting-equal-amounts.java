class Solution {
    public static int get_first(int[]arr){
     int n= arr.length; 
        int ans=-1;
        int s=0; int e=n-1;
        while(s<=e){
            int mid= (s+e)/2;
            if(arr[mid]==0){
                s=mid+1;
            }else{
                ans=mid;
                e=mid-1;
            }
        }
        return arr[ans];
    }
    public int minimumOperations(int[]arr){
       int n= arr.length;
        Arrays.sort(arr);
        int count=0;
      while(arr[n-1]!=0){
          int idx= get_first(arr);
          for(int i=0; i<n; i++){
              if(arr[i]!=0){
                  arr[i]=arr[i]-idx;
              }
          }
          count++;
      }
        return count;
        
    }
}