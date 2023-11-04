package solution7;

public class QueueByStack {
	private Stack stack1;
    private Stack stack2;

    public QueueByStack(int size) {
        stack1 = new Stack(size);
        stack2 = new Stack(size);
    }

    public void push(int value) {
        
        stack1.push(value);
    }

    public int pop() {
       

        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        return stack2.pop();
    }

    public int peek() {
      
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        return stack2.peek();
    }

    public boolean isEmpty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }

    public boolean isFull() {
        return stack1.isFull();
    }

}
