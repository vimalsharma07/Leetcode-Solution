class Solution {
    public double findMedianSortedArrays(int[] num1, int[] num2) {
        int m= num1.length;
        int n= num2.length;
        
      int[]ans= new int[m+n];
        int i=0; 
        int j=0;
        int idx=0;
        
        while(i<m && j<n){
            if(num1[i]<num2[j]){
                ans[idx++]=num1[i++];
            }else{
                ans[idx++]=num2[j++];
            }
        }
        while(i<m){
           ans[idx++]=num1[i++]; 
        }
        
         while(j<n){
           ans[idx++]=num2[j++]; 
        }
        System.out.print(m+n );
        if((m+n) %2!=0){
            int mid= (m+n)/2;
            return ans[mid];
        }
        
        
        int beech= (m+n)/2;
        int beech2= beech-1;
        double a= ans[beech]+ans[beech2];
        return a/2;
        
    }
}