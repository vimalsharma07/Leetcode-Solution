class Solution {
    
    public static boolean Check(int n){
        if(n==1 || n==7){
            return true;
        }else if(n<=9){
            return false;
        }
        int ans=0;
        
        while(n>0){
            int last_digit= n%10;
             last_digit= (last_digit*last_digit) ;
            ans= ans+last_digit;
            n/=10;
            
            
        }
      return   Check(ans);
        
    }
  
    public boolean isHappy(int n) {
  return Check(n);
       
}
}
