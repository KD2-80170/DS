package solution7;

public class Stack {
	
	private final int SIZE;
	private int [] arr;
	private int top;
	
	public Stack(int size) {
		top = -1;
		SIZE = size;
		arr = new int[SIZE];
	}
	
	public void push(int val) {
		
		if( ! isEmpty()  && arr[top] >= val)
		{
			int temp = arr[top];
			arr[top] = val;
			val = temp;			
		}
		top++;
		arr[top] = val;
	}
	public int pop() {
		top--;
		return arr[top+1];
	}
	
	public int  peek() {
		return arr[top];
	}
	
	public boolean isFull() {
		return top == SIZE;
	}
	public boolean isEmpty() {
		return top == -1;
	}

}
