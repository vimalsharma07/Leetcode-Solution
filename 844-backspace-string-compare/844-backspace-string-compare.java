class Solution {
    public boolean backspaceCompare(String s, String t) {
       
        int m = s.length();
        int  n = t.length();
        
        StringBuilder ans1= new StringBuilder();
        StringBuilder ans2= new StringBuilder();
        int count=0;
        for(int i=m-1; i>=0; i--){
            char ch= s.charAt(i);
            if(ch=='#'){
                count++;
            }else if(count>0){
                count--;
            }else{
                ans1.append(ch);
            }
        }
        
        count=0;
        
        for(int i=n-1; i>=0; i--){
            char ch= t.charAt(i);
            if(ch=='#'){
                count++;
            }else if(count>0){
                count--;
            }else{
                ans2.append(ch);
            }
        }
        return ans1.toString().equals(ans2.toString()) ;
    }
}