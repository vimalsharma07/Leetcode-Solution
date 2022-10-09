class Solution {
    public static boolean Check(String target , String check){
        // make the frequency array of target and Capital and small leeters 
        int[]fre= new int[26];
        int n= target.length();
        
        for(int i=0; i<n; i++){
            char ch= target.charAt(i);
            if(ch>='A' && ch<='Z'){
                fre[ch-'A']++;
            }else if ( ch>='a' && ch<='z' ){
                fre[ch-'a']++;
            }
        }
        
        // make the frequency array of check 
        
        int[]check_fre= new int[26];
        int m= check.length();
        
        for(int i=0; i<m; i++){
            char ch= check.charAt(i);
            check_fre[ch-'a']++;
        }
        
        for(int i=0; i<26; i++){
            if(check_fre[i]<fre[i])return false;
        }
        return true;
        
    }
    public String shortestCompletingWord(String licensePlate, String[] words) {
        int n= words.length;
        String ans="abvsghdnmbahsgdhgtahbsgvd";  
        
        // ans can't be more then 15 letters bcoz words max length is 15 
        
        for(int i=0; i<n; i++){
            if(Check(licensePlate, words[i])){
                if(words[i].length()<ans.length()){
                    ans=words[i];
                }
            }
        }
        return ans;
    }
}