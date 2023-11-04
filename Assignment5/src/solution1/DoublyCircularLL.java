package solution1;

public class DoublyCircularLL {

	private Node head;
	private int length;

	public DoublyCircularLL() {
		head = null;
		length = 0;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public void addAtPos(int data, int pos) {
		Node nn = new Node(data);
		if (isEmpty() && pos == 1) {
			head = nn;
			head.next = head;
			head.prev=head;
			length++;
			return;
		}
		if (pos < 1 || pos > length+1) {
			System.out.println("Invalid Position.");
			return;
			
		}
		else if(head==head.next)
		{
			nn.next=head;
			nn.prev=head;
			head.next=nn;
			head.prev=nn;
			head=nn;
			length++;
		}
		//addLast
		else if (pos == length+1) {
			Node trav = head;
			for (int i = 1; i < pos - 1; i++) {
				trav = trav.next;
			}
			nn.next=head;
			nn.prev=trav;
			trav.next=nn;
			head.prev=nn;
			length++;
		}//Middle element
		else {
			Node trav = head;
			for (int i = 1; i < pos - 1; i++) {
				trav = trav.next;
			}

			Node temp = trav.next;
			trav.next = nn;
			nn.next = temp;
			nn.prev = trav;
			temp.prev = nn;
			length++;
		}
	}

	public void deleteAtPos(int pos) {
		if(isEmpty()) {
			System.out.println("List is Empty.");
			return;
		}
		if(pos<1 || pos>length) {
			System.out.println("Invalid position.");
			return;
		}
		if(pos==1 && length==1)
		{
			head=null;
		}
		else if(pos ==1 && length>1) {
			Node lastNode=head.prev;
			
			head=head.next;
			lastNode.next=head;
			head.prev=lastNode;
		}
		else if(pos>1 && pos<=length)
		{
			Node trav=head;
			for(int i=1;i<pos;i++)
			{
				trav=trav.next;
			}
			
			trav.prev.next=trav.next;
			trav.next.prev=trav.prev;
		}
		else {
			Node lastNode =head.prev;
			
			lastNode.prev.next=head;
			head.prev=lastNode.prev;
		}
		length--;
	}

	public void display() {
		Node trav = head;
		do {
			System.out.print(trav.data + " ");
			trav = trav.next;
		} while (trav != head);
	}
}
