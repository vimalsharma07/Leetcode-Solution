class Solution {
   static  String[]arr= {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public List<String> letterCombinations(String digits) {
        
        // if there is nothing in digits 
        if(digits.length()==0){
            List<String> temp= new ArrayList<>();
            return temp;
        }
        
        // otherwise we will return that we find from Helper Function
        return Helper(digits);
    }
    public  static List<String> Helper(String digits){
        // base case hits when digits length ==0
        if(digits.length()==0){
            List<String> base= new ArrayList<>();
            base.add("");
            return base;
        }
        
     // our faith is that Helper function will give the result of String 1 to n index    
    List<String>faith=  Helper(digits.substring(1));
        
        List<String> ans= new ArrayList<>();
        
        int digit =  digits.charAt(0)-'0'; // which digit button we will press
        
        String on_digit= arr[digit]; // find the string of that digit 
        
        for(char ch : on_digit.toCharArray()){
            
            for(String str : faith){
                ans.add(ch+str);
            }
        }
       return ans; 
    }
}