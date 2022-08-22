class MyQueue {
    private Stack<Integer> stk1;
    public MyQueue() {
        stk1 = new Stack<>();
    }
    
    public void push(int x) {
        Stack<Integer> stk2 = new Stack<>();
        while(!stk1.isEmpty()){
            stk2.add(stk1.pop());
        }
        stk2.add(x);
        while(!stk2.isEmpty()){
            stk1.add(stk2.pop());
        }
    }
    
    public int pop() {
        return stk1.pop();
    }
    
    public int peek() {
        return stk1.peek();
    }
    
    public boolean empty() {
        return stk1.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */