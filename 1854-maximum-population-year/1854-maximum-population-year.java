class Solution {
    public int maximumPopulation(int[][] logs) {
        int n= logs.length;
        int[]year= new int[2051];
        
        for(int[]log:logs){
            int start= log[0];
            int end= log[1];
            for(int i=start; i<=end; i++){
                year[i]++;
            }
            year[end]--;
        }
        int ans=0; int temp_year=0;
        for(int j =0; j<2051; j++){
            if(year[j]>ans){
                temp_year=j;
                ans=year[j];
            }
        }
        


        return temp_year;
    }
}