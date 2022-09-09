class Solution {
    public static void Arrange(int[][]arr, int row, int clm){
       for(int i=0; i<arr[row].length; i++){
           arr[row][i]=0;
       }
        for(int i=0; i<arr.length; i++){
            arr[i][clm]=0;
        }
    }
    public void setZeroes(int[][] arr) {
        int[][]temp= new int[arr.length][arr[0].length];
        
                for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                temp[i][j]=1;
            }
        }
        
        
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                if(arr[i][j]==0){
                    Arrange(temp,i,j);
                    
                }
            }
        }
        
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
          if(temp[i][j]==0)arr[i][j]=0;
            }
        }
    }
}