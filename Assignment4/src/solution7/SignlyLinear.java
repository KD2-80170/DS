package solution7;

import java.util.Stack;

public class SignlyLinear {
//	Implement addFirst(), addLast(), delFirst(), delLast, display() operations.

	private class Node {
		Node next;
		int data;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	private Node head;
	private Node tail;
	
	
	public SignlyLinear() {
		this.head = null;
		this.tail = null;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public void addFirst(int value) {
		Node nn = new Node(value);
		if (isEmpty()) {
			head = nn;
			tail = nn;
		} else {
			nn.next = head;
			head = nn;
		}
	}

	public void addLast(int value) {
		Node nn = new Node(value);
		if (isEmpty()) {
			head = nn;
			tail = nn;
		} else {
			tail.next = nn;
			// MISTAKE FORGOT
			tail = nn;
		}
	}

	public void delFirst() {
		if (isEmpty())
			System.out.println("LinkedList is Empty.");
		else if (head.next == null) {
			head = null;
			tail = null;
		} else {
			head = head.next;
		}

	}

	public void delLast() {
		if (isEmpty())
			System.out.println("LinkedList is Empty.");
		else if (head.next == null) {
			head = null;
			tail = null;
		} else {
			Node temp = head;
			while (temp.next != tail) {
				temp = temp.next;
			}
			temp.next = null;
			tail = temp;
		}
	}
	
	public  Node findMid(Node head) {
		Node fast = head;
		Node slow = head;

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}

		return slow;
	}
	
	public void reverse()
	{
		Stack<Integer> st=new Stack<>();
		
		Node temp=head;
		while(temp!=null)
		{
			st.push(temp.data);
			temp=temp.next;
		}
		
		while(!st.isEmpty())
			System.out.print(st.pop()+" ");
	}

	public void display() {
		for (Node temp = head; temp != tail; temp = temp.next)
			System.out.print(temp.data + " ");
	}

}
