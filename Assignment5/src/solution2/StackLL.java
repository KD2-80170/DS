package solution2;

//2. Implement stack and queue using linked list.
public class StackLL {
	
	LinkedList ll=new LinkedList();
	
	public void push(int data)
	{
		ll.addFirst(data);
	}
	
	public int pop()
	{
		return ll.deleteFirst();
	}
	
	public int peek()
	{
		return ll.getFirst();
	}
}
