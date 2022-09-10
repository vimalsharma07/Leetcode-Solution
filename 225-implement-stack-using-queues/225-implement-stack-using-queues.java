class MyStack {
Queue<Integer> qu;

    public MyStack() {
       qu= new LinkedList<>();
    }
    
    public void push(int x) {
        qu.add(x);
    }
    
    public int pop() { //O(n)
        int n= qu.size();
        
        for(int i=0; i<n-1; i++){
           qu.add(qu.remove()) ;
            
        }
        return qu.remove();
    }
    
    public int top() { //O(n)
        int n= qu.size();
        for(int i=0; i<n-1; i++){
            qu.add(qu.remove());
        }
        int val= qu.peek();
        qu.add(qu.remove());
        return val;
        
    }
    
    public boolean empty() {
        return qu.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */