class Solution {
    public boolean buddyStrings(String str, String goal) {
        int n= str.length();
        int m= goal.length();
        if(m!=n)return false;
        int j=-1; int k=-1;
        int an=0;
        for(int i=0; i<n; i++){
            char ch= str.charAt(i);
            char sh= goal.charAt(i);
            if(ch!=sh){
                an++;
                if(j==-1){
                    j=i;
                }else{
                    k=i;
                }
            }
        }
        if(an>2 || an==1)return false;
        
        StringBuilder ans= new StringBuilder();
        if(an==2){
        for(int i=0; i<n; i++){
            char ch= str.charAt(i);
            if(i==j){
                char temp= str.charAt(k);
                ans.append(temp);
            }else if(i==k){
                char a= str.charAt(j);
                ans.append(a);
            }else{
                ans.append(ch);
            }
        }
        }else{
            int[]fre= new int[26];
            for(int i=0; i<n; i++){
                char ch= str.charAt(i);
                fre[ch-'a']++;
            }
            for(int z:fre){
                if(z>=2)return true;
            }
            
            
        }
        
        
      String fn= ans.toString()  ;
        
      return fn.equals(goal)  ;
    }
}