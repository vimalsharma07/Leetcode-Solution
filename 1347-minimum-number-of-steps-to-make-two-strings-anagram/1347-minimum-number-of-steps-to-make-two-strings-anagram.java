class Solution {
    public int minSteps(String s, String t) {
        int[]s_fm= new int[26];
 
        // make a frenquecy array to get the changes in t string 
        for (int i = 0; i<s.length(); i++){
             s_fm[s.charAt(i) - 'a']++;
            s_fm[t.charAt(i)-'a']--;
        }
           
        int ans=0;
        
        for(int i=0;  i<26; i++){
            if(s_fm[i]>0){
               ans= ans+s_fm[i] ;
            }
        }
        return ans;
    }
}