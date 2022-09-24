class Solution {
   
    public int countPrimes(int n) {
       boolean[]check= new boolean[n];
        
        int count=0;
        
        Arrays.fill(check,true);
        
        for(int i=2; i*i<=n; i++){
            for(int j=i+i; j<n; j=j+i){
                check[j]=false;
            }
        }
        
        for(int i=2; i<n; i++ ){
            if(check[i]==true)count++;
        }
        return count;
    }
}