class MinStack {

    static class Node {
        int val;
        int min;

        Node(int val, int min) {
            this.val = val;
            this.min = min;
        }
    }

    Stack<Node> stack = new Stack<>();

    public void push(int val) {
        if (stack.isEmpty()) {
            stack.push(new Node(val, val));
        } else {
            int min = Math.min(val, stack.peek().min);
            stack.push(new Node(val, min));
        }
    }

    public void pop() {
        stack.pop();
    }

    public int top() {
        return stack.peek().val;
    }

    public int getMin() {
        return stack.peek().min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */