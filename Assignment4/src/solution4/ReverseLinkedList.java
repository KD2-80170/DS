package solution4;
public class ReverseLinkedList {

	Node reverseList(Node head) {
		Node curr = head;
		Node prev = null;
		Node next = null;
		
		while (curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		return prev;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
