class Solution {
    public int[] plusOne(int[] digits) {
       int n= digits.length;
        int[]temp= new int[n];
        int carry=1;
        for(int i=n-1; i>=0; i--){
          int a= digits[i]+carry;
            if(a>9){
                int last_digit= a%10;
                temp[i]=last_digit;
                carry=1;
            }else{
                int last_digit= a%10;
                temp[i]=last_digit;
                carry=0;
            }
            
        }
        if(carry==1){
            int[]ans= new int[n+1];
            ans[0]=carry; int idx=1;
            for(int i : temp){
                ans[idx++]=i;
            }
            return ans;
        }
        return temp;
    }
}