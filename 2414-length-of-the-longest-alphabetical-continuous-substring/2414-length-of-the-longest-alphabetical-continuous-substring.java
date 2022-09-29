class Solution {
    public int longestContinuousSubstring(String str) {
      int n= str.length();
        int max=1;
        int count=1;
        for(int i=1; i<n; i++){
            char ch= str.charAt(i);
            char sh= str.charAt(i-1);
            int a= (int)(ch);
             int b= (int)(sh);
            if(a-1==b){
                count++;
                max= Math.max(count,max);
            }else{
                count=1;
            }

        }
        return max;
    }
}