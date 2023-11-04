package solution2;

public class LinkedList {

	private Node head;

	public LinkedList() {
		head = null;
	}

	public void addFirst(int data) {
		Node nn = new Node(data);
		if (isEmpty())
			head = nn;
		else {
			nn.next = head;
			head = nn;
		}
	}

	public int deleteFirst() {
		if (isEmpty()) {
			System.out.println("List is Empty");
			return -1;
		} else {
			int val = head.data;
			head = head.next;
			return val;
		}
	}

	public int getFirst() {
		if (isEmpty()) {
			System.out.println("List is Empty");
			return -1;
		} else {
			return head.data;
		}
	}

	public boolean isEmpty() {
		return head == null;
	}
}
