package solution5;

public class SinglyLinear {

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

	public SinglyLinear() {
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

	public static Node findMid(Node head) {
		Node fast = head;
		Node slow = head;

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}

		return slow;
	}

	public void insertBefore(int Nodeval, int data) {
		Node temp = head;
		Node nn = new Node(data);

		if (temp.next == null && temp.data == Nodeval) {
			nn.next = temp;
			head = nn;
			return;
		}

		while (temp != null && temp.next != null) {
			if (temp.next.data == Nodeval) {
				Node nextNode = temp.next;
				temp.next = nn;
				nn.next = nextNode;
				return;
			}
			temp = temp.next;
		}

		System.out.println("Node with value " + Nodeval + " not found.");
	}

	public void insertAfter(int Nodeval, int data) {
		Node temp = head;
		Node nn = new Node(data);

		if (temp.next == null && temp.data == Nodeval) {
			temp.next = nn;
			return;
		}
		while (temp != null) {
			if (temp.data == Nodeval) {
				Node nextNode = temp.next;
				temp.next = nn;
				nn.next = nextNode;
				return;
			}
			temp = temp.next;
		}
		System.out.println("Node with value " + Nodeval + " not found.");
	}

	public void display() {
		for (Node temp = head; temp != null; temp = temp.next)
			System.out.print(temp.data + " ");
	}
}
