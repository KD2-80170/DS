package solution3;

public class Deque {
		
	DoublyLinear ll=new DoublyLinear();
	
	public int deleteLast()
	{
		return ll.deleteLast();
	}
	
	public int deleteFirst()
	{
		return ll.delFirst();
	}
	public void addFirst(int data)
	{
		ll.addFirst(data);
	}
	public void addLast(int data)
	{
		ll.addLast(data);
	}
}
