class MyStack {
    Queue<Integer> qu=new LinkedList<>();

    public MyStack() {
        
    }
    
    public void push(int x) {
        qu.add(x);
        int s=qu.size();
        for(int i=0;i<s-1;i++)
        {
            qu.add(qu.poll());
        }
    }
    public int pop() {
        int n=qu.peek();
        qu.poll();
        return n;
    }
    
    public int top() {
        return qu.peek();
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