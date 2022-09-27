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
                int ch= i+(int)('a');
               char  sh= (char)ch;
                
                
                 for(int j=0; j<n; j++){
                char sha= s.charAt(j);
                if(sh==sha){
                    ans= Math.min(j,ans);
                }
            }
            }
           
        }
        
      return ans==n+1?-1:ans;  
        
    }
}