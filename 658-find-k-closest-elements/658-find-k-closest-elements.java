class Solution {
   public List<Integer> findClosestElements(int[] arr, int k, int x) {
		int n= arr.length;
       int s=0; int e=n-1;
       
       List<Integer> list = new ArrayList<>();
       
       // lets find the index where our values exists 
       while(e-s>=k){
           if(Math.abs(x-arr[e]) >= Math.abs(x-arr[s])){
               e--;
           }else{
               s++;
           }
       }
       // we have find our answer arrey exists index s to index e 
       for(int i=s; i<=e; i++,s++){
           list.add(arr[s]);
       }
       return list;
	}
}