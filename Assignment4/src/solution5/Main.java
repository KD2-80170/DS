package solution5;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		5. In singly linear list implement following operations.
//		i. insert a new node after a given node
//		ii. insert a new node before a given node

		SinglyLinear l1 = new SinglyLinear();

		l1.addLast(10);

		l1.display();

		System.out.println();
		l1.insertAfter(10, 15);
		l1.display();
	}

}
