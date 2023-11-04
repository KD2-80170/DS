package solution1;

public class Main {

	public static void main(String[] args) {
		DoublyCircularLL l1=new DoublyCircularLL();
		
		l1.addAtPos(10,1);
		l1.addAtPos(20,1);
		l1.addAtPos(30, 2);
		l1.addAtPos(40, 4);
		l1.display();
		
//		l1.deleteAtPos(1);
		l1.deleteAtPos(3);
		
		System.out.println();
		l1.display();
		
		
	}

}
