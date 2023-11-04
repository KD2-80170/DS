package solution2;


public class SinglyCircular {

	private class Node {
		private Node next;
		private int data;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	private Node tail;
	
	public SinglyCircular() {
		tail = null;
	}

	public boolean isEmpty() {
		return tail == null;
	}

	public void addFirst(int value) {
		Node nn = new Node(value);
		if (isEmpty()) {
			tail = nn;
			tail.next = nn;
		} else if (tail.next == tail) {
			nn.next = tail;
			tail.next = nn;
		} else {
			nn.next = tail.next;
			tail.next = nn;
		}
	}

	public void addlast(int value) {
		Node nn = new Node(value);
		if (isEmpty()) {
			tail = nn;
			tail.next = tail;
		} else if (tail.next == tail) {
			tail.next = nn;
			nn.next = tail;
			tail = nn;
		} else {
			nn.next = tail.next;
			tail.next = nn;
			tail = nn;
		}
	}

	public void addInBetween(int value, int pos) {

	}

	public void deleteFirst() {
		if (isEmpty())
			System.out.println("List is Empty.");
		else if (tail.next == tail) {
			tail = null;
		} else {
			tail.next = tail.next.next;
		}

	}

	public void deleteLast() {
		if (isEmpty())
			System.out.println("List is Empty.");
		else if (tail.next == tail) {
			tail = null;
		} else {
			Node trav = tail.next;
			for (; trav.next != tail; trav = trav.next) {
			}
			trav.next = tail.next;
			tail = trav;

		}
	}

	public void deleteBetween() {
	}

	public void display() {
		if (isEmpty())
			System.out.println("Empty LinkedList.");
		for (Node trav = tail.next; trav != tail; trav = trav.next) {
			System.out.print(trav.data + " ");
			trav = trav.next;
		}
	}

}
