class Solution {
    public static boolean Check(String str){
        int n= str.length();
        
         String line1= "QWERTYUIOPqwertyuiop";
        
        String line2= "ASDFGHJKLasdfghjkl";
        
        String line3= "ZXCVBNMzxcvbnm";
        // we will check the str is contains in any one line or not and check the three line1, line2, line 3
       
        
       int count1=0;
        int count2=0;
        int count3=0;
        
       for(int i=0; i<n; i++){
          char temp= str.charAt(i) ;
            
        for(char ch : line1.toCharArray()){
                 if(temp==ch)count1++;
            
         }
        }
        if(count1==n)return true;
       
        
         
       for(int i=0; i<n; i++){
          char temp= str.charAt(i) ;
            
        for(char ch : line2.toCharArray()){
                 if(temp==ch)count2++;
            
         }
        }
        if(count2==n)return true;
        
        
         for(int i=0; i<n; i++){
          char temp= str.charAt(i) ;
            
        for(char ch : line3.toCharArray()){
                 if(temp==ch)count3++;
            
         }
        }
        if(count3==n)return true;
        
        return false;
        
    }
    public String[] findWords(String[] words) {
       
        ArrayList<String> list = new ArrayList<>();
        
        int n= words.length;
        for(int i=0; i<n; i++){
           if(Check(words[i])) {
               list.add(words[i]);
             
           }
        }
        
        String[]arr= new String[list.size()];
        
        for(int i=0; i<list.size(); i++){
         arr[i] = list.get(i);
        }
        
        
        return arr;
    }
}