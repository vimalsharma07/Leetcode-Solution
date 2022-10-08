class Solution {
    public static boolean Check(String ans){
        int n= ans.length();
        int[]cap_fre= new int[26];
        int[]sma_fre= new int[26];
        
        for(int i=0; i<n; i++){
            char ch= ans.charAt(i);
            if(ch>='A' && ch<='Z'){
                cap_fre[ch-'A']++;
            }else{
                sma_fre[ch-'a']++;
            }
        }
        
        for(int i=0; i<26; i++){
            if(cap_fre[i]!=0 && sma_fre[i]==0 || cap_fre[i]==0 && sma_fre[i]!=0 ){
                return false;
            }
        }
        return true;
        

    }
    public String longestNiceSubstring(String str) {
        int n= str.length();
        String ans="";
        for(int i=0; i<n; i++){
            for(int j=i+1; j<=n; j++){
                
                if(Check(str.substring(i,j))){
                    String temp = (str.substring(i,j)); 
                    if(ans.length()<temp.length()){
                        ans=temp;
                    }
                }
            }
        }
        return ans;
    }
}