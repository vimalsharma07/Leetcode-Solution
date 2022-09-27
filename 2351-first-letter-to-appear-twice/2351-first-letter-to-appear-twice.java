
   class Solution {
    public char repeatedCharacter(String s) {
       int n= s.length();
        int ans=n;
        int fre[]= new int[26];
        for(int i=0; i<n; i++){
            char ch= s.charAt(i);
            fre[ch-'a']++;
            if(fre[ch-'a']==2){
                ans=i;
                break;
            }
        }
        return s.charAt(ans);
    }
}
