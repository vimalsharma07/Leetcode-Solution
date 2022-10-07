class Solution {
   static  int[]ans= new int[46];
    public static int Helper(int n){
        if(ans[n]!=0)return ans[n];
        if(n==0 || n==1)return 1;
        
      int faith1= Helper(n-1);
        ans[n-1]=faith1;
     int faith2=Helper(n-2);
        ans[n-2]=faith2;
        int an= faith1+faith2;
        return an;
    }
    
    public int climbStairs(int n) {
        
        return Helper(n);
    }
}