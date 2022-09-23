class Solution {
    public String removeStars(String str) {
       
        StringBuilder ans=new StringBuilder();
        
        
        int n= str.length();
       int count=0;
        for(int i=n-1; i>=0; i--){
            char ch= str.charAt(i);
            if(ch=='*'){
                count++;
            }else if(count>0){
                count--;
            }else{
              ans.append(ch)  ;
            }
        }
       return ans.reverse().toString() ;
    }
}




