class Solution {
    public int maxNumberOfBalloons(String text) {
        int n= text.length();
        int[]text_fre= new int[26];
        int[]ballon_fre= new int[26];
        
        for(int i=0; i<n; i++){
            char ch= text.charAt(i);
            if(ch=='b'|| ch=='a'|| ch=='l'|| ch=='o'|| ch=='n'){
                text_fre[ch-'a']++;
            }
            
        }
        String b= "balloon";
        
        int check=0;
        for(int i:text_fre){
            if(i!=0)check++;
        }
        if(5!=check)return 0;
        
        
        
        for(int i=0; i<b.length(); i++){
            char ch= b.charAt(i);
            
                ballon_fre[ch-'a']++;
            
            
        }
     int[]ans= new int[n]; int idx=0;
        for(int i=0; i<26; i++){
            if(ballon_fre[i]!=0){
                if(text_fre[i]<ballon_fre[i])return 0;
                int how_many= text_fre[i]/ballon_fre[i];
                ans[idx++]=how_many;
            }
        }
        int fnal=n;
        for(int i:ans){
            if(i!=0){
                fnal= Math.min(i,fnal);
            }
            
            
        }
        
       return fnal; 
    }
}