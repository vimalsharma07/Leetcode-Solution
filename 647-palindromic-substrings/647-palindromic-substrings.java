class Solution {
    
    public static boolean isPalendrom(String ans){
        int n= ans.length();
        int i=0; int j= n-1;
        while(j>=i){
            char ch= ans.charAt(i);
            char sh= ans.charAt(j);
            if(ch!=sh)return false;
            i++;
            j--;
        }
        return true;
    }
    
    public int countSubstrings(String str) {
       int n= str.length() ;
        int ans=0;
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                String temp= str.substring(i,j+1);
                if(isPalendrom(temp)){
                    ans++;
                }
                
            }
        }
        return ans;
    }
}