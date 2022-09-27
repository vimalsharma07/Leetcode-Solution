class Solution {
    public int firstUniqChar(String s) {
        
        int n= s.length();
        
       int[] fre= new int[26]; // make a fre Array 
        
        for(int i=0; i<n; i++){
            char ch= s.charAt(i);
            fre[ch-'a']++;
        }
        
        int ans=n+1;
        for(int i=0; i<26; i++){
            
            if(fre[i]==1){
                // check the character which frequency is one 
                int character_fre= i+(int)('a');
               char  sh= (char)character_fre;
                
                // search that character in string 
                 for(int j=0; j<n; j++){
                char ch= s.charAt(j);
                if(sh==ch){
                    ans= Math.min(j,ans);// update the first occerquence of minium index
                }
            }
            }
           
        }
        
      return ans==n+1?-1:ans;  
        
    }
}