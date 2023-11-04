package solution2;
public class QueueLL {
	
	java.util.LinkedList<Integer> ll=new java.util.LinkedList();
	
	
	public void enqueue(int data)
	{
		ll.add(data);
	}
	
	public int dequeue()
	{
		if(ll.isEmpty()) {
			System.out.println("Queue is Empty.");
			return -1;
		}
		return ll.removeLast();
	}
	
	public int getFront()
	{
		if(ll.isEmpty()) {
			System.out.println("Queue is Empty.");
			return -1;
		}
		return ll.getFirst();
	}
}
