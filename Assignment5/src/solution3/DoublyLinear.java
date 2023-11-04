package solution3;

public class DoublyLinear {

	public class Node {
		int data;
		Node prev;
		Node next;

		public Node(int data) {
			this.data = data;
			prev = null;
			next = null;
		}
	}

	private Node head;

	public DoublyLinear() {
		head = null;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public void addFirst(int data) {
		Node nn = new Node(data);
		if (isEmpty()) {
			head = nn;
		} else {
			head.prev = nn;
			nn.next = head;
			head = nn;
		}
	}

	public int delFirst() {
		if (isEmpty()) {
			System.out.println("List is Empty");
			return -1;
		}
		int data = head.data;
		head = head.next;
		return data;
	}

	public void addLast(int data) {
		Node nn = new Node(data);
		if (isEmpty()) {
			head = nn;
		} else {
			Node lastNode = head.prev;
			nn.prev = lastNode;
			nn.next = head;
			lastNode.next = nn;
			head.prev = nn;

		}

	}

	public int deleteLast() {
		if (isEmpty()) {
			System.out.println("List is Empty");
			return -1;
		}
		if (head.next == null) {
			int data = head.data;
			head = null;
			return data;
		} else {
			Node lasNode = head.prev;
			int data = lasNode.data;
			lasNode.prev.next = null;
			return data;

		}
	}
}
