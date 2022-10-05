class Solution {
    public int longestPalindrome(String str) {
        int n= str.length();
        int[]fre= new int[256];
        for(int i=0; i<n; i++){
            char ch= str.charAt(i);
            fre[ch]++;
        }
        int ans=0; boolean flag=true;
       for(int i=0; i<256; i++){
           if(fre[i]!=0 && flag==true && fre[i]%2!=0){
               ans=ans+fre[i];
               flag=false;
           }else
           
           if(fre[i]!=0){
               int temp= fre[i]/2;
               temp= temp*2;
               ans+=temp;
           }
       }
        return ans;
    }
}