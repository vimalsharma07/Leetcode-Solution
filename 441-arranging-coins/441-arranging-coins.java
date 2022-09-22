class Solution {
    public int arrangeCoins(int n) {
        
        

        int insert= 1;
        int total=0;
        while(n>0){
            
            n=n-insert;
            insert++;
            total++;
            
        }
        if(n==0)return total;
        
        
        return total-1;
    }
}