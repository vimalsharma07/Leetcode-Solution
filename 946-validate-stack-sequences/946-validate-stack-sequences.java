class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
       
        int n= pushed.length;
        Stack<Integer> st= new Stack<>();
        
        int i=0; int j=0;
        while(i<n && j<n){
            st.push(pushed[i]);
            while(!st.isEmpty()&& st.peek()==popped[j]){
                st.pop();
                j++;
            }
            i++;
        }
        return st.isEmpty();
    }
}