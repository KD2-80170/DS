package com.solution_6;


public class StackByQueue {
	private Queue queue1;
    private Queue queue2;

    public StackByQueue(int size) {
        queue1 = new Queue(size);
        queue2 = new Queue(size);
    }

    public void push(int data) {
        while (!queue1.isEmpty()) {
            int item = queue1.pop();
            queue2.push(item);
        }
        queue1.push(data);
        while (!queue2.isEmpty()) {
            int item = queue2.pop();
            queue1.push(item);
        }
    }

    public int pop() {
        
        return queue1.pop();
    }

    public int peek() {
        
        return queue1.peek();
    }

	public boolean isFull() {
		return queue1.isFull();
	}

	public boolean isEmpty() {
		return queue1.isEmpty();
	}

}

